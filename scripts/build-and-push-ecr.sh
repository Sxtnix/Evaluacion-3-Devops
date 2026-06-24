#!/bin/bash

# Salir si ocurre un error
set -e

# Configuración
AWS_REGION="us-east-1"

# Verificar si se ingresó el Account ID
if [ -z "$1" ]; then
    echo "Uso: ./build-and-push-ecr.sh <AWS_ACCOUNT_ID>"
    exit 1
fi

AWS_ACCOUNT_ID=$1
ECR_REGISTRY="${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com"

echo "=============================================="
echo "1. Compilando microservicios con Maven..."
echo "=============================================="
mvn clean package -DskipTests

# Lista de microservicios y sus nombres de carpeta / imágenes
MICROSERVICES=(
    "ms-ADMP:healthtech-admp"
    "ms-CITAS:healthtech-citas"
    "ms-ESPECIALIDAD:healthtech-especialidad"
    "ms-EXAMEN:healthtech-examen"
    "ms-FARMACIA:healthtech-farmacia"
    "ms-FICHA:healthtech-ficha"
    "ms-HOSPITALIZACION:healthtech-hospitalizacion"
    "ms-INVENTARIO:healthtech-inventario"
    "ms-PERSONAL:healthtech-personal"
    "ms-PROVEEDOR:healthtech-proveedor"
    "ms-RECETA:healthtech-receta"
)

echo "=============================================="
echo "2. Iniciando sesión en Amazon ECR..."
echo "=============================================="
aws ecr get-login-password --region $AWS_REGION | docker login --username AWS --password-stdin $ECR_REGISTRY

echo "=============================================="
echo "3. Creando repositorios ECR (si no existen) y subiendo imágenes..."
echo "=============================================="

for item in "${MICROSERVICES[@]}"; do
    DIR="${item%%:*}"
    IMAGE_NAME="${item##*:}"
    
    echo "----------------------------------------------"
    echo "Procesando $IMAGE_NAME (directorio $DIR)..."
    echo "----------------------------------------------"
    
    # Crear repositorio en ECR si no existe
    aws ecr create-repository --repository-name $IMAGE_NAME --region $AWS_REGION || true
    
    # Construir imagen Docker
    docker build -t $IMAGE_NAME ./$DIR
    
    # Etiquetar imagen para ECR
    docker tag $IMAGE_NAME:latest $ECR_REGISTRY/$IMAGE_NAME:latest
    
    # Subir imagen a ECR
    docker push $ECR_REGISTRY/$IMAGE_NAME:latest
done

echo "=============================================="
echo "4. Actualizando healthtech-all.yml con tu Account ID..."
echo "=============================================="
# Reemplazar el Account ID viejo en el archivo de kubernetes
sed -i "s/[0-9]\{12\}\.dkr\.ecr\./${AWS_ACCOUNT_ID}.dkr.ecr./g" k8s/k8s/healthtech-all.yml

echo "¡Proceso completado con éxito!"
echo "Ahora puedes desplegar en tu clúster de Kubernetes usando:"
echo "kubectl apply -f k8s/k8s/healthtech-all.yml"

#!/bin/bash

echo "Iniciando redirección de puertos (Port-Forward) para todos los microservicios..."
echo "Presiona Ctrl+C para detener todos los reenvíos."

# Función para detener todos los procesos en segundo plano al salir
cleanup() {
    echo "Deteniendo port-forwards..."
    kill $(jobs -p) 2>/dev/null
    exit
}
trap cleanup SIGINT SIGTERM

# Port-forwards
kubectl port-forward svc/healthtech-admp-service 8081:8081 &
kubectl port-forward svc/healthtech-citas-service 8082:8082 &
kubectl port-forward svc/healthtech-especialidad-service 8083:8083 &
kubectl port-forward svc/healthtech-examen-service 8084:8084 &
kubectl port-forward svc/healthtech-farmacia-service 8085:8085 &
kubectl port-forward svc/healthtech-ficha-service 8086:8086 &
kubectl port-forward svc/healthtech-hospitalizacion-service 8087:8087 &
kubectl port-forward svc/healthtech-inventario-service 8088:8088 &
kubectl port-forward svc/healthtech-personal-service 8089:8089 &
kubectl port-forward svc/healthtech-proveedor-service 8090:8090 &
kubectl port-forward svc/healthtech-receta-service 8091:8091 &

# Mantener el script en ejecución
wait

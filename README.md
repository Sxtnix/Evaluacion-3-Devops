HealthTech - Proyecto DevOps con AWS y Kubernetes
Introducción

El presente proyecto tiene como objetivo implementar una solución basada en microservicios utilizando herramientas DevOps para automatizar el proceso de despliegue y administración de aplicaciones en la nube.

Para ello se desarrolló una arquitectura compuesta por distintos microservicios pertenecientes al sistema HealthTech, los cuales fueron contenerizados mediante Docker y posteriormente desplegados en un clúster Kubernetes administrado por Amazon Elastic Kubernetes Service (EKS).

Además, se utilizó GitHub Actions para automatizar tareas relacionadas con integración y despliegue continuo, permitiendo mantener una infraestructura más organizada y fácil de administrar.

Arquitectura del Proyecto

La solución está compuesta por los siguientes microservicios:

ADMP
CITAS
ESPECIALIDAD
EXAMEN
FARMACIA
FICHA
HOSPITALIZACIÓN
INVENTARIO
PERSONAL
PROVEEDOR
RECETA

Cada microservicio fue construido como una aplicación independiente utilizando Spring Boot y desplegado dentro del clúster Kubernetes mediante Deployments y Services.

Adicionalmente se implementó una base de datos MySQL para el almacenamiento de información utilizada por los servicios.

Tecnologías Utilizadas
Backend
Java 21
Spring Boot
Maven
Contenedores
Docker
Amazon Elastic Container Registry (ECR)
Orquestación
Kubernetes
Amazon Elastic Kubernetes Service (EKS)
Automatización
GitHub Actions
GitHub Secrets
Base de Datos
MySQL 8
Control de Versiones
Git
GitHub
Desarrollo del Proyecto

Durante el desarrollo se realizaron las siguientes actividades:

1. Creación de Microservicios

Se configuraron los distintos microservicios de HealthTech utilizando Spring Boot, definiendo controladores, servicios y entidades para cada módulo.

2. Contenerización

Cada microservicio fue empaquetado en una imagen Docker mediante un Dockerfile propio, permitiendo su ejecución de forma independiente.

3. Registro de Imágenes

Las imágenes generadas fueron publicadas en Amazon ECR para su posterior utilización dentro del clúster Kubernetes.

4. Configuración de Kubernetes

Se crearon manifiestos YAML para:

Deployments
Services
Base de datos MySQL
Namespace HealthTech

Esto permitió desplegar cada componente de forma organizada dentro del clúster.

5. Configuración del Clúster AWS

Se utilizó Amazon EKS para administrar los contenedores y asegurar una ejecución estable de los microservicios.

6. Automatización CI/CD

Se configuró GitHub Actions para ejecutar automáticamente tareas de integración y despliegue a partir de los cambios realizados en el repositorio.

También se utilizaron GitHub Secrets para almacenar credenciales y configuraciones sensibles.

7. Escalabilidad

Se implementó Horizontal Pod Autoscaler (HPA) para demostrar la capacidad de escalamiento automático de Kubernetes.

Evidencias de Funcionamiento

Se verificó el correcto funcionamiento del proyecto mediante:

Estado de Pods en ejecución.
Estado de Services creados.
Verificación del Namespace HealthTech.
Acceso a endpoints REST.
Conectividad entre microservicios.
Ejecución exitosa de Deployments.
Validación de Horizontal Pod Autoscaler.
Revisión de imágenes almacenadas en Amazon ECR.
Ejecución de flujos GitHub Actions.
Resultados Obtenidos

Como resultado se logró desplegar exitosamente una arquitectura basada en microservicios utilizando Kubernetes sobre AWS.

Todos los servicios fueron ejecutados dentro del clúster EKS y gestionados mediante Deployments y Services, permitiendo una administración centralizada de los recursos.

La utilización de Docker, GitHub Actions y Kubernetes permitió aplicar conceptos fundamentales de DevOps relacionados con automatización, despliegue continuo, escalabilidad y administración de infraestructura en la nube.

Conclusión

Este proyecto permitió aplicar de manera práctica los conocimientos adquiridos durante el curso de Introducción a Herramientas DevOps.

A través del uso de AWS, Docker, Kubernetes y GitHub Actions fue posible construir un entorno funcional basado en microservicios, automatizando gran parte del proceso de despliegue y administración de la aplicación.

La implementación realizada demuestra cómo las prácticas DevOps contribuyen a mejorar la eficiencia, escalabilidad y mantenibilidad de aplicaciones modernas ejecutadas en la nube.
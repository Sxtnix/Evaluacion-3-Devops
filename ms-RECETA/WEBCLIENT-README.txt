Agregar esta dependencia al pom.xml de ms-RECETA

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>

Este microservicio ahora tiene:
- WebClientConfig
- ConexionService
- Comunicación con:
- ms-FARMACIA
- ms-INVENTARIO
- ms-FICHA
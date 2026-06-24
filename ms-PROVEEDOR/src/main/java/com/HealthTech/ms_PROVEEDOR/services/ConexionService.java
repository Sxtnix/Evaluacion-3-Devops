package com.HealthTech.ms_PROVEEDOR.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ConexionService {

    private final WebClient webClient;

    public ConexionService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> probarConexion() {

        Mono<String> llamada1 = webClient.get()
                .uri("http://localhost:8088/api/inventario")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Error ms-INVENTARIO");

        return llamada1
                .map(respuesta -> "Conexion OK -> " + respuesta)
                .onErrorReturn("Error al conectar microservicio");
    }
}
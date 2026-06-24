package com.HealthTech.ms_FICHA.services;

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

        return webClient.get()
                .uri("http://localhost:8082/api/citas")
                .retrieve()
                .bodyToMono(String.class)
                .map(respuesta -> "Conexion OK -> " + respuesta)
                .onErrorReturn("Error ms-CITAS");
    }
}
package com.HealthTech.ms_RECETA.services;

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
                .uri("http://localhost:8085/api/farmacia")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Error ms-FARMACIA");

        Mono<String> llamada2 = webClient.get()
                .uri("http://localhost:8088/api/inventario")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Error ms-INVENTARIO");

        Mono<String> llamada3 = webClient.get()
                .uri("http://localhost:8086/api/fichas/paciente/1")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Error ms-FICHA");

        return Mono.zip(llamada1, llamada2, llamada3)
                .map(data -> "Conexion OK -> "
                        + data.getT1() + " | "
                        + data.getT2() + " | "
                        + data.getT3());
    }
}
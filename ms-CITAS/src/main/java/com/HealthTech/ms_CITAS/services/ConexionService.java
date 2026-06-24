package com.HealthTech.ms_CITAS.services;

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
                .uri("http://localhost:8089/api/personal")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Error ms-PERSONAL");
        Mono<String> llamada2 = webClient.get()
                .uri("http://localhost:8083/api/especialidades")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Error ms-ESPECIALIDAD");

        return Mono.zip(llamada1, llamada2)
                .map(data -> "Conexion OK -> " + data.getT1() + " | " + data.getT2());
    }
}
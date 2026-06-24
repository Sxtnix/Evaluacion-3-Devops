package com.HealthTech.ms_CITAS.controllers;

import com.HealthTech.ms_CITAS.model.Cita;
import com.HealthTech.ms_CITAS.services.CitaService;
import com.HealthTech.ms_CITAS.services.ConexionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    @Autowired
    private CitaService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping
    public List<Cita> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public Cita agendar(@RequestBody Cita cita) {
        return service.guardar(cita);
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
package com.HealthTech.ms_FICHA.controllers;

import com.HealthTech.ms_FICHA.model.FichaClinica;
import com.HealthTech.ms_FICHA.services.ConexionService;
import com.HealthTech.ms_FICHA.services.FichaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/fichas")
public class FichaController {

    @Autowired
    private FichaService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping("/paciente/{pacienteId}")
    public List<FichaClinica> obtenerHistorial(@PathVariable Long pacienteId) {
        return service.listarPorPaciente(pacienteId);
    }

    @PostMapping
    public FichaClinica crear(@RequestBody FichaClinica ficha) {
        return service.guardar(ficha);
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
package com.HealthTech.ms_RECETA.controllers;

import com.HealthTech.ms_RECETA.model.RecetaMedica;
import com.HealthTech.ms_RECETA.services.ConexionService;
import com.HealthTech.ms_RECETA.services.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/recetas")
public class RecetaController {

    @Autowired
    private RecetaService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping("/paciente/{pacienteId}")
    public List<RecetaMedica> obtenerRecetas(@PathVariable Long pacienteId) {
        return service.listarPorPaciente(pacienteId);
    }

    @PostMapping
    public RecetaMedica crear(@RequestBody RecetaMedica receta) {
        return service.emitir(receta);
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
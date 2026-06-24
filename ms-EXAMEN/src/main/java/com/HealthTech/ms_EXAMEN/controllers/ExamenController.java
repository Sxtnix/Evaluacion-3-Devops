package com.HealthTech.ms_EXAMEN.controllers;

import com.HealthTech.ms_EXAMEN.model.ExamenMedico;
import com.HealthTech.ms_EXAMEN.services.ConexionService;
import com.HealthTech.ms_EXAMEN.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/examenes")
public class ExamenController {

    @Autowired
    private ExamenService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping
    public List<ExamenMedico> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public ExamenMedico crear(@RequestBody ExamenMedico examen) {
        return service.guardar(examen);
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
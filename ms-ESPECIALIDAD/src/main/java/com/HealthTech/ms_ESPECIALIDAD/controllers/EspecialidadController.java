package com.HealthTech.ms_ESPECIALIDAD.controllers;

import com.HealthTech.ms_ESPECIALIDAD.model.Especialidad;
import com.HealthTech.ms_ESPECIALIDAD.services.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadController {
    @Autowired
    private EspecialidadService service;

    @GetMapping
    public List<Especialidad> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public Especialidad crear(@RequestBody Especialidad especialidad) {
        return service.guardar(especialidad);
    }
}
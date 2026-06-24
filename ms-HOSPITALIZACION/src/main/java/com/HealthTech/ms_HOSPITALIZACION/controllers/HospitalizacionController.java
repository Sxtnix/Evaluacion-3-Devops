package com.HealthTech.ms_HOSPITALIZACION.controllers;

import com.HealthTech.ms_HOSPITALIZACION.model.Hospitalizacion;
import com.HealthTech.ms_HOSPITALIZACION.services.ConexionService;
import com.HealthTech.ms_HOSPITALIZACION.services.HospitalizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/hospitalizacion")
public class HospitalizacionController {

    @Autowired
    private HospitalizacionService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping
    public List<Hospitalizacion> obtenerTodas() {
        return service.listarIngresados();
    }

    @PostMapping
    public Hospitalizacion ingresarPaciente(@RequestBody Hospitalizacion hospitalizacion) {
        return service.registrar(hospitalizacion);
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
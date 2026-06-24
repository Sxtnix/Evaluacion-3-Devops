package com.HealthTech.ms_FARMACIA.controllers;

import com.HealthTech.ms_FARMACIA.model.Medicamento;
import com.HealthTech.ms_FARMACIA.services.ConexionService;
import com.HealthTech.ms_FARMACIA.services.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/farmacia")
public class MedicamentoController {

    @Autowired
    private MedicamentoService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping
    public List<Medicamento> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Medicamento crear(@RequestBody Medicamento medicamento) {
        return service.guardar(medicamento);
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
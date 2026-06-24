package com.HealthTech.ms_ADMP.controllers;

import com.HealthTech.ms_ADMP.model.Paciente;
import com.HealthTech.ms_ADMP.services.ConexionService;
import com.HealthTech.ms_ADMP.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping
    public List<Paciente> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Paciente crear(@RequestBody Paciente paciente) {
        return service.guardar(paciente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscarPorId(@PathVariable Long id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
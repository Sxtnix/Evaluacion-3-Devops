package com.HealthTech.ms_PROVEEDOR.controllers;

import com.HealthTech.ms_PROVEEDOR.model.Proveedor;
import com.HealthTech.ms_PROVEEDOR.services.ConexionService;
import com.HealthTech.ms_PROVEEDOR.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping
    public List<Proveedor> listar() {
        return service.listarProveedores();
    }

    @PostMapping
    public Proveedor registrar(@RequestBody Proveedor proveedor) {
        return service.guardar(proveedor);
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
package com.HealthTech.ms_INVENTARIO.controllers;

import com.HealthTech.ms_INVENTARIO.model.Insumo;
import com.HealthTech.ms_INVENTARIO.services.ConexionService;
import com.HealthTech.ms_INVENTARIO.services.InsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InsumoController {

    @Autowired
    private InsumoService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping
    public List<Insumo> obtenerInventario() {
        return service.listarTodo();
    }

    @PostMapping
    public Insumo agregarOActualizar(@RequestBody Insumo insumo) {
        return service.actualizarStock(insumo);
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
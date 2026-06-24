package com.HealthTech.ms_PERSONAL.controllers;

import com.HealthTech.ms_PERSONAL.model.PersonalSanitario;
import com.HealthTech.ms_PERSONAL.services.ConexionService;
import com.HealthTech.ms_PERSONAL.services.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/personal")
public class PersonalController {

    @Autowired
    private PersonalService service;

    @Autowired
    private ConexionService conexionService;

    @GetMapping
    public List<PersonalSanitario> listar() {
        return service.listarTodoElPersonal();
    }

    @PostMapping
    public PersonalSanitario registrar(@RequestBody PersonalSanitario personal) {
        return service.guardar(personal);
    }

    @GetMapping("/conexion")
    public Mono<String> probarConexion() {
        return conexionService.probarConexion();
    }
}
package com.HealthTech.ms_ESPECIALIDAD.services;

import com.HealthTech.ms_ESPECIALIDAD.model.Especialidad;
import com.HealthTech.ms_ESPECIALIDAD.repositories.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EspecialidadService {
    @Autowired
    private EspecialidadRepository repository;

    public List<Especialidad> listarTodas() {
        return repository.findAll();
    }

    public Especialidad guardar(Especialidad especialidad) {
        return repository.save(especialidad);
    }
}
package com.HealthTech.ms_HOSPITALIZACION.services;

import com.HealthTech.ms_HOSPITALIZACION.model.Hospitalizacion;
import com.HealthTech.ms_HOSPITALIZACION.repositories.HospitalizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HospitalizacionService {
    @Autowired
    private HospitalizacionRepository repository;

    public List<Hospitalizacion> listarIngresados() {
        return repository.findAll();
    }

    public Hospitalizacion registrar(Hospitalizacion hospitalizacion) {
        return repository.save(hospitalizacion);
    }
}
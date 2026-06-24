package com.HealthTech.ms_CITAS.services;

import com.HealthTech.ms_CITAS.model.Cita;
import com.HealthTech.ms_CITAS.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CitaService {
    @Autowired
    private CitaRepository repository;

    public List<Cita> listarTodas() { return repository.findAll(); }
    public Cita guardar(Cita cita) { return repository.save(cita); }
}
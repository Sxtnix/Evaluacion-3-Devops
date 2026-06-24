package com.HealthTech.ms_RECETA.services;

import com.HealthTech.ms_RECETA.model.RecetaMedica;
import com.HealthTech.ms_RECETA.repositories.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetaService {

    @Autowired
    private RecetaRepository repository;

    public List<RecetaMedica> listarPorPaciente(Long pacienteId) {
        return repository.findByPacienteId(pacienteId);
    }

    public RecetaMedica emitir(RecetaMedica receta) {
        return repository.save(receta);
    }
}
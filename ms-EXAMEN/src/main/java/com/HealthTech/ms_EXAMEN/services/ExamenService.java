package com.HealthTech.ms_EXAMEN.services;

import com.HealthTech.ms_EXAMEN.model.ExamenMedico;
import com.HealthTech.ms_EXAMEN.repositories.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamenService {

    @Autowired
    private ExamenRepository repository;

    public List<ExamenMedico> listarTodos() {
        return repository.findAll();
    }

    public ExamenMedico guardar(ExamenMedico examen) {
        return repository.save(examen);
    }
}
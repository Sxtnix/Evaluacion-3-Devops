package com.HealthTech.ms_FICHA.services;

import com.HealthTech.ms_FICHA.model.FichaClinica;
import com.HealthTech.ms_FICHA.repositories.FichaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FichaService {
    @Autowired
    private FichaRepository repository;

    public List<FichaClinica> listarPorPaciente(Long pacienteId) {
        return repository.findByPacienteId(pacienteId);
    }

    public FichaClinica guardar(FichaClinica ficha) {
        return repository.save(ficha);
    }
}
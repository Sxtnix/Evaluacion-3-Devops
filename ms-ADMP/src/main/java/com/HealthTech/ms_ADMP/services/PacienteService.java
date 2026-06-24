package com.HealthTech.ms_ADMP.services;

import com.HealthTech.ms_ADMP.model.Paciente;
import com.HealthTech.ms_ADMP.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    public Optional<Paciente> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Paciente guardar(Paciente paciente) {
        return repository.save(paciente);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
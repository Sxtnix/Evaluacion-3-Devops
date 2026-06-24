package com.HealthTech.ms_FARMACIA.services;

import com.HealthTech.ms_FARMACIA.model.Medicamento;
import com.HealthTech.ms_FARMACIA.repositories.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicamentoService {
    @Autowired
    private MedicamentoRepository repository;

    public List<Medicamento> listarTodos() {
        return repository.findAll();
    }

    public Medicamento guardar(Medicamento medicamento) {
        return repository.save(medicamento);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
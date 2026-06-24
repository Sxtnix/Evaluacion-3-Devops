package com.HealthTech.ms_INVENTARIO.services;

import com.HealthTech.ms_INVENTARIO.model.Insumo;
import com.HealthTech.ms_INVENTARIO.repositories.InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InsumoService {
    @Autowired
    private InsumoRepository repository;

    public List<Insumo> listarTodo() {
        return repository.findAll();
    }

    public Insumo actualizarStock(Insumo insumo) {
        return repository.save(insumo);
    }
}
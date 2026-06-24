package com.HealthTech.ms_PROVEEDOR.services;

import com.HealthTech.ms_PROVEEDOR.model.Proveedor;
import com.HealthTech.ms_PROVEEDOR.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository repository;

    public List<Proveedor> listarProveedores() {
        return repository.findAll();
    }

    public Proveedor guardar(Proveedor proveedor) {
        return repository.save(proveedor);
    }
}
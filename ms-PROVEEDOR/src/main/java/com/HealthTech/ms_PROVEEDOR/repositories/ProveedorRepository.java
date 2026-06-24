package com.HealthTech.ms_PROVEEDOR.repositories;

import com.HealthTech.ms_PROVEEDOR.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}
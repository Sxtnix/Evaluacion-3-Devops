package com.HealthTech.ms_INVENTARIO.repositories;

import com.HealthTech.ms_INVENTARIO.model.Insumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsumoRepository extends JpaRepository<Insumo, Long> {
}
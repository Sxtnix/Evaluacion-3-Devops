package com.HealthTech.ms_FARMACIA.repositories;

import com.HealthTech.ms_FARMACIA.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
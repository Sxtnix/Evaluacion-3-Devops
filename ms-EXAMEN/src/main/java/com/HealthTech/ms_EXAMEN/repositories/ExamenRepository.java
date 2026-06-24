package com.HealthTech.ms_EXAMEN.repositories;

import com.HealthTech.ms_EXAMEN.model.ExamenMedico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends JpaRepository<ExamenMedico, Long> {
}
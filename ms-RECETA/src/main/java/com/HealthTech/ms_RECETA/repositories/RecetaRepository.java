package com.HealthTech.ms_RECETA.repositories;

import com.HealthTech.ms_RECETA.model.RecetaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetaRepository extends JpaRepository<RecetaMedica, Long> {
    List<RecetaMedica> findByPacienteId(Long pacienteId);
}
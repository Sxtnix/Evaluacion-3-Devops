package com.HealthTech.ms_ESPECIALIDAD.repositories;

import com.HealthTech.ms_ESPECIALIDAD.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Long> {
}
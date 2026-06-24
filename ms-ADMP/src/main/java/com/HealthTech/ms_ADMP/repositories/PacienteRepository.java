package com.HealthTech.ms_ADMP.repositories;

import com.HealthTech.ms_ADMP.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
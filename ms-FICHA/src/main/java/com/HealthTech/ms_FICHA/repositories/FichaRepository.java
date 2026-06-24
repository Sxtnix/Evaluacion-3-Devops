package com.HealthTech.ms_FICHA.repositories;

import com.HealthTech.ms_FICHA.model.FichaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FichaRepository extends JpaRepository<FichaClinica, Long> {
    List<FichaClinica> findByPacienteId(Long pacienteId);
}
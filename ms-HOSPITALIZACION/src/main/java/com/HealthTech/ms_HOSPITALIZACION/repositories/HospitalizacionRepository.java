package com.HealthTech.ms_HOSPITALIZACION.repositories;

import com.HealthTech.ms_HOSPITALIZACION.model.Hospitalizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalizacionRepository extends JpaRepository<Hospitalizacion, Long> {
}
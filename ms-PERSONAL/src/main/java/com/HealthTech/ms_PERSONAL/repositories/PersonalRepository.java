package com.HealthTech.ms_PERSONAL.repositories;

import com.HealthTech.ms_PERSONAL.model.PersonalSanitario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository<PersonalSanitario, Long> {
}
package com.HealthTech.ms_RECETA.model;

import com.HealthTech.ms_RECETA.enums.EstadoReceta;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "recetas_medicas")
@Data
public class RecetaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long fichaClinicaId;
    private Long pacienteId;
    private Long profesionalId;
    private LocalDate fechaEmision;
    private String indicaciones;

    @Enumerated(EnumType.STRING)
    private EstadoReceta estado;
}
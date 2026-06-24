package com.HealthTech.ms_HOSPITALIZACION.model;

import com.HealthTech.ms_HOSPITALIZACION.enums.EstadoHospitalizacion;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "hospitalizaciones")
@Data
public class Hospitalizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pacienteId;
    private Long camaId;
    private LocalDate fechaIngreso;
    private LocalDate fechaAlta;
    private String motivoIngreso;
    private String diagnosticoIngreso;

    @Enumerated(EnumType.STRING)
    private EstadoHospitalizacion estado;
}
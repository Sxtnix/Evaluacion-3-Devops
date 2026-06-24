package com.HealthTech.ms_EXAMEN.model;

import com.HealthTech.ms_EXAMEN.enums.EstadoExamen;
import com.HealthTech.ms_EXAMEN.enums.TipoExamen;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "examenes_medicos")
@Data
public class ExamenMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pacienteId;
    private Long profesionalId;
    private Long fichaClinicaId;

    @Enumerated(EnumType.STRING)
    private TipoExamen tipoExamen;

    private LocalDate fechaSolicitud;
    private LocalDate fechaResultado;
    private String resultado;

    @Enumerated(EnumType.STRING)
    private EstadoExamen estado;
}
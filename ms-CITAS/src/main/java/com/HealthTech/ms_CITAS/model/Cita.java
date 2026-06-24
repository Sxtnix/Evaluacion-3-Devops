package com.HealthTech.ms_CITAS.model;

import com.HealthTech.ms_CITAS.enums.EstadoCita;
import com.HealthTech.ms_CITAS.enums.ModalidadCita;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "citas_medicas")
@Data
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pacienteId;
    private Long profesionalId;
    private Long especialidadId;
    private LocalDateTime fechaHora;
    private String motivo;

    @Enumerated(EnumType.STRING)
    private EstadoCita estado;

    @Enumerated(EnumType.STRING)
    private ModalidadCita modalidad;
}
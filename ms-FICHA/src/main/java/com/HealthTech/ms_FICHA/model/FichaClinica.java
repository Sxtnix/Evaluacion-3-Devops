package com.HealthTech.ms_FICHA.model;

import com.HealthTech.ms_FICHA.enums.TipoAtencion;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "fichas_clinicas")
@Data
public class FichaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pacienteId;
    private Long citaId;
    private Long profesionalId;
    private String diagnostico;
    private String observaciones;
    private LocalDateTime fechaRegistro;

    @Enumerated(EnumType.STRING)
    private TipoAtencion tipoAtencion;
}
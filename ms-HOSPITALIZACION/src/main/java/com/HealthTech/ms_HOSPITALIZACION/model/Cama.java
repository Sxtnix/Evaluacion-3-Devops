package com.HealthTech.ms_HOSPITALIZACION.model;

import com.HealthTech.ms_HOSPITALIZACION.enums.EstadoCama;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "camas")
@Data
public class Cama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCama;
    private String tipoCama;
    private String ubicacion;

    @Enumerated(EnumType.STRING)
    private EstadoCama estado;
}
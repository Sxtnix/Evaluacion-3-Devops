package com.HealthTech.ms_ESPECIALIDAD.model;

import com.HealthTech.ms_ESPECIALIDAD.enums.EstadoEspecialidad;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "especialidades")
@Data
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private EstadoEspecialidad estado;
}
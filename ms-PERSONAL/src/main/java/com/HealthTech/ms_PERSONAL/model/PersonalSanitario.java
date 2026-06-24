package com.HealthTech.ms_PERSONAL.model;

import com.HealthTech.ms_PERSONAL.enums.EstadoPersonal;
import com.HealthTech.ms_PERSONAL.enums.TipoProfesional;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "personal_sanitario")
@Data
public class PersonalSanitario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rut;
    private String nombres;
    private String apellidos;
    private String especialidad;
    private String correo;
    private String telefono;

    @Enumerated(EnumType.STRING)
    private TipoProfesional tipoProfesional;

    @Enumerated(EnumType.STRING)
    private EstadoPersonal estado;
}
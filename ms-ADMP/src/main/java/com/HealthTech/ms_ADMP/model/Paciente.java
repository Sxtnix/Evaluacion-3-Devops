package com.HealthTech.ms_ADMP.model;

import com.HealthTech.ms_ADMP.enums.EstadoPaciente;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "pacientes")
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rut;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String sexo;
    private String telefono;
    private String correo;
    private String direccion;

    @Enumerated(EnumType.STRING)
    private EstadoPaciente estado;
}
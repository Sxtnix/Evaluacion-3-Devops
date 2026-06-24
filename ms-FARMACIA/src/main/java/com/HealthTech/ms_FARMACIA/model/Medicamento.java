package com.HealthTech.ms_FARMACIA.model;

import com.HealthTech.ms_FARMACIA.enums.EstadoMedicamento;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "medicamentos")
@Data
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Integer stock;
    private String unidad;
    private LocalDate fechaVencimiento;
    private String categoria;

    @Enumerated(EnumType.STRING)
    private EstadoMedicamento estado;
}
package com.HealthTech.ms_INVENTARIO.model;

import com.HealthTech.ms_INVENTARIO.enums.EstadoInsumo;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "insumos_medicos")
@Data
public class Insumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Integer cantidadDisponible;
    private String unidadMedida;
    private LocalDate fechaVencimiento;
    private Long proveedorId;
    private Long categoriaId;

    @Enumerated(EnumType.STRING)
    private EstadoInsumo estado;
}
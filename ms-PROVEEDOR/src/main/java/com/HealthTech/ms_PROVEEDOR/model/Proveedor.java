package com.HealthTech.ms_PROVEEDOR.model;

import com.HealthTech.ms_PROVEEDOR.enums.EstadoProveedor;
import com.HealthTech.ms_PROVEEDOR.enums.TipoProveedor;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "proveedores")
@Data
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rutEmpresa;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;

    @Enumerated(EnumType.STRING)
    private TipoProveedor tipoProveedor;

    @Enumerated(EnumType.STRING)
    private EstadoProveedor estado;
}
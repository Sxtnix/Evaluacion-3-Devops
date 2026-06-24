CREATE TABLE insumos_medicos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    descripcion VARCHAR(255),
    cantidad_disponible INT,
    unidad_medida VARCHAR(100),
    fecha_vencimiento DATE,
    proveedor_id BIGINT,
    categoria_id BIGINT,
    estado VARCHAR(50)
);
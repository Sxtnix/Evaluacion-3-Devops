CREATE TABLE proveedores (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    rut_empresa VARCHAR(20),
    nombre VARCHAR(255),
    correo VARCHAR(255),
    telefono VARCHAR(50),
    direccion VARCHAR(255),
    tipo_proveedor VARCHAR(50),
    estado VARCHAR(50)
);
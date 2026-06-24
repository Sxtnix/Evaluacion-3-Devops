CREATE TABLE medicamentos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    descripcion VARCHAR(255),
    stock INT,
    unidad VARCHAR(100),
    fecha_vencimiento DATE,
    categoria VARCHAR(255),
    estado VARCHAR(50)
);
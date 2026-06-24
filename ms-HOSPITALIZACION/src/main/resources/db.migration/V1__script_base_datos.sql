CREATE TABLE camas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    numero_cama VARCHAR(100),
    tipo_cama VARCHAR(100),
    ubicacion VARCHAR(255),
    estado VARCHAR(50)
);

CREATE TABLE hospitalizaciones (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    paciente_id BIGINT,
    cama_id BIGINT,
    fecha_ingreso DATE,
    fecha_alta DATE,
    motivo_ingreso VARCHAR(255),
    diagnostico_ingreso VARCHAR(255),
    estado VARCHAR(50)
);
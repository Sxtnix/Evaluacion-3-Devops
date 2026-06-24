CREATE TABLE personal_sanitario (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    rut VARCHAR(20),
    nombres VARCHAR(255),
    apellidos VARCHAR(255),
    especialidad VARCHAR(255),
    correo VARCHAR(255),
    telefono VARCHAR(50),
    tipo_profesional VARCHAR(50),
    estado VARCHAR(50)
);
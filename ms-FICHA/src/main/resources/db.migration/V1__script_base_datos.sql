CREATE TABLE fichas_clinicas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    paciente_id BIGINT,
    cita_id BIGINT,
    profesional_id BIGINT,
    diagnostico VARCHAR(255),
    observaciones VARCHAR(255),
    fecha_registro DATETIME,
    tipo_atencion VARCHAR(50)
);
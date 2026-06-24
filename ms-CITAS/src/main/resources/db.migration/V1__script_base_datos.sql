CREATE TABLE citas_medicas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    paciente_id BIGINT,
    profesional_id BIGINT,
    especialidad_id BIGINT,
    fecha_hora DATETIME,
    motivo VARCHAR(255),
    estado VARCHAR(50),
    modalidad VARCHAR(50)
);
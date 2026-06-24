CREATE TABLE examenes_medicos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    paciente_id BIGINT,
    profesional_id BIGINT,
    ficha_clinica_id BIGINT,
    tipo_examen VARCHAR(50),
    fecha_solicitud DATE,
    fecha_resultado DATE,
    resultado VARCHAR(255),
    estado VARCHAR(50)
);
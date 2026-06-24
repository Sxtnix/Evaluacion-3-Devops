CREATE TABLE recetas_medicas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    ficha_clinica_id BIGINT,
    paciente_id BIGINT,
    profesional_id BIGINT,
    fecha_emision DATE,
    indicaciones VARCHAR(255),
    estado VARCHAR(50)
);
CREATE TABLE pacientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    rut VARCHAR(15) UNIQUE,
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    fecha_nacimiento DATE,
    sexo VARCHAR(10),
    telefono VARCHAR(20),
    correo VARCHAR(100),
    direccion VARCHAR(200),
   estado VARCHAR(20) -- ACTIVO, INACTIVO
);
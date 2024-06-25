
CREATE TABLE IF NOT EXISTS Personas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    edad INT,
    departamento_id INT
);


CREATE TABLE IF NOT EXISTS Departamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);


CREATE TABLE IF NOT EXISTS Proyectos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    departamento_id INT,
    presupuesto DOUBLE
);


INSERT INTO Departamentos (nombre) VALUES
('Recursos Humanos'),
('Desarrollo'),
('Marketing'),
('Ventas'),
('Soporte');


INSERT INTO Personas (nombre, apellido, edad, departamento_id) VALUES
('Juan', 'Pérez', 28, 2),
('Ana', 'García', 34, 1),
('Luis', 'Martínez', 40, 3),
('Marta', 'Rodríguez', 25, 2),
('Carlos', 'Fernández', 50, 4),
('Lucía', 'López', 29, 1),
('Pedro', 'González', 37, 5),
('Sofía', 'Gómez', 32, 3),
('Diego', 'Díaz', 45, 4),
('Elena', 'Torres', 26, 2);


INSERT INTO Proyectos (nombre, departamento_id, presupuesto) VALUES
('Proyecto A', 2, 10000.00),
('Proyecto B', 3, 15000.00),
('Proyecto C', 1, 20000.00),
('Proyecto D', 4, 25000.00),
('Proyecto E', 5, 12000.00),
('Proyecto F', 2, 13000.00),
('Proyecto G', 3, 14000.00),
('Proyecto H', 1, 16000.00),
('Proyecto I', 4, 17000.00),
('Proyecto J', 5, 18000.00);


SELECT * FROM PROYECTOS p 

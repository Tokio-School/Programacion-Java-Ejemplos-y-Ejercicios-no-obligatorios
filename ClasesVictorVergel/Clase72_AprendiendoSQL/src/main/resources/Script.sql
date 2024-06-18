
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



SELECT * FROM Personas;

SELECT nombre,apellido FROM PERSONAS;

SELECT * FROM Personas WHERE edad>35;

SELECT * FROM personas WHERE edad>35 AND edad<45;

SELECT * FROM personas WHERE nombre='Luis';

SELECT * FROM personas WHERE nombre LIKE 'L%';

SELECT * FROM personas ORDER by nombre DESc;


SELECT * FROM PERSONAS, DEPARTAMENTOS 
WHERE personas.departamento_id=departamentos.id;

SELECT personas.nombre FROM PERSONAS, DEPARTAMENTOS 
WHERE personas.departamento_id=departamentos.id
AND departamentos.nombre='Desarrollo';

SELECT p.nombre FROM PERSONAS AS p, DEPARTAMENTOS AS d 
WHERE p.departamento_id=d.id
AND d.nombre='Desarrollo';

SELECT count(p.nombre) AS Numero_Desarrolladores FROM PERSONAS AS p, DEPARTAMENTOS AS d 
WHERE p.departamento_id=d.id
AND d.nombre='Desarrollo';

SELECT max(edad) FROM PERSONAS;

SELECT min(edad) FROM PERSONAS;

SELECT avg(edad) FROM PERSONAS;

SELECT nombre FROM personas WHERE edad=(SELECT min(edad) FROM PERSONAS)
OR edad=(SELECT max(edad) FROM PERSONAS);

SELECT DISTINCT(DEPARTAMENTO_ID) FROM proyectos;


SELECT * FROM personas;
UPDATE personas SET edad=edad+1;



insert into personas (nombre, apellido, edad, departamento_id) values ('Pablo33', 'Gómez33', 30, 2);
DELETE FROM personas WHERE nombre='Pablo33';

- CRUD - CreadReadUpdateDelete











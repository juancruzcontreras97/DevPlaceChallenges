-- create a table
CREATE TABLE empleados (
  id INTEGER PRIMARY KEY,
  nombre TEXT NOT NULL,
  apellido TEXT NOT NULL,
  telefono TEXT NOT NULL,
  email TEXT NOT NULL,
  salario_promedio FLOAT NOT NULL,
  antiguedad INTEGER NOT NULL,
  id_municipalidad INTEGER NOT NULL,
  puesto TEXT NOT NULL
);

CREATE TABLE municipalidades (
  id INTEGER PRIMARY KEY,
  nombre TEXT NOT NULL,
  empleados INTEGER
);

-- insert some values
INSERT INTO empleados VALUES (1,'Juan','Contreras','223223223','jcc@hmail.com',75000,11,1,'Programacion');
INSERT INTO empleados VALUES (2,'Mili','Blanc','224242242','mlb@getmail.com',80000,13,2,'Coordinacion');
INSERT INTO empleados VALUES (3,'Sere','Fabretti','252245236','slf@mail.com',78000,9,3,'Contabilidad');
INSERT INTO empleados VALUES (4,'Nico','Blancetti','2145213215','nmb@mail.com',50000,6,1,'Programacion');

INSERT INTO municipalidades VALUES (1,'Mar del Plata',25);
INSERT INTO municipalidades VALUES (2,'Santa Clara del Mar',20);
INSERT INTO municipalidades VALUES (3,'Mar Chiquita',15);

-- fetch some values

SELECT empleados.nombre, apellido, salario_promedio, antiguedad, puesto, municipalidades.nombre
FROM empleados
JOIN municipalidades
ON empleados.id_municipalidad = municipalidades.id
WHERE salario_promedio > 70000 AND antiguedad BETWEEN 10 AND 15;


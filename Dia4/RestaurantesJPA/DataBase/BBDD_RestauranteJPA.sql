CREATE DATABASE restaurant_management;

USE restaurant_management;

CREATE TABLE plato(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    disponibilidad BOOLEAN NOT NULL
);

CREATE TABLE mesa(
	id INT PRIMARY KEY AUTO_INCREMENT,
    numero_mesa INT UNIQUE NOT NULL,
    ocupada BOOLEAN NOT NULL
);

SHOW TABLES;
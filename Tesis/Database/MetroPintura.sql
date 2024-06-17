Create database MetroPintura

use MetroPintura

CREATE TABLE Proveedor (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    `Nombre del Proveedor` VARCHAR(255) NOT NULL,
    Fecha DATETIME NOT NULL
);

SELECT * FROM Proveedor;

Insert into Proveedor (`Nombre del Proveedor`,Fecha) VALUES ('Juanito Alcachofa','2024-06-09 14:30:00');

CREATE TABLE INVENTARIO (
	`ID Producto` int AUTO_INCREMENT PRIMARY KEY,
	`Nombre del Producto` varchar(255) NOT NULL,
	`	` varchar(255) NOT NULL,
	Categoria varchar(255),
	`Cantidad del Producto` int NOT NULL,
	`Precio del Producto` decimal(6,2) NOT NULL
);

Insert into INVENTARIO (`Nombre del Producto`,`Tipo de Producto`,Categoria,`Cantidad del Producto`,`Precio del Producto`) VALUES ('Pintura Morada','Galon',' ','10','5.99');

SELECT * FROM INVENTARIO;

CREATE TABLE Clientes (
    CI varchar(255) PRIMARY KEY NOT NULL,
    `Nombre Completo` VARCHAR(255) NOT NULL,
    `Celular` VARCHAR(255) NOT NULL,
    `Cliente Especial` VARCHAR(2) NOT NULL
);


SELECT * FROM Clientes;

Insert into Clientes VALUES ('?','?','?','?');
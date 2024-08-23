Create database MetroPintura;

use MetroPintura;

CREATE TABLE INVENTARIO (
	`ID Producto` int AUTO_INCREMENT PRIMARY KEY,
	`Nombre del Producto` varchar(255) NOT NULL,
	`Tipo de Producto` varchar(255) NOT NULL,
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
    Direccion VARCHAR(255) NOT NULL,
    `Cliente Especial` VARCHAR(2) NOT NULL
);


SELECT * FROM Clientes;

Insert into Clientes VALUES ('?','?','?','?');

CREATE TABLE factura(
	ID int AUTO_INCREMENT PRIMARY KEY,
    Fecha varchar(255) not null,
    `Monto total` double(10,2) not null,
    Cliente varchar(255), 
    Foreign Key (CI) References Clientes(CI)
);

CREATE TABLE detalle_factura(
	`ID Detalle` int AUTO_INCREMENT Primary key,
    `ID Factura` int not null, Foreign Key(ID) References factura(ID),
	`ID Producto` int not null, Foreign Key(`ID Producto`) References inventario(`ID Producto`),
    Cantidad int (10) not null,
    Precio decimal(10,2) not null
);
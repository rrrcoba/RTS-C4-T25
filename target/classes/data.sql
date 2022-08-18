DROP TABLE IF EXISTS `almacenes`;
DROP TABLE IF EXISTS `cajas`;

CREATE TABLE `almacenes` (
  `CODIGO` int NOT NULL auto_increment,
  `LUGAR` varchar(255) NOT NULL,
  `CAPACIDAD` int NOT NULL,
  PRIMARY KEY (`CODIGO`)
);

INSERT INTO `almacenes` (`LUGAR`,`CAPACIDAD`) VALUES ('Valencia',3),('Barcelona',4),('Bilbao',7),('Los Angeles',2),('San Francisco',8);

CREATE TABLE `cajas` (
  `NUMREFERENCIA` int NOT NULL auto_increment,
  `CONTENIDO` varchar(255) NOT NULL,
  `VALOR` double NOT NULL,
  `ALMACEN` int NOT NULL,
  PRIMARY KEY (`NUMREFERENCIA`),
  CONSTRAINT `cajas_ibfk_1` FOREIGN KEY (`ALMACEN`) REFERENCES `almacenes` (`CODIGO`)
);

INSERT INTO `cajas` (`CONTENIDO`,`VALOR`,`ALMACEN`) VALUES ('Papers',180,3),('Rocks',250,1),('Scissors',190,4),('Rocks',200,2);
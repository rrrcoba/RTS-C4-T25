DROP TABLE IF EXISTS `peliculas`;
DROP TABLE IF EXISTS `salas`;

CREATE TABLE `peliculas` (
  `CODIGO` int NOT NULL auto_increment,
  `NOMBRE` varchar(100) NOT NULL,
  `CALIFICACIONEDAD` int NOT NULL,
  PRIMARY KEY (`CODIGO`)
);
INSERT INTO `peliculas` (`NOMBRE`,`CALIFICACIONEDAD`) VALUES ('Batman',16),('Superman',13),('Flash',13);


CREATE TABLE `salas` (
  `CODIGO` int NOT NULL auto_increment,
  `NOMBRE` varchar(100) NOT NULL,
  `PELICULA` int NOT NULL,
  PRIMARY KEY (`CODIGO`),
  CONSTRAINT `salas_ibfk_1` FOREIGN KEY (`PELICULA`) REFERENCES `peliculas` (`CODIGO`)
);
INSERT INTO `salas` (`NOMBRE`,`PELICULA`) VALUES ('Omega',1),('Imperial',2),('Royale',3);
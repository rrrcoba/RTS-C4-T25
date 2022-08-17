DROP TABLE IF EXISTS `articulos`;

DROP TABLE IF EXISTS `fabricantes`;
CREATE TABLE `fabricantes` (
  `CODIGO` int NOT NULL auto_increment,
  `NOMBRE` varchar(255) NOT NULL,
  PRIMARY KEY (`CODIGO`)
);
INSERT INTO `fabricantes`(`NOMBRE`) VALUES ('Sony'),('Creative Labs'),('Hewlett-Packard'),('Iomega'),('Fujitsu');

CREATE TABLE `articulos` (
  `CODIGO` int NOT NULL auto_increment,
  `NOMBRE` varchar(255) NOT NULL,
  `PRECIO` decimal(10,0) NOT NULL,
  `FABRICANTE` int NOT NULL,
  PRIMARY KEY (`codigo`),
  CONSTRAINT `articulos_fk` FOREIGN KEY (`FABRICANTE`) REFERENCES `fabricantes` (`CODIGO`)
);
INSERT INTO `articulos`(`NOMBRE`,`PRECIO`,`FABRICANTE`) VALUES ('Hard drive',240,1),('Memory',120,2),('ZIP drive',150,3);
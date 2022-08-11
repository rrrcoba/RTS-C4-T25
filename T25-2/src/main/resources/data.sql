DROP TABLE IF EXISTS `departamentos`;
CREATE TABLE `departamentos` (
  `CODIGO` int NOT NULL auto_increment,
  `NOMBRE` nvarchar(100) NOT NULL,
  `PRESUPUESTO` int NOT NULL,
  PRIMARY KEY (`CODIGO`)
);
INSERT INTO `departamentos` (`NOMBRE`,`PRESUPUESTO`) VALUES ('IT',65000),('Accounting',15000),('Human Resources',240000),('Research',55000);

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE `empleados` (
  `CODIGO` int NOT NULL auto_increment,
  `DNI` varchar(9) NOT NULL,
  `NOMBRE` nvarchar(100) NOT NULL,
  `APELLIDOS` nvarchar(255) NOT NULL,
  `DEPARTAMENTO` int default NULL,
  PRIMARY KEY (`CODIGO`),
  CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`DEPARTAMENTO`) REFERENCES `departamentos`(`CODIGO`)
);
INSERT INTO `empleados` (`DNI`,`NOMBRE`,`APELLIDOS`,`DEPARTAMENTO`) VALUES (123234877,'Michael','Rogers',1),(152934485,'Anand','Manikutty',1),(222364883,'Carol','Smith',2),(326587417,'Joe','Stevens',2);
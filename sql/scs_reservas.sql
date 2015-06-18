# MySQL Navigator Xport
# Database: scs_reservas
# scs@localhost

# CREATE DATABASE IF NOT EXISTS scs_reservas;
USE scs_reservas;

#
# Table structure for table 'HOTEL'
#

DROP TABLE IF EXISTS HOTEL;
CREATE TABLE `HOTEL` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CODPOSTAL` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `CATEGORIA` varchar(255) DEFAULT NULL,
  `LOCALIDAD` varchar(255) DEFAULT NULL,
  `DOMICILIO` varchar(255) DEFAULT NULL,
  `TELEFONO` varchar(255) DEFAULT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `PROVINCIA` varchar(255) DEFAULT NULL,
  `VERSION` int(11) DEFAULT NULL,
  `ADMINISTRADOR_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_HOTEL_ADMINISTRADOR_ID` (`ADMINISTRADOR_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

#
# Dumping data for table 'HOTEL'
#

INSERT INTO HOTEL VALUES (1,'32004','Hotel Pepe','2 estrellas','Ourense','As Lagoas','988333333','Hotel Restaurante Pepe','Ourense',1,1);
INSERT INTO HOTEL VALUES (2,'32008','Hostal Lucas','2 estrellas','Ourense','A Ponte','988777777','Hostal Residencia Lucas','Ourense',2,1);
INSERT INTO HOTEL VALUES (3,'15555','Hostal de los Reyes Cat�licos','5 estrellas gran lujo','Santiago','Plaza del Obradoiro, S/B','981595959','Parador nacional de turismo','A Coru�a',1,2);

#
# Table structure for table 'RESERVA'
#

DROP TABLE IF EXISTS RESERVA;
CREATE TABLE `RESERVA` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `OCUPACION` int(11) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `FECHAFIN` date DEFAULT NULL,
  `NOMBRETOMADOR` varchar(255) DEFAULT NULL,
  `FECHAINICIO` date DEFAULT NULL,
  `VERSION` int(11) DEFAULT NULL,
  `TIPOHABITACION_ID` bigint(20) DEFAULT NULL,
  `CLIENTE_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_RESERVA_TIPOHABITACION_ID` (`TIPOHABITACION_ID`),
  KEY `FK_RESERVA_CLIENTE_ID` (`CLIENTE_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

#
# Dumping data for table 'RESERVA'
#

INSERT INTO RESERVA VALUES (1,1,45,1,'2010-02-03','Luis','2010-02-01',2,1,3);
INSERT INTO RESERVA VALUES (2,1,45,1,'2010-02-07','Luis','2010-02-05',2,1,3);
INSERT INTO RESERVA VALUES (3,1,35,1,'2010-02-08','Marcos','2010-02-04',2,4,4);
INSERT INTO RESERVA VALUES (4,1,45,1,'2010-02-12','Luis','2010-02-09',2,1,3);
INSERT INTO RESERVA VALUES (5,1,45,1,'2010-02-16','Marcos','2010-02-09',1,1,4);
INSERT INTO RESERVA VALUES (6,1,35,1,'2010-02-07','Hermano de Marcos','2010-02-03',1,1,4);
INSERT INTO RESERVA VALUES (7,1,35,1,'2010-02-08','Hermano de Luis','2010-02-03',1,2,4);

#
# Table structure for table 'TIPOHABITACION'
#

DROP TABLE IF EXISTS TIPOHABITACION;
CREATE TABLE `TIPOHABITACION` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `CAPACIDAD` int(11) DEFAULT NULL,
  `VERSION` int(11) DEFAULT NULL,
  `HOTEL_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_TIPOHABITACION_HOTEL_ID` (`HOTEL_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

#
# Dumping data for table 'TIPOHABITACION'
#

INSERT INTO TIPOHABITACION VALUES (1,'Doble grande',45,5,'Habitaci�n doble grande con TV',2,1,1);
INSERT INTO TIPOHABITACION VALUES (2,'Doble peque�a',40,3,'Habitaci�n doble peque�a con TV',2,1,1);
INSERT INTO TIPOHABITACION VALUES (3,'Individual',35,4,'Habitaci�n individual con TV',1,1,1);
INSERT INTO TIPOHABITACION VALUES (4,'Doble',35,8,'Habitaci�n doble econ�mica con TV y ba�o',2,1,2);
INSERT INTO TIPOHABITACION VALUES (5,'Individual',25,6,'Habitaci�n individual econ�mica con TV',1,1,2);
INSERT INTO TIPOHABITACION VALUES (6,'Doble gran lujo',140,10,'Habitaci�n doble gran lujo, con TV e hidromasaje',2,1,3);
INSERT INTO TIPOHABITACION VALUES (7,'Doble',80,20,'Habitaci�n doble normal con TV y ba�o',2,1,3);
INSERT INTO TIPOHABITACION VALUES (8,'Individual',75,15,'Habitaci�n individual econ�mica con TV e hidromasaje',1,1,3);

#
# Table structure for table 'USUARIO'
#

DROP TABLE IF EXISTS USUARIO;
CREATE TABLE `USUARIO` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `TIPO_USUARIO` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `ULTIMOACCESO` date DEFAULT NULL,
  `LOGIN` varchar(255) DEFAULT NULL,
  `FECHAALTA` date DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `VERSION` int(11) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `APELLIDOS` varchar(255) DEFAULT NULL,
  `CODPOSTAL` varchar(255) DEFAULT NULL,
  `LOCALIDAD` varchar(255) DEFAULT NULL,
  `NIF` varchar(255) DEFAULT NULL,
  `DOMICILIO` varchar(255) DEFAULT NULL,
  `TELEFONO` varchar(255) DEFAULT NULL,
  `PROVINCIA` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

#
# Dumping data for table 'USUARIO'
#

INSERT INTO USUARIO VALUES (1,'administrador','ana@ana.com','2010-01-24','ana','2010-01-24','ana',1,'Ana','P�rez P�rez',NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO USUARIO VALUES (2,'administrador','eva@eva.com','2010-01-24','eva','2010-01-24','eva',1,'Eva','Garc�a Garc�a',NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO USUARIO VALUES (3,'cliente','luis@luis.com','2010-01-24','luis','2010-01-24','luis',1,'Luis','Fern�ndez Fern�ndez','32004','Ourense','11111111A','As Lagoas','988111111','Ourense');
INSERT INTO USUARIO VALUES (4,'cliente','marcos@marcos.com','2010-01-24','marcos','2010-01-24','marcos',1,'Marcos','Mart�nez Mart�nez','15222','Santiago','22222222B','Praza Roxa','981222222','A Coru�a');


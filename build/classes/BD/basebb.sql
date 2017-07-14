-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-07-2017 a las 01:32:27
-- Versión del servidor: 5.5.34
-- Versión de PHP: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `basebb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `tipoCliente` varchar(15) NOT NULL,
  `tipoDoc` varchar(15) NOT NULL,
  `numDoc` varchar(20) NOT NULL,
  `razonSocial` varchar(50) DEFAULT NULL,
  `nombresApellidos` varchar(50) DEFAULT NULL,
  `fechaNacimiento` varchar(15) DEFAULT NULL,
  `sexoCliente` varchar(12) DEFAULT NULL,
  `telefonoCliente` varchar(20) DEFAULT NULL,
  `celularCliente` varchar(20) DEFAULT NULL,
  `correoCliente` varchar(40) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `vendedor` varchar(50) NOT NULL,
  `fechaRegistroCliente` varchar(15) NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `tipoCliente`, `tipoDoc`, `numDoc`, `razonSocial`, `nombresApellidos`, `fechaNacimiento`, `sexoCliente`, `telefonoCliente`, `celularCliente`, `correoCliente`, `direccion`, `vendedor`, `fechaRegistroCliente`) VALUES
(1, 'Persona Natural', 'DNI', '47328084', '-', 'mariana meliza ejdkk', '24/09/1992', 'Femenino', '-', '984858696', 'askasjakls', 'sajdkdkn', 'wsjkdnwldedlwk', '13/07/2017'),
(2, 'Persona Natural', 'DNI', '5421', 'dfddfff', '-', '19/09/1990', 'Masculino', '-', '5475', 'ghjkldfgbhnjkl', 'hnjsdffffd', 'SDDJJDKKJ', '13/07/2017'),
(3, 'Persona Natural', 'DNI', '5421', 'dfddfff', '-', '19/09/1990', 'Masculino', '-', '5475', 'ghjkldfgbhnjkl', 'hnjsdffffd', 'SDDJJDKKJ', '13/07/2017');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `nombresApellidos` varchar(50) NOT NULL,
  `telefonoContacto` varchar(20) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `telefonoReferencia` varchar(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `fechaNacimiento` varchar(12) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `numeroCuenta` varchar(20) NOT NULL,
  `fechaPago` int(4) NOT NULL,
  `hobby` varchar(30) NOT NULL,
  `sexo` varchar(12) NOT NULL,
  `dni` int(12) NOT NULL,
  `edad` int(4) NOT NULL,
  `sueldo` float NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`nombresApellidos`, `telefonoContacto`, `celular`, `telefonoReferencia`, `direccion`, `fechaNacimiento`, `correo`, `numeroCuenta`, `fechaPago`, `hobby`, `sexo`, `dni`, `edad`, `sueldo`) VALUES
('maria del barrio cepeda bosques', '102050', '987821589', '985695874', 'los alurekes 1546', '02/08/1992', 'maajahd@gmail.com', '170-2569874-2589', 5, 'cantar', 'Femenino', 10203040, 25, 850),
('mariana meliza segura mendoza', '402121', '987821639', '985362861', 'mz p lt 2  sect 3 alto trujillo', '24/09/1992', 'marianamsm.24@gmail.com', '170-15264-458 bcp', 12, 'escuchar musica', 'Femenino', 47328084, 24, 850.6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE IF NOT EXISTS `empresa` (
  `nombre` varchar(50) NOT NULL,
  `razonSocial` varchar(60) NOT NULL,
  `representanteLegal` varchar(50) NOT NULL,
  `ruc` varchar(15) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `correoElectronico` varchar(30) NOT NULL,
  `paginaWeb` varchar(30) NOT NULL,
  `foto` longblob NOT NULL,
  `descripcion` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incentivo`
--

CREATE TABLE IF NOT EXISTS `incentivo` (
  `tipoIncentivo` varchar(15) NOT NULL,
  `nombreIncentivo` varchar(30) NOT NULL,
  `cantidadIncentivo` varchar(8) NOT NULL,
  `sueldoVenta` varchar(15) NOT NULL,
  `estadoIncentivo` varchar(12) NOT NULL,
  `descripcionIncentivo` varchar(150) NOT NULL,
  `fechaIncentivo` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `incentivo`
--

INSERT INTO `incentivo` (`tipoIncentivo`, `nombreIncentivo`, `cantidadIncentivo`, `sueldoVenta`, `estadoIncentivo`, `descripcionIncentivo`, `fechaIncentivo`) VALUES
('Bono', 'zjxnxkjznckn', '20%', 'Sueldo', 'Activado', 'dffm,fndmdnffdfdfs', '13/07/2017');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `fechaRegistro` varchar(12) NOT NULL,
  `tipoUsuario` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `usuario`, `password`, `fechaRegistro`, `tipoUsuario`) VALUES
(6, 'alex', '102030', 'dd/MM/yyyy', 'Trabajador'),
(11, 'tefa', '121416', '11/07/2017', 'Trabajador'),
(13, 'mariana', '102030', '12/07/2017', 'Trabajador');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-07-2017 a las 18:32:18
-- Versión del servidor: 10.0.17-MariaDB
-- Versión de PHP: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `basebb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
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
  `fechaRegistroCliente` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE `empleado` (
  `codEmpleado` int(11) NOT NULL,
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
  `sueldo` float NOT NULL,
  `estado` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`codEmpleado`, `nombresApellidos`, `telefonoContacto`, `celular`, `telefonoReferencia`, `direccion`, `fechaNacimiento`, `correo`, `numeroCuenta`, `fechaPago`, `hobby`, `sexo`, `dni`, `sueldo`, `estado`) VALUES
(1, 'maria del barrio cepeda bosques', '102050', '987821589', '985695874', 'los alurekes 1546', '02/08/1992', 'maajahd@gmail.com', '170-2569874-2589', 5, 'cantar', 'Femenino', 10203040, 850, 0),
(2, 'anito julio', '66666', '', '', '', '', '', '', 0, '', 'na', 0, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
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

CREATE TABLE `incentivo` (
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

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `fechaRegistro` varchar(12) NOT NULL,
  `tipoUsuario` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `usuario`, `password`, `fechaRegistro`, `tipoUsuario`) VALUES
(6, 'alex', '102030', 'dd/MM/yyyy', 'Trabajador'),
(11, 'tefa', '121416', '11/07/2017', 'Trabajador'),
(13, 'mariana', '102030', '12/07/2017', 'Trabajador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`codEmpleado`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `codEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

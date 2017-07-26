-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-07-2017 a las 02:54:21
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
CREATE DATABASE IF NOT EXISTS `basebb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `basebb`;

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
  `foto` varchar(100) NOT NULL,
  `descripcion` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`nombre`, `razonSocial`, `representanteLegal`, `ruc`, `direccion`, `telefono`, `celular`, `correoElectronico`, `paginaWeb`, `foto`, `descripcion`) VALUES
('ertyuiop', 'tyulñ', 'tyuiloñ', 'tyuil', 'gtyhujkilñ', 'gyhjkl', 'ghjk,l', 'gfthyujkilopñ', 'gbhjk,l.ñ', '', 'jk,l.ñ{'),
('', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', 'dfghjkl', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', 'C:\\Users\\MARIANA\\Downloads\\SISTEMA BB FINAL\\-B4k-b-\\src\\imagenes\\bb.jpg', '');

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
  `estadoEmpleado` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`codEmpleado`, `nombresApellidos`, `telefonoContacto`, `celular`, `telefonoReferencia`, `direccion`, `fechaNacimiento`, `correo`, `numeroCuenta`, `fechaPago`, `hobby`, `sexo`, `dni`, `sueldo`, `estadoEmpleado`) VALUES
(1, 'maria del barrio cepeda bosques', '102050', '987821589', '985695874', 'los alurekes 1546', '02/08/1992', 'maajahd@gmail.com', '170-2569874-2589', 5, 'cantar', 'Femenino', 10203040, 850, 0),
(2, 'anito julio', '66666', '', '', '', '', '', '', 0, '', 'na', 0, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `codUsuario` int(11) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `fechaRegistro` varchar(12) NOT NULL,
  `tipoUsuario` varchar(15) NOT NULL,
  `estadoUsuario` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`codUsuario`, `usuario`, `password`, `fechaRegistro`, `tipoUsuario`, `estadoUsuario`) VALUES
(6, 'alex', '102030', 'dd/MM/yyyy', 'Trabajador', 0),
(11, 'tefa', '121416', '11/07/2017', 'Trabajador', 1),
(13, 'mariana', '102030', '12/07/2017', 'Trabajador', 1);

-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `codCliente` int(11) NOT NULL,
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
  `estadoCliente` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codCliente`, `tipoCliente`, `tipoDoc`, `numDoc`, `razonSocial`, `nombresApellidos`, `fechaNacimiento`, `sexoCliente`, `telefonoCliente`, `celularCliente`, `correoCliente`, `direccion`, `vendedor`, `fechaRegistroCliente`, `estadoCliente`) VALUES
(1, '', '', '', '', 'hola como estas', '', '', '', '', '', '', '', '', 1),
(2, 'Persona Natural', 'DNI', '5421', 'dfddfff', '-', '19/09/1990', 'Masculino', '-', '5475', 'ghjkldfgbhnjkl', 'hnjsdffffd', 'SDDJJDKKJ', '13/07/2017', 0),
(3, 'Persona Natural', 'DNI', '5421', 'dfddfff', '-', '19/09/1990', 'Masculino', '-', '5475', 'ghjkldfgbhnjkl', 'hnjsdffffd', 'SDDJJDKKJ', '13/07/2017', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `codProveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombreProveedor` varchar(30) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `numeroCuenta` varchar(20) NOT NULL,
  `estadoProveedor` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`codProveedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`codProveedor`, `nombreProveedor`, `direccion`, `telefono`, `celular`, `numeroCuenta`, `estadoProveedor`) VALUES
(1, 'sdfghjk', 'sdfghjkdfghjk,', '5241', '65241', '5746d54v', 1),
(2, 'asdfghjk', 'hjk,l.ñ', '', '', '', 1),
(3, 'xcfvgh', 'dsfgtyhukilo', '456780', '67890''', '8790-56789', 1);

-- --------------------------------------------------------


--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `nombreNuevaCategoria` varchar(15) NOT NULL,
  `nombrePrecio1` varchar(15) NOT NULL,
  `nombrePrecio2` varchar(15) DEFAULT NULL,
  `nombrePrecio3` varchar(15) DEFAULT NULL,
  `nombrePrecio4` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`nombreNuevaCategoria`, `nombrePrecio1`, `nombrePrecio2`, `nombrePrecio3`, `nombrePrecio4`) VALUES
('snacks', 'unidad', 'docena', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operador`
--

CREATE TABLE IF NOT EXISTS `operador` (
  `codOperador` int(11) NOT NULL AUTO_INCREMENT,
  `nombreOperador` varchar(20) NOT NULL,
  PRIMARY KEY (`codOperador`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `operador`
--

INSERT INTO `operador` (`codOperador`, `nombreOperador`) VALUES
(1, 'Movistar'),
(2, 'Claro'),
(3, 'Entel'),
(5, 'Bitel'),
(6, 'tintin'),
(7, 'tuntun');

-- -----------------------------------------------
--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `idProd` int(11) NOT NULL AUTO_INCREMENT,
  `codigoProducto` varchar(20) NOT NULL,
  `nombreProducto` varchar(25) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `descripcion` varchar(40) NOT NULL,
  `categoria` varchar(15) NOT NULL,
  `fechaVencimiento` varchar(12) NOT NULL,
  `stock` int(11) NOT NULL,
  `puntoPedido` int(11) NOT NULL,
  `numeroBoleta` varchar(20) NOT NULL,
  `fechaRegistro` varchar(12) NOT NULL,
  PRIMARY KEY (`idProd`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProd`, `codigoProducto`, `nombreProducto`, `marca`, `descripcion`, `categoria`, `fechaVencimiento`, `stock`, `puntoPedido`, `numeroBoleta`, `fechaRegistro`) VALUES
(1, 'sdfgh,.', 'fghj,k.lñ-', 'ertyulopñ', 'ertyuiop', 'Snack', '01/07/2017', 20, 10, '15148-122', '19/07/2017'),
(2, 'sdfghj', '85487jfkdcnv', 'chguyjklkl', 'dfghjklñxcc', 'Bebidas', '30/07/2017', 10, 5, '', '20/07/2017');


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promocion`
--

CREATE TABLE IF NOT EXISTS `promocion` (
  `codPromocion` int(11) NOT NULL AUTO_INCREMENT,
  `nombrePromocion` varchar(20) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `categoria` varchar(15) NOT NULL,
  `producto` varchar(15) NOT NULL,
  `unidades` int(11) NOT NULL,
  `importe` float NOT NULL,
  PRIMARY KEY (`codPromocion`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `promocion`
--

INSERT INTO `promocion` (`codPromocion`, `nombrePromocion`, `descripcion`, `categoria`, `producto`, `unidades`, `importe`) VALUES
(1, 'promo1', 'asdslfslfmv,cv', 'Item 1', 'Item 3', 5, 2.5),
(2, 'promo1', 'asdfghjklñ', 'Item 1', 'Item 2', 2, 4.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recarga`
--

CREATE TABLE IF NOT EXISTS `recarga` (
  `numeroCelular` varchar(12) NOT NULL,
  `nombreOperador` varchar(12) NOT NULL,
  `cantidadRecargada` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `recarga`
--

INSERT INTO `recarga` (`numeroCelular`, `nombreOperador`, `cantidadRecargada`) VALUES
('asdfdfg', 'Movistar', 5),
('987821639', 'Claro', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `codigoVenta` int(11) NOT NULL AUTO_INCREMENT,
  `fechaVenta` varchar(12) NOT NULL,
  `responsableVenta` int(4) NOT NULL,
  `codigoCliente` int(11) NOT NULL,
  `subTotalVenta` float NOT NULL,
  `descuento` float NOT NULL,
  `totalNetoVenta` float NOT NULL,
  `estadoVenta` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`codigoVenta`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`codigoVenta`, `fechaVenta`, `responsableVenta`, `codigoCliente`, `subTotalVenta`, `descuento`, `totalNetoVenta`, `estadoVenta`) VALUES
(1, '22/07/2017', 1, 1, 12.5, 2, 15.3, 1);

-- -------------------------------------------------



--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE IF NOT EXISTS `compra` (
  `numeroComprobante` varchar(15) NOT NULL,
  `proveedor` varchar(20) NOT NULL,
  `vendedor` varchar(20) NOT NULL,
  `fechaCompra` varchar(12) NOT NULL,
  `tipoPago` varchar(10) NOT NULL,
  `diasPago` int(2) NOT NULL,
  `totalPago` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`numeroComprobante`, `proveedor`, `vendedor`, `fechaCompra`, `tipoPago`, `diasPago`, `totalPago`) VALUES
('asaksjd2325', 'Item 1', 'asdglk{´p{ip', '21/07/2017', 'Credito', 7, 145.5);

-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `comprobante`
--

CREATE TABLE IF NOT EXISTS `comprobante` (
  `codigoComprobante` int(11) NOT NULL AUTO_INCREMENT,
  `tipoComprobante` varchar(12) NOT NULL,
  `serie` int(4) NOT NULL,
  `coorrelativo` int(12) NOT NULL,
  `igv` int(4) NOT NULL,
  `fechaEmision` varchar(12) NOT NULL,
  `codigoCliente` int(11) NOT NULL,
  `codigoVenta` int(11) NOT NULL,
  `subtotalComprobante` float NOT NULL,
  `totalComprobante` float NOT NULL,
  `estadoComprobante` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`codigoComprobante`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `comprobante`
--

INSERT INTO `comprobante` (`codigoComprobante`, `tipoComprobante`, `serie`, `coorrelativo`, `igv`, `fechaEmision`, `codigoCliente`, `codigoVenta`, `subtotalComprobante`, `totalComprobante`, `estadoComprobante`) VALUES
(1, 'Boleta', 1, 1020230, 18, '22/07/2017', 122700312, 1, 12.5, 16.5, 1);

-- --------------------------------------------------------









--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codCliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`codEmpleado`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `codEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;--
--


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

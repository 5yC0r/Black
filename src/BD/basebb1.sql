-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-08-2017 a las 22:06:31
-- Versión del servidor: 5.5.34
-- Versión de PHP: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `basebb1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `CodCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombreNuevaCategoria` varchar(15) NOT NULL,
  PRIMARY KEY (`CodCategoria`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`CodCategoria`, `nombreNuevaCategoria`) VALUES
(1, 'snacks'),
(2, 'bebidas'),
(3, 'gaseosas'),
(4, 'licores'),
(5, 'dulces'),
(6, 'chicles');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `codCliente` int(11) NOT NULL AUTO_INCREMENT,
  `tipoCliente` varchar(17) NOT NULL,
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
  `codEmpleado` int(11) NOT NULL,
  `fechaRegistroCliente` varchar(15) NOT NULL,
  `estadoCliente` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`codCliente`),
  KEY `codEmpleado` (`codEmpleado`),
  KEY `fk_cliente_empleado1_idx` (`codEmpleado`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codCliente`, `tipoCliente`, `tipoDoc`, `numDoc`, `razonSocial`, `nombresApellidos`, `fechaNacimiento`, `sexoCliente`, `telefonoCliente`, `celularCliente`, `correoCliente`, `direccion`, `codEmpleado`, `fechaRegistroCliente`, `estadoCliente`) VALUES
(1, '', '', '99999999', '', 'andres paredes', '', '', '', '', '', '', 2, '', 1),
(2, '', '', '00000000', '', 'Julia Cmas lrerqw respo Ruiz', '', '', '', '', '', '', 2, '', 1),
(3, 'Persona Natural', 'DNI', '10203040', '', 'Andres Caceres Perez', '14/12/1965', 'Masculino', '-', '985636952', 'andrescaceres@hotmail.com', 'zela 4512 urb. california', 5, '11/07/2017', 1),
(4, 'Persona Natural', 'DNI', '', '', 'maricarmen sanchez pereda', '14/09/1990', 'Femenino', '251425', '985362861', 'mari@gmail.com', 'suarez 372 urb. los sauces', 6, '06/07/2017', 1),
(5, 'Persona Natural', 'DNI', '12345678', '-', 'ernesto linares cabrejos', '09/11/1982', 'Masculino', '-', '996582562', 'linares0911@hotmail.com', 'galvez 785 int 12 urb. san andres', 3, '05/07/2017', 1),
(6, 'Persona Natural', 'DNI', '', '-', 'andrea martines suarez', '14/12/1994', 'Femenino', '-', '987458745', 'andre@gmail.com', 'las casuarinas 745', 3, '05/07/2017', 1),
(7, 'Persona Juridica', 'RUC', '125452187', 'UPAO', '-', '01/08/2017', 'Seleccione', '245268', '-', 'correo4@upao.edu.pe', 'california', 1, '04/08/2017', 1),
(8, 'Persona Natural', 'DNI', '654231231', '-', 'ernesto Calderon Garcia', '02/08/2017', 'Masculino', '-', '541325195', '-', 'moche ', 1, '04/08/2017', 1),
(9, 'Persona Natural', 'DNI', '56746546', '-', 'ana maria Suarez', '01/08/2017', 'Femenino', '-', '7545564', '-', '-', 2, '04/08/2017', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE IF NOT EXISTS `compra` (
  `codCompra` int(11) NOT NULL AUTO_INCREMENT,
  `numeroComprobante` varchar(15) NOT NULL,
  `codProveedor` int(1) NOT NULL,
  `codEmpleado` int(11) NOT NULL,
  `fechaCompra` varchar(12) NOT NULL,
  `tipoPago` varchar(10) NOT NULL,
  `diasPago` int(2) NOT NULL,
  `totalPago` float NOT NULL,
  PRIMARY KEY (`codCompra`),
  KEY `codProveedor` (`codProveedor`),
  KEY `fk_compra_proveedor1_idx` (`codProveedor`),
  KEY `codEmpleado` (`codEmpleado`),
  KEY `fk_compra_empleado1_idx` (`codEmpleado`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`codCompra`, `numeroComprobante`, `codProveedor`, `codEmpleado`, `fechaCompra`, `tipoPago`, `diasPago`, `totalPago`) VALUES
(1, 'asaksjd2325', 1, 4, '21/07/2017', 'Credito', 7, 145.5),
(2, 'asaksjd2325', 2, 4, '21/07/2017', 'Credito', 7, 145.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprobante`
--

CREATE TABLE IF NOT EXISTS `comprobante` (
  `codComprobante` int(11) NOT NULL AUTO_INCREMENT,
  `tipoComprobante` varchar(12) NOT NULL,
  `serie` int(4) NOT NULL,
  `coorrelativo` int(12) NOT NULL,
  `igv` int(2) NOT NULL,
  `fechaEmision` varchar(12) NOT NULL,
  `codVenta` int(11) NOT NULL,
  `subtotalComprobante` float NOT NULL,
  `totalComprobante` float NOT NULL,
  `estadoComprobante` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`codComprobante`),
  KEY `codVenta` (`codVenta`),
  KEY `fk_comprobante_venta_idx` (`codVenta`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `comprobante`
--

INSERT INTO `comprobante` (`codComprobante`, `tipoComprobante`, `serie`, `coorrelativo`, `igv`, `fechaEmision`, `codVenta`, `subtotalComprobante`, `totalComprobante`, `estadoComprobante`) VALUES
(1, 'Boleta', 1, 1020230, 18, '22/07/2017', 1, 12.5, 16.5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `codEmpleado` int(11) NOT NULL AUTO_INCREMENT,
  `nombresApellidos` varchar(50) NOT NULL,
  `telefonoContacto` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `telefonoReferencia` varchar(20) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `fechaNacimiento` varchar(12) NOT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `numeroCuenta` varchar(20) DEFAULT NULL,
  `fechaPago` int(4) NOT NULL,
  `hobby` varchar(30) DEFAULT NULL,
  `sexo` varchar(12) NOT NULL,
  `dni` varchar(12) NOT NULL,
  `sueldo` float DEFAULT NULL,
  `codUsuario` int(11) NOT NULL,
  `estadoEmpleado` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`codEmpleado`),
  KEY `codUsuario` (`codUsuario`),
  KEY `fk_empleado_usuario1_idx` (`codUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`codEmpleado`, `nombresApellidos`, `telefonoContacto`, `celular`, `telefonoReferencia`, `direccion`, `fechaNacimiento`, `correo`, `numeroCuenta`, `fechaPago`, `hobby`, `sexo`, `dni`, `sueldo`, `codUsuario`, `estadoEmpleado`) VALUES
(1, 'jacinta panpañaupa', '', '', '', '', '', '', '', 1, '', '', '10203040', 0, 1, 0),
(2, 'anito julio', '66666', '', '', '', '', '', '', 0, '', 'na', '0', 0, 2, 1),
(3, 'Andrea Gutierrez', '555555', '', '', '', '', '', '', 0, '', 'na', '0', 0, 3, 1),
(4, 'Fernanda Ganoza', '215465', '965874215', '124563', 'roma 345 urb. los jardines', '19/08/1993', 'fer@hotmail.com', '170-15462189', 2, '-', 'Femenino', '12345678', 1200, 4, 1),
(5, 'jacinta panpañaupa', '', '', '', '', '', '', '', 1, '', '', '10203040', 0, 5, 1),
(6, 'carlos andres herrera ruiz', '-', '14587964', '-', 'hnos. angulo 145 - el porvenir', '08/08/1988', 'carlosherrera@hotmail.com', '148-254-485', 10, 'pintar', 'Masculino', '10205063', 900, 6, 1),
(7, 'Juan Espinoza', '104152', '458796214', '-', 'Husarez de Junin 145', '06/08/1993', 'espinoza@gmail.com', '145-587-4669', 10, 'leer', 'Masculino', '41526385', 850, 7, 1),
(8, 'derfghjk', 'ertyu34567', '5678', '34567', '34rdefghj', '17/08/2017', 'sdfgh', '654215241', 12, '2ert', 'Seleccione', '234567', 850, 8, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE IF NOT EXISTS `empresa` (
  `codEmpresa` int(8) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `razonSocial` varchar(60) NOT NULL,
  `representanteLegal` varchar(50) NOT NULL,
  `ruc` int(14) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `Localidad` varchar(20) NOT NULL DEFAULT 'Trujillo',
  `telefono` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `correoElectronico` varchar(30) NOT NULL,
  `paginaWeb` varchar(30) DEFAULT NULL,
  `foto` varchar(100) NOT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`codEmpresa`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`codEmpresa`, `nombre`, `razonSocial`, `representanteLegal`, `ruc`, `direccion`, `Localidad`, `telefono`, `celular`, `correoElectronico`, `paginaWeb`, `foto`, `descripcion`) VALUES
(1, 'black Bar12', 'BLACK BAR S.A.C.', 'Fernanda Ganoza', 2147483600, 'urb. los rosales calle 145', 'Trujillo', '12305000', '98546789600', 'blackbar@gmail.com', 'www.blackbar.com', 'C:\\Users\\MARIANA\\Downloads\\actualizar registro\\-B4k-b--master\\src\\imagenes\\bb.jpg', 'Empresa dedicada al brindar servicio de venta de producto de consumo.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incentivo`
--

CREATE TABLE IF NOT EXISTS `incentivo` (
  `codIncentivo` int(11) NOT NULL AUTO_INCREMENT,
  `tipoIncentivo` varchar(15) NOT NULL,
  `nombreIncentivo` varchar(30) NOT NULL,
  `cantidadIncentivo` varchar(8) NOT NULL,
  `sueldoVenta` varchar(15) NOT NULL,
  `estadoIncentivo` varchar(12) NOT NULL,
  `descripcionIncentivo` varchar(150) DEFAULT NULL,
  `fechaInicio` varchar(12) NOT NULL,
  `fechaFin` varchar(12) NOT NULL,
  PRIMARY KEY (`codIncentivo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `incentivo`
--

INSERT INTO `incentivo` (`codIncentivo`, `tipoIncentivo`, `nombreIncentivo`, `cantidadIncentivo`, `sueldoVenta`, `estadoIncentivo`, `descripcionIncentivo`, `fechaInicio`, `fechaFin`) VALUES
(1, 'Bono', 'bono por 28 de julio', '20%', 'Sueldo', 'Activado', 'solo se adiciona si tiene las mayores ventas', '13/07/2017', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operador`
--

CREATE TABLE IF NOT EXISTS `operador` (
  `codOperador` int(11) NOT NULL AUTO_INCREMENT,
  `nombreOperador` varchar(20) NOT NULL,
  PRIMARY KEY (`codOperador`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Volcado de datos para la tabla `operador`
--

INSERT INTO `operador` (`codOperador`, `nombreOperador`) VALUES
(1, 'Movistar'),
(2, 'Claro'),
(3, 'Entel'),
(5, 'Bitel'),
(6, 'tintin'),
(7, 'tuntun'),
(8, 'claro2'),
(9, 'claro3'),
(10, 'claro4'),
(11, 'claro5');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precios`
--

CREATE TABLE IF NOT EXISTS `precios` (
  `codPrecio` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `valorCosto` float NOT NULL,
  `valorVenta` float NOT NULL,
  `codProducto` int(11) NOT NULL,
  PRIMARY KEY (`codPrecio`),
  KEY `codProducto` (`codProducto`),
  KEY `fk_precios_producto1_idx` (`codProducto`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=41 ;

--
-- Volcado de datos para la tabla `precios`
--

INSERT INTO `precios` (`codPrecio`, `nombre`, `valorCosto`, `valorVenta`, `codProducto`) VALUES
(1, 'precio1', 12.5, 15.2, 1),
(2, 'unidad', 12.5, 12.6, 1),
(33, 'vidrio', 5, 5.5, 1),
(34, 'botella', 6, 7, 1),
(37, 'botella', 3.2, 3.6, 25),
(38, 'caja', 5.2, 6.3, 25),
(39, 'vidrio', 1.5, 2, 26),
(40, 'plastico', 2, 2.3, 26);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `codProducto` int(11) NOT NULL AUTO_INCREMENT,
  `codigoProducto` int(20) NOT NULL,
  `nombreProducto` varchar(25) NOT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `descripcion` varchar(40) DEFAULT NULL,
  `fechaVencimiento` varchar(12) NOT NULL,
  `stock` int(11) NOT NULL,
  `puntoPedido` int(11) NOT NULL,
  `fechaRegistro` varchar(12) NOT NULL,
  `codCategoria` int(11) NOT NULL,
  `codProveedor` int(11) NOT NULL,
  `codEmpleado` int(11) NOT NULL,
  PRIMARY KEY (`codProducto`),
  KEY `codCategoria` (`codCategoria`),
  KEY `fk_producto_categoria1_idx` (`codCategoria`),
  KEY `codProveedor` (`codProveedor`),
  KEY `fk_producto_proveedor1_idx` (`codProveedor`),
  KEY `codEmpleado` (`codEmpleado`),
  KEY `fk_producto_empleado1_idx` (`codEmpleado`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codProducto`, `codigoProducto`, `nombreProducto`, `marca`, `descripcion`, `fechaVencimiento`, `stock`, `puntoPedido`, `fechaRegistro`, `codCategoria`, `codProveedor`, `codEmpleado`) VALUES
(1, 1222, 'sublime', 'ertyulopñ', 'ertyuiop', '01/07/2017', 20, 10, '19/07/2017', 2, 2, 2),
(2, 1243, 'doritos', 'chguyjklkl', 'dfghjklñxcc', '30/07/2017', 10, 5, '20/07/2017', 3, 1, 4),
(3, 1455, 'coca cola jumbo', 'coca cola', 'coca cola 12 ml grde.', '25/08/2017', 30, 10, '14/08/2017', 2, 3, 4),
(4, 56789, 'ertyu', 'xsdcfh', 'sdgtjk', '12/08/2017', 30, 10, '14/08/2017', 3, 1, 4),
(5, 45678, 'wertyui', 'asdgfhj', 'asderfyhujk', '19/08/2017', 30, 10, '14/08/2017', 3, 1, 4),
(6, 234, 'we5678i', 'jksdfghj', 'sderfgtyhuj', '26/08/2017', 30, 10, '14/08/2017', 3, 1, 4),
(7, 54653, 'dfgthjk', 'jkfgtyh', 'sdfghjk541', '18/08/2017', 30, 10, '14/08/2017', 3, 1, 4),
(8, 23456789, 'qwertyujkilo', 'asdgfhjk', 'aswdgtjklñ', '18/08/2017', 30, 10, '14/08/2017', 3, 1, 4),
(9, 345678, 'qwerfgtyhuj', 'asdgfhj', 'wsderfgtyhujki', '11/08/2017', 30, 10, '14/08/2017', 3, 1, 4),
(10, 345678, 'qwerfgtyhuj', 'asdgfhj', 'wsderfgtyhujki', '11/08/2017', 30, 10, '14/08/2017', 3, 1, 4),
(11, 345678, 'qwerfgtyhuj', 'asdgfhj', 'wsderfgtyhujki', '11/08/2017', 30, 10, '14/08/2017', 3, 1, 4),
(12, 1234567898, 'coca cola', 'coca cola', 'coca cola 12 ml grde', '19/08/2017', 30, 10, '14/08/2017', 3, 1, 4),
(13, 23456, 'qwerfgtyhu', 'ASDFGH', 'aqsdfghasdfghj', '24/08/2017', 40, 15, '14/08/2017', 3, 1, 4),
(14, 23456, 'qwerfgtyhu', 'ASDFGH', 'aqsdfghasdfghj', '24/08/2017', 40, 15, '14/08/2017', 3, 1, 4),
(15, 23456, '23456sdfg', 'dfghj', 'wsderfghj', '12/08/2017', 40, 10, '14/08/2017', 3, 1, 4),
(16, 23456, '23456sdfg', 'dfghj', 'wsderfghj', '12/08/2017', 40, 10, '14/08/2017', 3, 1, 4),
(17, 234, 'wert', 'wert', 'wert', '19/08/2017', 20, 5, '14/08/2017', 3, 1, 4),
(18, 3456, 'derfj', 'asdfgvbh', 'sdfghj', '10/08/2017', 10, 5, '14/08/2017', 3, 1, 4),
(19, 234567, 'derfgtyhj', 'zxcdfvgbn', 'sdfghj', '30/08/2017', 50, 10, '14/08/2017', 3, 1, 4),
(20, 23456, 'wertyu', 'dfgnhj', 'sdfgh', '25/08/2017', 50, 10, '14/08/2017', 3, 1, 4),
(21, 2345, 'werty', 'wsderfgt', 'wdertyu', '19/08/2017', 40, 10, '14/08/2017', 3, 1, 4),
(22, 3456, 'wert', 'werty', 'qwerty', '11/08/2017', 50, 10, '14/08/2017', 3, 1, 4),
(23, 237, 'dsfghj', 'aswderfgt', 'gtyh', '17/08/2017', 10, 3, '14/08/2017', 3, 1, 4),
(24, 1214161820, 'tabernero', 'licor tabernero', 'tabernero grde.', '26/08/2017', 40, 10, '14/08/2017', 4, 2, 4),
(25, 354512, 'inka kola china', 'inka cola', 'inka kola 10 ml ', '19/08/2017', 50, 10, '14/08/2017', 3, 1, 4),
(26, 101211416, 'pepsi jumbo', 'pepsi', 'pepsi jumbo 20ml. ', '27/08/2017', 40, 8, '15/08/2017', 2, 4, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productosadquiridos`
--

CREATE TABLE IF NOT EXISTS `productosadquiridos` (
  `codProdAdqui` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(15) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `importe` float NOT NULL,
  `codCompra` int(11) NOT NULL,
  PRIMARY KEY (`codProdAdqui`),
  KEY `codCompra` (`codCompra`),
  KEY `fk_productosAdquiridos_compra1_idx` (`codCompra`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promocion`
--

CREATE TABLE IF NOT EXISTS `promocion` (
  `codPromocion` int(11) NOT NULL AUTO_INCREMENT,
  `nombrePromocion` varchar(20) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `codProducto` int(11) NOT NULL,
  `unidades` int(11) NOT NULL,
  `importe` float NOT NULL,
  PRIMARY KEY (`codPromocion`),
  KEY `codProducto` (`codProducto`),
  KEY `fk_promocion_producto1_idx` (`codProducto`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `promocion`
--

INSERT INTO `promocion` (`codPromocion`, `nombrePromocion`, `descripcion`, `codProducto`, `unidades`, `importe`) VALUES
(1, 'promo1', 'asdslfslfmv,cv', 1, 5, 2.5),
(2, 'promo2', 'asdfghjklñ', 2, 2, 4.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `codProveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombreProveedor` varchar(30) NOT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  `numeroCuenta` varchar(20) DEFAULT NULL,
  `diaPedido1` varchar(10) NOT NULL,
  `diaPedido2` varchar(10) DEFAULT NULL,
  `estadoProveedor` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`codProveedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`codProveedor`, `nombreProveedor`, `direccion`, `telefono`, `celular`, `numeroCuenta`, `diaPedido1`, `diaPedido2`, `estadoProveedor`) VALUES
(1, 'Externo', 'sdfghjkdfghjk,', '5241', '65241', '5746d54v', 'Lunes', 'Viernes', 1),
(2, 'alicorp', 'hjk,l.ñ', '', '', '', 'Martes', 'Jueves', 1),
(3, 'backus', 'dsfgtyhukilo', '456780', '67890''', '8790-56789', 'Lunes', '', 1),
(4, 'Guzman', 'ghjk', '654', '356234', '5486-4252', 'ñlkjhg', 'jhfj', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recarga`
--

CREATE TABLE IF NOT EXISTS `recarga` (
  `codigoRecarga` int(11) NOT NULL AUTO_INCREMENT,
  `numeroCelular` varchar(12) NOT NULL,
  `codOperador` int(11) NOT NULL,
  `cantidadRecargada` float NOT NULL,
  PRIMARY KEY (`codigoRecarga`),
  KEY `codOperador` (`codOperador`),
  KEY `fk_recarga_operador1_idx` (`codOperador`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Volcado de datos para la tabla `recarga`
--

INSERT INTO `recarga` (`codigoRecarga`, `numeroCelular`, `codOperador`, `cantidadRecargada`) VALUES
(1, 'asdfdfg', 1, 5),
(2, '987821639', 1, 10),
(3, '45263258', 2, 5),
(4, '123456789', 3, 5),
(5, '123456', 3, 15),
(6, '12364589', 2, 12.3),
(7, '8796582', 3, 15),
(8, '20304051', 3, 41),
(9, '123456789', 2, 15),
(10, '987821639', 1, 5.5),
(11, '57654', 1, 23),
(12, '245465', 5, 2),
(13, '456565797989', 5, 12),
(14, '123456', 1, 10),
(15, '123456', 1, 15),
(16, '145687', 1, 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `codUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `fechaRegistro` varchar(12) NOT NULL,
  `tipoUsuario` varchar(15) NOT NULL,
  `estadoUsuario` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`codUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`codUsuario`, `usuario`, `password`, `fechaRegistro`, `tipoUsuario`, `estadoUsuario`) VALUES
(1, 'alex', '102030', 'dd/MM/yyyy', 'Trabajador', 0),
(2, 'tefa', '121416', '11/07/2017', 'Trabajador', 1),
(3, 'mariana', '102030', '12/07/2017', 'Trabajador', 1),
(4, 'admin', '123456', '03/08/2017', 'Administrador', 1),
(5, 'rosa', '123456', '04/08/2017', 'Trabajador', 1),
(6, 'carlos', '123456', '04/08/2017', 'Trabajador', 0),
(7, 'juan', '123456', '04/08/2017', 'Trabajador', 1),
(8, '', '', '14/08/2017', 'Seleccione', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `codVenta` int(11) NOT NULL AUTO_INCREMENT,
  `fechaVenta` varchar(12) NOT NULL,
  `codEmpleado` int(11) NOT NULL,
  `codCliente` int(11) NOT NULL,
  `subTotalVenta` float NOT NULL,
  `descuento` float NOT NULL,
  `totalNetoVenta` float NOT NULL,
  `estadoVenta` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`codVenta`),
  KEY `codEmpleado` (`codEmpleado`),
  KEY `fk_venta_empleado1_idx` (`codEmpleado`),
  KEY `codCliente` (`codCliente`),
  KEY `fk_venta_cliente1_idx` (`codCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`codVenta`, `fechaVenta`, `codEmpleado`, `codCliente`, `subTotalVenta`, `descuento`, `totalNetoVenta`, `estadoVenta`) VALUES
(1, '22/07/2017', 4, 1, 12.5, 2, 15.3, 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_cliente_empleado1` FOREIGN KEY (`codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `fk_compra_empleado1` FOREIGN KEY (`codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_compra_proveedor1` FOREIGN KEY (`codProveedor`) REFERENCES `proveedor` (`codProveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `comprobante`
--
ALTER TABLE `comprobante`
  ADD CONSTRAINT `fk_comprobante_venta1` FOREIGN KEY (`codVenta`) REFERENCES `venta` (`codVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `fk_empleado_usuario1` FOREIGN KEY (`codUsuario`) REFERENCES `usuario` (`codUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `precios`
--
ALTER TABLE `precios`
  ADD CONSTRAINT `fk_precios_producto1` FOREIGN KEY (`codProducto`) REFERENCES `producto` (`codProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `fk_producto_categoria1` FOREIGN KEY (`codCategoria`) REFERENCES `categoria` (`CodCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_producto_empleado1` FOREIGN KEY (`codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_producto_proveedor1` FOREIGN KEY (`codProveedor`) REFERENCES `proveedor` (`codProveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `productosadquiridos`
--
ALTER TABLE `productosadquiridos`
  ADD CONSTRAINT `fk_productosAdquiridos_compra1` FOREIGN KEY (`codCompra`) REFERENCES `compra` (`codCompra`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `promocion`
--
ALTER TABLE `promocion`
  ADD CONSTRAINT `fk_promocion_producto1` FOREIGN KEY (`codProducto`) REFERENCES `producto` (`codProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `recarga`
--
ALTER TABLE `recarga`
  ADD CONSTRAINT `fk_recarga_operador1` FOREIGN KEY (`codOperador`) REFERENCES `operador` (`codOperador`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_venta_cliente1` FOREIGN KEY (`codCliente`) REFERENCES `cliente` (`codCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_venta_empleado1` FOREIGN KEY (`codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

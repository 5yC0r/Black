-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-08-2017 a las 22:28:49
-- Versión del servidor: 5.5.34
-- Versión de PHP: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `basebb2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `CodCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombreNuevaCategoria` varchar(15) NOT NULL,
  PRIMARY KEY (`CodCategoria`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`CodCategoria`, `nombreNuevaCategoria`) VALUES
(1, 'OTRAS');

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`codEmpleado`, `nombresApellidos`, `telefonoContacto`, `celular`, `telefonoReferencia`, `direccion`, `fechaNacimiento`, `correo`, `numeroCuenta`, `fechaPago`, `hobby`, `sexo`, `dni`, `sueldo`, `codUsuario`, `estadoEmpleado`) VALUES
(1, 'SYARCORP', '', '967468524', '987821639', 'S/N', '', 'SyarcorpPeru@gmail.com', '', 1, '', '', '', 0, 1, 1);

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operador`
--

CREATE TABLE IF NOT EXISTS `operador` (
  `codOperador` int(11) NOT NULL AUTO_INCREMENT,
  `nombreOperador` varchar(20) NOT NULL,
  PRIMARY KEY (`codOperador`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `operador`
--

INSERT INTO `operador` (`codOperador`, `nombreOperador`) VALUES
(1, 'MOVISTAR'),
(2, 'CLARO'),
(3, 'ENTEL'),
(4, 'BITEL');

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`codProveedor`, `nombreProveedor`, `direccion`, `telefono`, `celular`, `numeroCuenta`, `diaPedido1`, `diaPedido2`, `estadoProveedor`) VALUES
(1, 'EXTERNO', 'S/N', '', '', '', 'LUNES', '', 1);

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
(1, 'syarcorp', '123456', '15/08/2017', 'Administrador', 1);

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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

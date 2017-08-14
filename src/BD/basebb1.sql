-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-08-2017 a las 06:53:32
-- Versión del servidor: 10.0.17-MariaDB
-- Versión de PHP: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `basebb1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `CodCategoria` int(11) NOT NULL,
  `nombreNuevaCategoria` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`CodCategoria`, `nombreNuevaCategoria`) VALUES
(1, 'snacks'),
(2, 'bebidas'),
(3, 'snacks'),
(4, 'licores'),
(5, 'dulces'),
(6, 'chicles');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `codCliente` int(11) NOT NULL,
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
  `estadoCliente` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codCliente`, `tipoCliente`, `tipoDoc`, `numDoc`, `razonSocial`, `nombresApellidos`, `fechaNacimiento`, `sexoCliente`, `telefonoCliente`, `celularCliente`, `correoCliente`, `direccion`, `codEmpleado`, `fechaRegistroCliente`, `estadoCliente`) VALUES
(1, '', '', '99999999', '', 'seas pendejo', '', '', '', '', '', '', 2, '', 1),
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

CREATE TABLE `compra` (
  `codCompra` int(11) NOT NULL,
  `numeroComprobante` varchar(15) NOT NULL,
  `codProveedor` int(1) NOT NULL,
  `codEmpleado` int(11) NOT NULL,
  `fechaCompra` varchar(12) NOT NULL,
  `tipoPago` varchar(10) NOT NULL,
  `diasPago` int(2) NOT NULL,
  `totalPago` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE `comprobante` (
  `codComprobante` int(11) NOT NULL,
  `tipoComprobante` varchar(12) NOT NULL,
  `serie` int(4) NOT NULL,
  `coorrelativo` int(12) NOT NULL,
  `igv` int(4) NOT NULL,
  `fechaEmision` varchar(12) NOT NULL,
  `codVenta` int(11) NOT NULL,
  `subtotalComprobante` float NOT NULL,
  `totalComprobante` float NOT NULL,
  `estadoComprobante` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `comprobante`
--

INSERT INTO `comprobante` (`codComprobante`, `tipoComprobante`, `serie`, `coorrelativo`, `igv`, `fechaEmision`, `codVenta`, `subtotalComprobante`, `totalComprobante`, `estadoComprobante`) VALUES
(1, 'Boleta', 1, 1020230, 18, '22/07/2017', 1, 12.5, 16.5, 1);

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
  `dni` varchar(12) NOT NULL,
  `sueldo` float NOT NULL,
  `codUsuario` int(11) NOT NULL,
  `estadoEmpleado` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(7, 'Juan Espinoza', '104152', '458796214', '-', 'Husarez de Junin 145', '06/08/1993', 'espinoza@gmail.com', '145-587-4669', 10, 'leer', 'Masculino', '41526385', 850, 7, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `codEmpresa` int(8) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `razonSocial` varchar(60) NOT NULL,
  `representanteLegal` varchar(50) NOT NULL,
  `ruc` varchar(15) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `Localidad` varchar(20) NOT NULL DEFAULT 'Trujillo',
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

INSERT INTO `empresa` (`codEmpresa`, `nombre`, `razonSocial`, `representanteLegal`, `ruc`, `direccion`, `Localidad`, `telefono`, `celular`, `correoElectronico`, `paginaWeb`, `foto`, `descripcion`) VALUES
(1, 'black Bar', 'BLACK BAR S.A.C.', 'Fernanda Ganoza', '4725968457', 'urb. los rosales calle 145', 'Trujillo', '123050', '985467896', 'blackbar@gmail.com', 'www.blackbar.com', 'C:\\Users\\MARIANA\\Downloads\\actualizar registro\\-B4k-b--master\\src\\imagenes\\bb.jpg', 'Empresa dedicada al brindar servicio de venta de producto de consumo.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incentivo`
--

CREATE TABLE `incentivo` (
  `codIncentivo` int(11) NOT NULL,
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

INSERT INTO `incentivo` (`codIncentivo`, `tipoIncentivo`, `nombreIncentivo`, `cantidadIncentivo`, `sueldoVenta`, `estadoIncentivo`, `descripcionIncentivo`, `fechaIncentivo`) VALUES
(1, 'Bono', 'bono por 28 de julio', '20%', 'Sueldo', 'Activado', 'solo se adiciona si tiene las mayores ventas', '13/07/2017');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operador`
--

CREATE TABLE `operador` (
  `codOperador` int(11) NOT NULL,
  `nombreOperador` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE `precios` (
  `codPrecio` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `valorCosto` float NOT NULL,
  `valorVenta` float NOT NULL,
  `codProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codProducto` int(11) NOT NULL,
  `codigoProducto` varchar(20) NOT NULL,
  `nombreProducto` varchar(25) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `descripcion` varchar(40) NOT NULL,
  `fechaVencimiento` varchar(12) NOT NULL,
  `stock` int(11) NOT NULL,
  `puntoPedido` int(11) NOT NULL,
  `fechaRegistro` varchar(12) NOT NULL,
  `codCategoria` int(11) NOT NULL,
  `codProveedor` int(11) NOT NULL,
  `codEmpleado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codProducto`, `codigoProducto`, `nombreProducto`, `marca`, `descripcion`, `fechaVencimiento`, `stock`, `puntoPedido`, `fechaRegistro`, `codCategoria`, `codProveedor`, `codEmpleado`) VALUES
(1, '1222,.', 'sublime', 'ertyulopñ', 'ertyuiop', '01/07/2017', 20, 10, '19/07/2017', 2, 2, 2),
(2, '1243', 'doritos', 'chguyjklkl', 'dfghjklñxcc', '30/07/2017', 10, 5, '20/07/2017', 3, 1, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productosadquiridos`
--

CREATE TABLE `productosadquiridos` (
  `codProdAdqui` int(11) NOT NULL,
  `codigo` varchar(15) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cantidad` varchar(10) NOT NULL,
  `importe` float NOT NULL,
  `codCompra` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promocion`
--

CREATE TABLE `promocion` (
  `codPromocion` int(11) NOT NULL,
  `nombrePromocion` varchar(20) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `codProducto` int(11) NOT NULL,
  `unidades` int(11) NOT NULL,
  `importe` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE `proveedor` (
  `codProveedor` int(11) NOT NULL,
  `nombreProveedor` varchar(30) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `numeroCuenta` varchar(20) NOT NULL,
  `diaPedido1` varchar(10) NOT NULL,
  `diaPedido2` varchar(10) DEFAULT NULL,
  `estadoProveedor` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`codProveedor`, `nombreProveedor`, `direccion`, `telefono`, `celular`, `numeroCuenta`, `diaPedido1`, `diaPedido2`, `estadoProveedor`) VALUES
(1, 'guzman', 'sdfghjkdfghjk,', '5241', '65241', '5746d54v', 'Lunes', 'Viernes', 1),
(2, 'alicorp', 'hjk,l.ñ', '', '', '', 'Martes', 'Jueves', 1),
(3, 'backus', 'dsfgtyhukilo', '456780', '67890''', '8790-56789', 'Lunes', '', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recarga`
--

CREATE TABLE `recarga` (
  `codigoRecarga` int(11) NOT NULL,
  `numeroCelular` varchar(12) NOT NULL,
  `codOperador` int(11) NOT NULL,
  `cantidadRecargada` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(1, 'alex', '102030', 'dd/MM/yyyy', 'Trabajador', 0),
(2, 'tefa', '121416', '11/07/2017', 'Trabajador', 1),
(3, 'mariana', '102030', '12/07/2017', 'Trabajador', 1),
(4, 'admin', '123456', '03/08/2017', 'Administrador', 1),
(5, 'rosa', '123456', '04/08/2017', 'Trabajador', 1),
(6, 'carlos', '123456', '04/08/2017', 'Trabajador', 0),
(7, 'juan', '123456', '04/08/2017', 'Trabajador', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `codVenta` int(11) NOT NULL,
  `fechaVenta` varchar(12) NOT NULL,
  `codEmpleado` int(11) NOT NULL,
  `codCliente` int(11) NOT NULL,
  `subTotalVenta` float NOT NULL,
  `descuento` float NOT NULL,
  `totalNetoVenta` float NOT NULL,
  `estadoVenta` int(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`codVenta`, `fechaVenta`, `codEmpleado`, `codCliente`, `subTotalVenta`, `descuento`, `totalNetoVenta`, `estadoVenta`) VALUES
(1, '22/07/2017', 4, 1, 12.5, 2, 15.3, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`CodCategoria`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codCliente`),
  ADD KEY `codEmpleado` (`codEmpleado`),
  ADD KEY `fk_cliente_empleado1_idx` (`codEmpleado`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`codCompra`),
  ADD KEY `codProveedor` (`codProveedor`),
  ADD KEY `fk_compra_proveedor1_idx` (`codProveedor`),
  ADD KEY `codEmpleado` (`codEmpleado`),
  ADD KEY `fk_compra_empleado1_idx` (`codEmpleado`);

--
-- Indices de la tabla `comprobante`
--
ALTER TABLE `comprobante`
  ADD PRIMARY KEY (`codComprobante`),
  ADD KEY `codVenta` (`codVenta`),
  ADD KEY `fk_comprobante_venta_idx` (`codVenta`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`codEmpleado`),
  ADD KEY `codUsuario` (`codUsuario`),
  ADD KEY `fk_empleado_usuario1_idx` (`codUsuario`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`codEmpresa`);

--
-- Indices de la tabla `incentivo`
--
ALTER TABLE `incentivo`
  ADD PRIMARY KEY (`codIncentivo`);

--
-- Indices de la tabla `operador`
--
ALTER TABLE `operador`
  ADD PRIMARY KEY (`codOperador`);

--
-- Indices de la tabla `precios`
--
ALTER TABLE `precios`
  ADD PRIMARY KEY (`codPrecio`),
  ADD KEY `codProducto` (`codProducto`),
  ADD KEY `fk_precios_producto1_idx` (`codProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codProducto`),
  ADD KEY `codCategoria` (`codCategoria`),
  ADD KEY `fk_producto_categoria1_idx` (`codCategoria`),
  ADD KEY `codProveedor` (`codProveedor`),
  ADD KEY `fk_producto_proveedor1_idx` (`codProveedor`),
  ADD KEY `codEmpleado` (`codEmpleado`),
  ADD KEY `fk_producto_empleado1_idx` (`codEmpleado`);

--
-- Indices de la tabla `productosadquiridos`
--
ALTER TABLE `productosadquiridos`
  ADD PRIMARY KEY (`codProdAdqui`),
  ADD KEY `codCompra` (`codCompra`),
  ADD KEY `fk_productosAdquiridos_compra1_idx` (`codCompra`);

--
-- Indices de la tabla `promocion`
--
ALTER TABLE `promocion`
  ADD PRIMARY KEY (`codPromocion`),
  ADD KEY `codProducto` (`codProducto`),
  ADD KEY `fk_promocion_producto1_idx` (`codProducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`codProveedor`);

--
-- Indices de la tabla `recarga`
--
ALTER TABLE `recarga`
  ADD PRIMARY KEY (`codigoRecarga`),
  ADD KEY `codOperador` (`codOperador`),
  ADD KEY `fk_recarga_operador1_idx` (`codOperador`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codUsuario`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`codVenta`),
  ADD KEY `codEmpleado` (`codEmpleado`),
  ADD KEY `fk_venta_empleado1_idx` (`codEmpleado`),
  ADD KEY `codCliente` (`codCliente`),
  ADD KEY `fk_venta_cliente1_idx` (`codCliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `CodCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `codCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `comprobante`
--
ALTER TABLE `comprobante`
  MODIFY `codComprobante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `codEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `codEmpresa` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `incentivo`
--
ALTER TABLE `incentivo`
  MODIFY `codIncentivo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `operador`
--
ALTER TABLE `operador`
  MODIFY `codOperador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `precios`
--
ALTER TABLE `precios`
  MODIFY `codPrecio` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `codProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `productosadquiridos`
--
ALTER TABLE `productosadquiridos`
  MODIFY `codProdAdqui` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `promocion`
--
ALTER TABLE `promocion`
  MODIFY `codPromocion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `codProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `recarga`
--
ALTER TABLE `recarga`
  MODIFY `codigoRecarga` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `codVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
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

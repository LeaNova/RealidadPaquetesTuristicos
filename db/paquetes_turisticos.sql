-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-11-2021 a las 00:34:08
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `paquetes_turisticos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamiento`
--

CREATE TABLE `alojamiento` (
  `id_alojamiento` int(11) NOT NULL,
  `tipo_alojamiento` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `ubicacion` varchar(50) NOT NULL,
  `costo` double NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alojamiento`
--

INSERT INTO `alojamiento` (`id_alojamiento`, `tipo_alojamiento`, `nombre`, `ubicacion`, `costo`, `activo`) VALUES
(1, 'Hotel', 'Hotel Turismo IDE', 'San Algunlugar', 750, 1),
(2, 'Hostal', 'Hostal El Barrio', 'Aguilea', 380, 1),
(3, 'Hostal', 'Descanzo el Ritual', '', 250, 1),
(4, 'Resort', 'Resort: Buen aire', 'San Algunlugar', 1000, 1),
(5, 'Resto', 'Resto La cama de dios', 'Puerto Deseado', 480, 1),
(6, 'Resto', 'Resto La cama de dios', 'Puerto Deseado', 480, 1),
(7, 'Hotel', 'Hotel la vista', 'Buenos Aires', 500, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` int(8) NOT NULL,
  `contacto` varchar(50) NOT NULL,
  `celular` int(13) NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nombre`, `dni`, `contacto`, `celular`, `activo`) VALUES
(1, 'Alejandro Martinez', 29255378, 'ale_martinez@hotmail.com', 155687985, 1),
(2, 'Esteban Carrizo', 31555987, 'e_c_1997@hotmail.com', 266560045, 1),
(3, 'Maria Antonieta', 39278978, 'mariaanto@hotmail.com', 297897455, 1),
(4, 'Julia Carla Hernandez', 25985122, 'jc_hernandez@hotmail.com', 355314697, 1),
(5, 'Valentina Ortiz', 48223399, 'valentina_o@hotmail.com', 297684115, 1),
(7, 'Ramiro Rodriguez', 38123875, 'r_r@hotmail.com', 268978815, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `destino`
--

CREATE TABLE `destino` (
  `id_destino` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `pais` varchar(50) NOT NULL,
  `fecha_altaInicial` date NOT NULL,
  `fecha_altaFinal` date NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `destino`
--

INSERT INTO `destino` (`id_destino`, `nombre`, `pais`, `fecha_altaInicial`, `fecha_altaFinal`, `activo`) VALUES
(1, 'San Algunlugar', 'Argentina', '2021-10-25', '2021-10-30', 1),
(2, 'Aguilea', 'Argentina', '2021-01-15', '2021-01-23', 1),
(3, 'Descanzo el Ritual', 'Peru', '2011-07-30', '2011-08-05', 1),
(4, 'Resort: Buen aire', 'Peru', '2017-02-01', '2017-02-21', 1),
(5, 'Puerto Deseado', 'Argentina', '2021-10-25', '2021-10-30', 1),
(7, 'Buenos Aires', 'Argentina', '2021-10-25', '2021-10-30', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL,
  `tipo_menu` varchar(50) NOT NULL,
  `costo` double NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `menu`
--

INSERT INTO `menu` (`id_menu`, `tipo_menu`, `costo`, `activo`) VALUES
(1, 'Desayuno', 150, 1),
(2, 'Desayuno-Cena', 400, 1),
(3, 'Cena', 250, 1),
(4, 'Sin menu', 0, 1),
(5, 'Desayuno', 250, 1),
(6, 'Desayuno', 250, 1),
(7, 'Cena', 350, 1),
(8, 'Merienda', 130, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquete`
--

CREATE TABLE `paquete` (
  `id_paquete` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_transporte` int(11) NOT NULL,
  `id_alojamiento` int(11) NOT NULL,
  `id_menu` int(11) NOT NULL,
  `id_destino` int(11) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_final` date NOT NULL,
  `costo_total` double NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paquete`
--

INSERT INTO `paquete` (`id_paquete`, `id_cliente`, `id_transporte`, `id_alojamiento`, `id_menu`, `id_destino`, `fecha_inicio`, `fecha_final`, `costo_total`, `activo`) VALUES
(25, 0, 0, 0, 0, 0, '2021-10-26', '2021-10-30', 3020.5, 1),
(26, 0, 0, 0, 0, 0, '2021-10-26', '2021-10-30', 3200.5, 1),
(27, 7, 7, 7, 7, 7, '2021-10-26', '2021-10-30', 3200.5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transporte`
--

CREATE TABLE `transporte` (
  `id_transporte` int(11) NOT NULL,
  `tipo_transporte` varchar(50) NOT NULL,
  `fecha_llegada` date NOT NULL,
  `fecha_partida` date NOT NULL,
  `costo` double NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `transporte`
--

INSERT INTO `transporte` (`id_transporte`, `tipo_transporte`, `fecha_llegada`, `fecha_partida`, `costo`, `activo`) VALUES
(1, 'Coche cama', '2021-10-25', '2021-10-26', 850.5, 1),
(2, 'Avion', '2011-07-28', '2011-07-29', 1600, 1),
(3, 'Avion', '2017-02-01', '2017-02-01', 1950.5, 1),
(4, 'Colectivo', '2021-01-24', '2021-01-25', 850.5, 1),
(5, 'Coche cama', '2021-10-25', '2021-10-26', 850.5, 1),
(6, 'Coche cama', '2021-10-25', '2021-10-26', 850.5, 1),
(7, 'Coche cama', '2021-10-25', '2021-10-26', 850.5, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD PRIMARY KEY (`id_alojamiento`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `destino`
--
ALTER TABLE `destino`
  ADD PRIMARY KEY (`id_destino`);

--
-- Indices de la tabla `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id_menu`);

--
-- Indices de la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD PRIMARY KEY (`id_paquete`);

--
-- Indices de la tabla `transporte`
--
ALTER TABLE `transporte`
  ADD PRIMARY KEY (`id_transporte`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  MODIFY `id_alojamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `destino`
--
ALTER TABLE `destino`
  MODIFY `id_destino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `menu`
--
ALTER TABLE `menu`
  MODIFY `id_menu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `paquete`
--
ALTER TABLE `paquete`
  MODIFY `id_paquete` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `transporte`
--
ALTER TABLE `transporte`
  MODIFY `id_transporte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-11-2021 a las 19:21:12
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
-- Estructura de tabla para la tabla `destino`
--

CREATE TABLE `destino` (
  `id_destino` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `pais` varchar(50) NOT NULL,
  `fecha_altaInicial` date NOT NULL,
  `fecha_altaFinal` date NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `destino`
--

INSERT INTO `destino` (`id_destino`, `nombre`, `pais`, `fecha_altaInicial`, `fecha_altaFinal`, `activo`) VALUES
(1, 'Buenos Aires', 'Argentina', '2021-11-30', '2021-11-30', 1),
(2, 'Buenos Aires', 'Argentina', '2021-10-25', '2021-10-30', 1),
(3, 'Puerto Deseado', 'Argentina', '2021-01-15', '2021-01-23', 1),
(4, 'Lima', 'Peru', '2011-07-30', '2011-08-05', 1),
(5, 'Lima', 'Peru', '2017-02-01', '2017-02-11', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `destino`
--
ALTER TABLE `destino`
  ADD PRIMARY KEY (`id_destino`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `destino`
--
ALTER TABLE `destino`
  MODIFY `id_destino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

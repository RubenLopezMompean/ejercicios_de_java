-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-05-2016 a las 13:01:48
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.5.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `real_murcia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plantilla`
--

CREATE TABLE `plantilla` (
  `CodJu` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_bin NOT NULL,
  `Apellidos` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `Edad` varchar(12) COLLATE utf8_bin NOT NULL,
  `DNI` char(9) COLLATE utf8_bin NOT NULL,
  `Nacionalidad` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `Posicion` varchar(30) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `plantilla`
--

INSERT INTO `plantilla` (`CodJu`, `Nombre`, `Apellidos`, `Edad`, `DNI`, `Nacionalidad`, `Posicion`) VALUES
(1, 'Fernando', 'Martínez Rubio', '1990', '', 'España', 'Portero'),
(2, 'José', 'Navarro', '1988', '88877557F', 'Alemania', 'Defensa'),
(4, 'Alejandro', 'Zambrana', '1988', '99988899F', 'Rumania', 'Defensa'),
(8, 'Alejandro', 'Chavero', '1984', '22233344F', 'España', 'Centrocampista'),
(9, 'Elena', 'Tellez', '1979', '33344433F', 'España', 'Delantero'),
(10, 'Rubén', 'López Mompeán', '1986', '44455555F', 'España', 'Centrocampista'),
(11, 'Arturo', 'Molina', '1996', '66656565F', 'España', 'Delantero'),
(13, 'José Antonio', 'Arroyo', '1990', '55544466F', 'Portugues', 'Portero');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `plantilla`
--
ALTER TABLE `plantilla`
  ADD PRIMARY KEY (`CodJu`),
  ADD UNIQUE KEY `DNI` (`DNI`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

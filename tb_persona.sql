-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-06-2022 a las 06:55:23
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tb_recursohumano`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_persona`
--

DROP TABLE IF EXISTS `tb_persona`;
CREATE TABLE `tb_persona` (
  `dui_persona` varchar(10) NOT NULL,
  `apellido_persona` varchar(30) NOT NULL,
  `nombre_persona` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_persona`
--

INSERT INTO `tb_persona` (`dui_persona`, `apellido_persona`, `nombre_persona`) VALUES
('098765434', 'hernandez Ruiz', 'Marta Karina'),
('1234567', 'leivaRivera', 'KarlaLeiva');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_persona`
--
ALTER TABLE `tb_persona`
  ADD PRIMARY KEY (`dui_persona`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

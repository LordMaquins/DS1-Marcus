-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 18-Maio-2023 às 00:53
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `estacionamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carro`
--

DROP TABLE IF EXISTS `carro`;
CREATE TABLE IF NOT EXISTS `carro` (
  `placa` varchar(250) NOT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `teste` varchar(250) NOT NULL,
  `chassi` varchar(250) DEFAULT NULL,
  `marca` varchar(250) DEFAULT NULL,
  `modelo` varchar(250) DEFAULT NULL,
  `calota` varchar(250) DEFAULT NULL,
  `nomeMotorista` varchar(250) DEFAULT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  `numeroVaga` varchar(250) DEFAULT NULL,
  `horario` varchar(250) DEFAULT NULL,
  `estofado` varchar(250) DEFAULT NULL,
  `tipo` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`placa`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `carro`
--

INSERT INTO `carro` (`placa`, `cor`, `teste`, `chassi`, `marca`, `modelo`, `calota`, `nomeMotorista`, `descricao`, `numeroVaga`, `horario`, `estofado`, `tipo`) VALUES
('JKL2897', 'Verde', '', 'PO2910JUTRD1032', 'McLaren', 'McLaren Senna', 'Espelhada', 'Wilson', 'Carro 3', '210', '19:45', 'Couro', 'Grande');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

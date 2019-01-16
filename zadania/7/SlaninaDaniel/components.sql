-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 23, 2018 at 04:59 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `components`
--

-- --------------------------------------------------------

--
-- Table structure for table `cpu`
--

CREATE TABLE `cpu` (
  `id` int(5) NOT NULL,
  `name` varchar(20) COLLATE utf8_slovak_ci DEFAULT NULL,
  `speed` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL,
  `threads` int(5) DEFAULT NULL,
  `price` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_slovak_ci;

--
-- Dumping data for table `cpu`
--

INSERT INTO `cpu` (`id`, `name`, `speed`, `threads`, `price`) VALUES
(1, 'i7-8700K', '3700', 12, '370'),
(2, 'i5-8600K', '3600', 6, '310'),
(3, 'i3-8100', '3600', 4, '110');

-- --------------------------------------------------------

--
-- Table structure for table `drive`
--

CREATE TABLE `drive` (
  `id` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf8_slovak_ci DEFAULT NULL,
  `type` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL,
  `size` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL COMMENT 'in Gigabytes',
  `price` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL COMMENT 'in €\n'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_slovak_ci;

--
-- Dumping data for table `drive`
--

INSERT INTO `drive` (`id`, `name`, `type`, `size`, `price`) VALUES
(1, 'Samsung 860 EVO', 'SSD', '500', '95'),
(2, 'Intel 545s', 'SSD', '512', '115'),
(3, 'Seagate BarraCuda', 'HDD', '2000', '55');

-- --------------------------------------------------------

--
-- Table structure for table `graphicscard`
--

CREATE TABLE `graphicscard` (
  `id` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf8_slovak_ci DEFAULT NULL,
  `type` varchar(20) COLLATE utf8_slovak_ci DEFAULT NULL COMMENT 'NVIDIA/AMD',
  `budgetClass` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL COMMENT 'BUDGET/ MID-TIER/ HIGH-END',
  `price` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL COMMENT 'in €'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_slovak_ci;

--
-- Dumping data for table `graphicscard`
--

INSERT INTO `graphicscard` (`id`, `name`, `type`, `budgetClass`, `price`) VALUES
(1, 'GTX 1080 Ti', 'NVIDIA', 'HIGH-END', '750'),
(2, 'RX 580', 'AMD', 'MID-TIER', '260'),
(3, 'GTX 1050', 'NVIDIA', 'BUDGET', '130');

-- --------------------------------------------------------

--
-- Table structure for table `ram`
--

CREATE TABLE `ram` (
  `id` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf8_slovak_ci DEFAULT NULL,
  `type` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL COMMENT 'DDR?',
  `size` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL COMMENT 'In MB',
  `speed` varchar(10) COLLATE utf8_slovak_ci DEFAULT NULL COMMENT 'in MHz',
  `price` varchar(5) COLLATE utf8_slovak_ci DEFAULT NULL COMMENT 'in €'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_slovak_ci;

--
-- Dumping data for table `ram`
--

INSERT INTO `ram` (`id`, `name`, `type`, `size`, `speed`, `price`) VALUES
(2, 'HyperX Predator', 'DDR4', '16000', '3600', '170'),
(3, 'ADATA', 'DDR4', '32000', '3000', '280'),
(4, 'HyperX Fury', 'DDR3', '8000', '1600', '55');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cpu`
--
ALTER TABLE `cpu`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `drive`
--
ALTER TABLE `drive`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `graphicscard`
--
ALTER TABLE `graphicscard`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ram`
--
ALTER TABLE `ram`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cpu`
--
ALTER TABLE `cpu`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `drive`
--
ALTER TABLE `drive`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `graphicscard`
--
ALTER TABLE `graphicscard`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `ram`
--
ALTER TABLE `ram`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

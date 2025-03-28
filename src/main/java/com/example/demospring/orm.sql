-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 26, 2025 at 11:41 AM
-- Wersja serwera: 10.4.32-MariaDB
-- Wersja PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `orm`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `users`
--
CREATE DATABASE orm;
USE orm;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_polish_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`) VALUES
(1, 'Anna Kowalska', 'anna.kowalska@example.com'),
(2, 'Jan Nowak', 'jan.nowak@example.com'),
(3, 'Piotr Zieliński', 'piotr.zielinski@example.com'),
(4, 'Ewa Wiśniewska', 'ewa.wisniewska@example.com'),
(5, 'Tomasz Lewandowski', 'tomasz.lewandowski@example.com'),
(6, 'Katarzyna Malinowska', 'katarzyna.malinowska@example.com'),
(7, 'Michał Nowicki', 'michal.nowicki@example.com'),
(8, 'Aleksandra Grabowska', 'aleksandra.grabowska@example.com'),
(9, 'Rafał Kamiński', 'rafal.kaminski@example.com'),
(10, 'Natalia Dąbrowska', 'natalia.dabrowska@example.com'),
(11, 'Kamil Szymański', 'kamil.szymanski@example.com'),
(12, 'Monika Król', 'monika.krol@example.com'),
(13, 'Paweł Pawlak', 'pawel.pawlak@example.com'),
(14, 'Zuzanna Wójcik', 'zuzanna.wojcik@example.com'),
(15, 'Adam Kaczmarek', 'adam.kaczmarek@example.com');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

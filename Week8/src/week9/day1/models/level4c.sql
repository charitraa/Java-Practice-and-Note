-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 14, 2023 at 03:41 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `level4c`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_newpersons`
--

CREATE TABLE `tbl_newpersons` (
  `pid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_newpersons`
--

INSERT INTO `tbl_newpersons` (`pid`, `name`, `address`, `email`) VALUES
(1, 'Raj', 'BHK', 'raj@gmail.com'),
(2, 'Raj', 'BHK', 'raj@gmail.com'),
(3, 'Krish', 'LAT', 'krishna@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_persons`
--

CREATE TABLE `tbl_persons` (
  `pid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_persons`
--

INSERT INTO `tbl_persons` (`pid`, `name`) VALUES
(10, 'Rajesh Rai');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `uid` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_pass` varchar(50) NOT NULL,
  `is_user` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`uid`, `user_name`, `user_pass`, `is_user`) VALUES
(1, 'admin', 'admin', 'false');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_newpersons`
--
ALTER TABLE `tbl_newpersons`
  ADD PRIMARY KEY (`pid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

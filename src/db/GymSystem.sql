-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2024 at 06:09 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `comp_sys`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sub`
--

CREATE TABLE `tbl_sub` (
  `s_id` int(50) NOT NULL,
  `s_fname` varchar(50) NOT NULL,
  `s_lname` varchar(50) NOT NULL,
  `s_sdate` date NOT NULL,
  `s_edate` date NOT NULL,
  `s_status` varchar(50) NOT NULL,
  `s_image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_sub`
--

INSERT INTO `tbl_sub` (`s_id`, `s_fname`, `s_lname`, `s_sdate`, `s_edate`, `s_status`, `s_image`) VALUES
(1, 'Al Danver', 'Lascuña', '2024-05-30', '2024-06-30', 'Active', ''),
(2, 'test', 'al', '2024-10-30', '2024-11-30', 'Active', ''),
(3, 'adasd', 'yes', '2024-05-30', '2024-06-30', 'Pending', 'src/images/Screenshot (3).png');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(50) NOT NULL,
  `user_firstname` varchar(50) NOT NULL,
  `user_lastname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_account` varchar(50) NOT NULL,
  `user_status` varchar(50) NOT NULL,
  `user_image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `user_firstname`, `user_lastname`, `username`, `password`, `user_email`, `user_account`, `user_status`, `user_image`) VALUES
(1, 'mic', 'test', 'mictest', '12345678', 'test1@gmail.com', 'Admin', 'Active', ''),
(2, 'test', 'test1', 'test2', '123456789', 'alexiskinabangan.com', 'Admin', 'Active', ''),
(3, 'test3', 'test3', 'test3', 'al654321', 'test3@gmail.com', 'Admin', 'Active', ''),
(4, 'Vincent', 'Abellana', 'kiseryota', 'ipvPHlHoEtCvhGWo28yfdBBkvwrzs9COawJGQ3wZ9/s=', 'alexiskinabangan@gmail.com', 'Admin', 'Active', ''),
(5, 'test4', 'test4', 'test4', '123456789', 'alleahmitch55@gmail.com', 'User', 'Active', ''),
(6, 'test5', 'al', 'al', 'x3Xnt1ft5jDNCqERO9ECZhqziCnKUqZCKreChi8mhkY=', 'test5@gmail.com', 'User', 'Active', ''),
(7, 'kiseryota232', 'asd', 'test', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'garuburn1205', 'Manager', 'Active', ''),
(8, 'test7asd', 'asd', 'tes8', '123456890', 'asdd', 'User', 'Active', ''),
(9, 'asd', 'asd', 'asd', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'asd', 'User', 'Active', ''),
(10, 'test', 'al', 'al', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'al@gmail.com', 'Manager', 'Active', ''),
(11, 'al', 'al', 'dan', 'hNiYd/DUBB77a/kaFvAkjy/Vc+avBcGflr7bn4gveII=', 'test@gmail.com', 'Manager', 'Active', ''),
(12, 'test1', 'test', 'asweqwe', '0123456789', 'dan@gamil.com', 'Manager', 'Active', 'src/images/Screenshot (1).png'),
(13, 'qwe', 'qwe', 'qwe', '123456789', 'qwe@gmail.com', 'User', 'Active', ''),
(14, 'qwe', 'qwe', 'ewq', '123456789', 'ewq@gmail.com', 'User', 'Active', ''),
(15, 'qwe', 'qwe', 'tes9', '123456789', 'tes9', 'User', 'Active', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_usub`
--

CREATE TABLE `tbl_usub` (
  `us_id` int(50) NOT NULL,
  `user_id` int(50) NOT NULL,
  `s_id` int(50) NOT NULL,
  `us_date` date NOT NULL,
  `us_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_sub`
--
ALTER TABLE `tbl_sub`
  ADD PRIMARY KEY (`s_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `tbl_usub`
--
ALTER TABLE `tbl_usub`
  ADD PRIMARY KEY (`us_id`),
  ADD KEY `userid` (`user_id`),
  ADD KEY `sid` (`s_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_sub`
--
ALTER TABLE `tbl_sub`
  MODIFY `s_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `tbl_usub`
--
ALTER TABLE `tbl_usub`
  MODIFY `us_id` int(50) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_usub`
--
ALTER TABLE `tbl_usub`
  ADD CONSTRAINT `sid` FOREIGN KEY (`s_id`) REFERENCES `tbl_sub` (`s_id`),
  ADD CONSTRAINT `userid` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

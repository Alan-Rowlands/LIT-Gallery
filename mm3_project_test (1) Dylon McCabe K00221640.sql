-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 29, 2019 at 05:55 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mm3_project_test`
--

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `Comment_ID` int(11) NOT NULL,
  `Entry_ID` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL,
  `Comment` varchar(300) NOT NULL,
  `ParentComment_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`Comment_ID`, `Entry_ID`, `User_ID`, `Comment`, `ParentComment_ID`) VALUES
(1, 1, 1, 'evan grimes is a great lover', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `CourseID` int(11) NOT NULL,
  `CourseName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`CourseID`, `CourseName`) VALUES
(1, 'Multimedia'),
(2, 'Software'),
(3, 'Creative Multimedia');

-- --------------------------------------------------------

--
-- Table structure for table `entries`
--

CREATE TABLE `entries` (
  `entry_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `date_uploaded` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `title` varchar(30) NOT NULL,
  `description` varchar(30) NOT NULL,
  `price` varchar(10) NOT NULL,
  `image` varchar(60) NOT NULL,
  `ratings` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entries`
--

INSERT INTO `entries` (`entry_id`, `user_id`, `date_uploaded`, `title`, `description`, `price`, `image`, `ratings`) VALUES
(1, 1, '2018-12-10 14:01:02', 'First Upload', 'Im the first uploader', '13.99', 'image.jpg', NULL),
(2, 2, '2019-01-21 11:43:08', 'Interactive', 'Interactive ', '5', 'image.jpg', NULL),
(3, 3, '2019-01-21 11:47:20', 'howdy ho', 'hiddy hi', '20', 'image.jpg', NULL),
(4, 2, '2019-01-21 11:48:29', 'Yurt MaGee', 'flurt frgee', '10', 'image.jpg', NULL),
(5, 4, '2019-01-22 13:06:49', 'hippity hoppity', 'get off my property', '184.5', 'image.jpg', 100),
(9, 4, '2019-01-29 08:46:15', 'yeah boi', 'eyy', '300', 'img8.jpg', 0),
(10, 4, '2019-01-29 09:26:23', 'yeah boi', 'eyy', '50', 'artgraffiti.jpg', 0),
(11, 12, '2019-01-29 12:04:26', 'first upload', 'My first upload', '52.5', 'img3.jpeg', 0);

-- --------------------------------------------------------

--
-- Table structure for table `entries/shows`
--

CREATE TABLE `entries/shows` (
  `entries/shows_id` int(11) NOT NULL,
  `Entry_ID` int(11) NOT NULL,
  `Show_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entries/shows`
--

INSERT INTO `entries/shows` (`entries/shows_id`, `Entry_ID`, `Show_ID`) VALUES
(1, 1, 1),
(2, 5, 1),
(3, 5, 1),
(4, 9, 1),
(5, 11, 1);

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE `rating` (
  `Rating_ID` int(11) NOT NULL,
  `Entry_ID` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rating`
--

INSERT INTO `rating` (`Rating_ID`, `Entry_ID`, `User_ID`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `shows`
--

CREATE TABLE `shows` (
  `show_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `duration` time NOT NULL,
  `title` varchar(30) NOT NULL,
  `description` varchar(30) DEFAULT NULL,
  `image` varchar(60) NOT NULL,
  `user_id` int(11) NOT NULL,
  `date_live` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shows`
--

INSERT INTO `shows` (`show_id`, `course_id`, `duration`, `title`, `description`, `image`, `user_id`, `date_live`) VALUES
(1, 321, '24:00:00', 'First Show', 'Yurt First Show', 'First', 0, '2018-12-25');

-- --------------------------------------------------------

--
-- Table structure for table `tags`
--

CREATE TABLE `tags` (
  `Tag_ID` int(11) NOT NULL,
  `Tag_Name` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `upload/tags`
--

CREATE TABLE `upload/tags` (
  `Upload_ID` int(11) NOT NULL,
  `Tag_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `profile_pic` varchar(60) NOT NULL DEFAULT 'profo.png',
  `password` varchar(15) NOT NULL,
  `date_joined` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `account_type` enum('Member','Admin') NOT NULL,
  `bio` varchar(50) DEFAULT NULL,
  `course` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `first_name`, `last_name`, `email`, `profile_pic`, `password`, `date_joined`, `account_type`, `bio`, `course`) VALUES
(1, 'd', 'd', 'd@lit.ie', '', 'dddddd', NULL, 'Member', NULL, 'Multimedia'),
(3, 'Alan', 'Rowlands', 'AlanRowlands@mrGinge.com', '', 'r', '2018-12-10 12:11:19', 'Admin', NULL, NULL),
(4, 'rob', 'rob', 'rob@robmail.rob', 'profo.png', 'rob', '2018-12-12 11:04:41', 'Member', 'rob', NULL),
(5, 'cham', 'rangs', 'huifuqui@email.com', 'profo.png', '4', '2018-12-12 11:38:47', 'Admin', NULL, NULL),
(6, 'f', 'f', 'f@mail.com', 'profo.png', 'f', '2019-01-29 08:53:21', 'Member', '', NULL),
(7, 'mr', 'gonzales', 'd@derpmail.com', 'profo.png', 'f', '2019-01-29 09:00:41', 'Member', '', NULL),
(8, 'dylon', 'mccabe', 'dylon.mccabe@gmail.com', 'profo.png', 'b', '2019-01-29 09:01:42', 'Member', NULL, NULL),
(9, 'g', 'g', 'g@g.g', 'profo.png', 'g', '2019-01-29 09:04:26', 'Member', '', NULL),
(10, 'Derdinand', 'Heinlein', 'Swartz@gmail.com', 'profo.png', 'Hanz', '2019-01-29 10:26:45', 'Member', NULL, 'Software'),
(11, 't', 't', 't@tmail.t', 'profo.png', 't', '2019-01-29 10:31:43', 'Member', NULL, 'Construction'),
(12, 'andrew', 'mccabe', 'mccabe@gmail.com', '2-2.png', 'a', '2019-01-29 12:02:21', 'Member', 'hi im andy', 'Construction');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`Comment_ID`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`CourseID`);

--
-- Indexes for table `entries`
--
ALTER TABLE `entries`
  ADD PRIMARY KEY (`entry_id`);

--
-- Indexes for table `entries/shows`
--
ALTER TABLE `entries/shows`
  ADD PRIMARY KEY (`entries/shows_id`);

--
-- Indexes for table `rating`
--
ALTER TABLE `rating`
  ADD PRIMARY KEY (`Rating_ID`);

--
-- Indexes for table `shows`
--
ALTER TABLE `shows`
  ADD PRIMARY KEY (`show_id`);

--
-- Indexes for table `tags`
--
ALTER TABLE `tags`
  ADD PRIMARY KEY (`Tag_ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `Comment_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `CourseID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `entries`
--
ALTER TABLE `entries`
  MODIFY `entry_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `entries/shows`
--
ALTER TABLE `entries/shows`
  MODIFY `entries/shows_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `rating`
--
ALTER TABLE `rating`
  MODIFY `Rating_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `shows`
--
ALTER TABLE `shows`
  MODIFY `show_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tags`
--
ALTER TABLE `tags`
  MODIFY `Tag_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

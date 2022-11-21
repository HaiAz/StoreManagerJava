-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 06, 2022 at 05:03 PM
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
-- Database: `quanlycuahang`
--

-- --------------------------------------------------------

--
-- Table structure for table `cthoadon`
--

CREATE TABLE `cthoadon` (
  `SoHD` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `MaHang` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `cthoadon`
--

INSERT INTO `cthoadon` (`SoHD`, `MaHang`, `SoLuong`, `DonGia`) VALUES
('099', 'MH01', 9, 25000),
('099', 'MH02', 27, 15000),
('1', 'MH01', 3, 25000),
('1111', 'MH02', 1, 15000),
('2', 'MH01', 3, 25000),
('2', 'MH02', 3, 15000),
('32', 'MH02', 3, 15000),
('4', 'MH01', 2, 25000),
('4322', 'MH02', 1, 15000),
('433', 'MH02', 88, 15000),
('55', 'MH02', 7, 15000),
('7675', 'MH01', 10, 25000),
('7675', 'MH02', 5, 15000),
('8', 'MH02', 5, 15000),
('876', 'MH02', 6, 15000),
('987', 'MH01', 45, 25000),
('987', 'MH02', 27, 15000);

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `SoHD` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `NgayBan` date NOT NULL,
  `MaKH` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `MaNV` varchar(15) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`SoHD`, `NgayBan`, `MaKH`, `MaNV`) VALUES
('099', '2022-11-06', 'KH01', '1001'),
('1', '2022-11-05', 'KH01', '1001'),
('1111', '2022-11-06', 'KH01', '1001'),
('2', '2022-11-05', 'KH01', '1001'),
('32', '2022-11-06', 'KH01', '1001'),
('4', '2022-11-05', 'KH01', '1001'),
('4322', '2022-11-06', 'KH01', '1001'),
('433', '2022-11-06', 'KH01', '1003'),
('55', '2022-11-05', 'KH01', '1001'),
('7675', '2022-11-06', 'KH02', '1001'),
('8', '2022-11-05', 'KH01', '1001'),
('876', '2022-11-05', 'KH01', '1001'),
('987', '2022-11-06', 'KH01', '1001');

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKH` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `TenKH` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `DiaChi` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` varchar(11) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`) VALUES
('KH01', 'Lê Hoàng', 'Hà Nội', '093838321'),
('KH02', 'Nguyễn Tiến Anh', 'Hà Nội', '0948483823');

-- --------------------------------------------------------

--
-- Table structure for table `loaihang`
--

CREATE TABLE `loaihang` (
  `MaLoai` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `TenLoai` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `loaihang`
--

INSERT INTO `loaihang` (`MaLoai`, `TenLoai`) VALUES
('LH01', 'Kem đánh răng'),
('LH02', 'Nước giải khát'),
('LH03', 'Mì ăn liền'),
('LH04', 'Nước lau nhà');

-- --------------------------------------------------------

--
-- Table structure for table `mathang`
--

CREATE TABLE `mathang` (
  `MaHang` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `TenHang` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `DVT` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `DonGia` int(11) NOT NULL,
  `MaLoai` varchar(15) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `mathang`
--

INSERT INTO `mathang` (`MaHang`, `TenHang`, `DVT`, `DonGia`, `MaLoai`) VALUES
('MH01', 'Kem đánh răng PS', 'Tuýp', 25000, 'LH01'),
('MH02', 'Cocacola', 'Chai', 15000, 'LH02');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `TenNV` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `DiaChi` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `MatKhau` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Quyen` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `TenNV`, `DiaChi`, `MatKhau`, `Quyen`) VALUES
('1001', 'Nguyễn Ngọc Hải', 'Hà Nội', '1234', 1),
('1002', 'Lê Đức Hải', 'Hoàng Mike', '1234', 0),
('1003', 'Nguyễn Duy Hà', 'Berlin', '1234', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD PRIMARY KEY (`SoHD`,`MaHang`),
  ADD KEY `MaHang` (`MaHang`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`SoHD`),
  ADD KEY `MaNV` (`MaNV`),
  ADD KEY `MaKH` (`MaKH`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKH`);

--
-- Indexes for table `loaihang`
--
ALTER TABLE `loaihang`
  ADD PRIMARY KEY (`MaLoai`);

--
-- Indexes for table `mathang`
--
ALTER TABLE `mathang`
  ADD PRIMARY KEY (`MaHang`),
  ADD KEY `MaLoai` (`MaLoai`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD CONSTRAINT `cthoadon_ibfk_1` FOREIGN KEY (`SoHD`) REFERENCES `hoadon` (`SoHD`),
  ADD CONSTRAINT `cthoadon_ibfk_2` FOREIGN KEY (`MaHang`) REFERENCES `mathang` (`MaHang`);

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`),
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`);

--
-- Constraints for table `mathang`
--
ALTER TABLE `mathang`
  ADD CONSTRAINT `mathang_ibfk_1` FOREIGN KEY (`MaLoai`) REFERENCES `loaihang` (`MaLoai`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

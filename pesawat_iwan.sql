-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Jan 2023 pada 05.14
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pesawat_iwan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `costumer`
--

CREATE TABLE `costumer` (
  `id_costumer` int(12) NOT NULL,
  `nama` varchar(250) NOT NULL,
  `jk` varchar(250) NOT NULL,
  `no_hp` int(250) NOT NULL,
  `nik` varchar(250) NOT NULL,
  `umur` int(250) NOT NULL,
  `alamat` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `costumer`
--

INSERT INTO `costumer` (`id_costumer`, `nama`, `jk`, `no_hp`, `nik`, `umur`, `alamat`) VALUES
(3, 'Zulfah', 'PEREMPUAN', 777, '122', 24, 'Sultan adam'),
(4, 'Zainal', 'LAKI-LAKI', 988, '1012', 21, 'Cemara');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` int(12) NOT NULL,
  `nama` varchar(250) NOT NULL,
  `jenis_bayaran` varchar(250) NOT NULL,
  `lokasi` varchar(250) NOT NULL,
  `gmail` varchar(250) NOT NULL,
  `alamat` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pembayaran`
--

INSERT INTO `pembayaran` (`id_pembayaran`, `nama`, `jenis_bayaran`, `lokasi`, `gmail`, `alamat`) VALUES
(3, 'Zainal', 'Trasfer Bank', 'Banjar Baru', 'zainal@gmail.com', 'cemara');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tiket`
--

CREATE TABLE `tiket` (
  `id_tiket` int(12) NOT NULL,
  `kelas` varchar(250) NOT NULL,
  `maskapai` varchar(250) NOT NULL,
  `penerbangan` varchar(250) NOT NULL,
  `tujuan` varchar(250) NOT NULL,
  `tgl` varchar(250) NOT NULL,
  `jam` varchar(250) NOT NULL,
  `biaya` int(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tiket`
--

INSERT INTO `tiket` (`id_tiket`, `kelas`, `maskapai`, `penerbangan`, `tujuan`, `tgl`, `jam`, `biaya`) VALUES
(3, 'bisnis', 'Lion Air', 'siap terbang', '2. Sumatra Utara Medan', '2021/08/09', '16.45 PM', 400000),
(5, 'pemeritahan', 'Sriwijaya Air', 'siap terbang', '5. Bengkulu Bengkulu', '2023/01/01', '20.35 PM', 500000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `costumer`
--
ALTER TABLE `costumer`
  ADD PRIMARY KEY (`id_costumer`);

--
-- Indeks untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`);

--
-- Indeks untuk tabel `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`id_tiket`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `costumer`
--
ALTER TABLE `costumer`
  MODIFY `id_costumer` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id_pembayaran` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `tiket`
--
ALTER TABLE `tiket`
  MODIFY `id_tiket` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

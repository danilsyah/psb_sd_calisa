/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.6.21 : Database - db_ppsb_sd_calisa
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_ppsb_sd_calisa` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_ppsb_sd_calisa`;

/*Table structure for table `pendaftaran` */

DROP TABLE IF EXISTS `pendaftaran`;

CREATE TABLE `pendaftaran` (
  `no_pendaftaran` varchar(50) NOT NULL,
  `bio_nama_lengkap` varchar(50) DEFAULT NULL,
  `bio_nama_panggilan` varchar(50) DEFAULT NULL,
  `bio_jenis_kelamin` varchar(50) DEFAULT NULL,
  `bio_tempat_lahir` varchar(50) DEFAULT NULL,
  `bio_tanggal_lahir` date DEFAULT NULL,
  `bio_agama` varchar(50) DEFAULT NULL,
  `bio_kewarganegaraan` varchar(50) DEFAULT NULL,
  `bio_anak_ke` int(2) DEFAULT NULL,
  `bio_jml_saudara_kandung` int(2) DEFAULT NULL,
  `bio_jml_saudara_tiri` int(2) DEFAULT NULL,
  `bio_jml_saudara_angkat` int(2) DEFAULT NULL,
  `bio_bahasa_sehari_hari` varchar(50) DEFAULT NULL,
  `bio_berat_badan` int(2) DEFAULT NULL,
  `bio_tinggi_badan` int(3) DEFAULT NULL,
  `bio_golongan_darah` varchar(2) DEFAULT NULL,
  `bio_penyakit_berat_yang_pernah_diderita` varchar(50) DEFAULT NULL,
  `bio_alamat_tempat_tinggal` varchar(100) DEFAULT NULL,
  `bio_no_telepon` varchar(14) DEFAULT NULL,
  `bio_bertempat_tinggal` varchar(50) DEFAULT NULL,
  `wali_nama_ayah_kandung` varchar(50) DEFAULT NULL,
  `wali_nama_ibu_kandung` varchar(50) DEFAULT NULL,
  `wali_pendidikan_tertinggi_ibu` varchar(50) DEFAULT NULL,
  `wali_pendidikan_tertinggi_ayah` varchar(50) DEFAULT NULL,
  `wali_pekerjaan_ayah` varchar(50) DEFAULT NULL,
  `wali_pekerjaan_ibu` varchar(50) DEFAULT NULL,
  `wali_nama_wali_siswa` varchar(50) DEFAULT NULL,
  `wali_pendidikan_tertinggi_wali_siswa` varchar(50) DEFAULT NULL,
  `wali_hubungan_terhadap_anak` varchar(50) DEFAULT NULL,
  `wali_pekerjaan_wali_siswa` varchar(50) DEFAULT NULL,
  `wali_pendapatan_perbulan_orang_tua` varchar(50) DEFAULT NULL,
  `asal_masuk_sekolah` varchar(50) DEFAULT NULL,
  `asal_anak` varchar(50) DEFAULT NULL,
  `asal_tk_nama_tk` varchar(50) DEFAULT NULL,
  `asal_tk_nomor_tahun_surat_keterangan` varchar(50) DEFAULT NULL,
  `asal_tk_lama_belajar` int(2) DEFAULT NULL,
  `asal_pindah_nama_sekolah_asal` varchar(50) DEFAULT NULL,
  `asal_pindah_tanggal` date DEFAULT NULL,
  `asal_pindah_dari_kelas` int(1) DEFAULT NULL,
  `asal_diterima_sekolah_tanggal` date DEFAULT NULL,
  `asal_diterima_dikelas` int(1) DEFAULT NULL,
  `kode_tahun_ajaran` int(10) DEFAULT NULL,
  `lampiran_akte_kelahiran` blob,
  `lampiran_kk` blob,
  `lampiran_ktp_ortu` blob,
  `lampiran_foto_ortu` blob,
  `lampiran_foto_anak` blob,
  PRIMARY KEY (`no_pendaftaran`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pendaftaran` */

insert  into `pendaftaran`(`no_pendaftaran`,`bio_nama_lengkap`,`bio_nama_panggilan`,`bio_jenis_kelamin`,`bio_tempat_lahir`,`bio_tanggal_lahir`,`bio_agama`,`bio_kewarganegaraan`,`bio_anak_ke`,`bio_jml_saudara_kandung`,`bio_jml_saudara_tiri`,`bio_jml_saudara_angkat`,`bio_bahasa_sehari_hari`,`bio_berat_badan`,`bio_tinggi_badan`,`bio_golongan_darah`,`bio_penyakit_berat_yang_pernah_diderita`,`bio_alamat_tempat_tinggal`,`bio_no_telepon`,`bio_bertempat_tinggal`,`wali_nama_ayah_kandung`,`wali_nama_ibu_kandung`,`wali_pendidikan_tertinggi_ibu`,`wali_pendidikan_tertinggi_ayah`,`wali_pekerjaan_ayah`,`wali_pekerjaan_ibu`,`wali_nama_wali_siswa`,`wali_pendidikan_tertinggi_wali_siswa`,`wali_hubungan_terhadap_anak`,`wali_pekerjaan_wali_siswa`,`wali_pendapatan_perbulan_orang_tua`,`asal_masuk_sekolah`,`asal_anak`,`asal_tk_nama_tk`,`asal_tk_nomor_tahun_surat_keterangan`,`asal_tk_lama_belajar`,`asal_pindah_nama_sekolah_asal`,`asal_pindah_tanggal`,`asal_pindah_dari_kelas`,`asal_diterima_sekolah_tanggal`,`asal_diterima_dikelas`,`kode_tahun_ajaran`,`lampiran_akte_kelahiran`,`lampiran_kk`,`lampiran_ktp_ortu`,`lampiran_foto_ortu`,`lampiran_foto_anak`) values ('111800005','Fika Setiawan','Fika','Perempuan','Tangerang','2017-11-15','Islam','WNI',1,2,0,0,'INDONESIA',35,120,'AB','tidak ada','sdfsdfs','324533132','ORANG TUA',' sasasa sdasfg','eg5gdfd','SD - Sederajat','SMA - Sederajat','PEGAWAI NEGERI SIPIL','PEGAWAI NEGERI SIPIL','ssddfsfds','SMP - Sederajat','SAUDARA','PEGAWAI NEGERI SIPIL','2.000.000 - 3.000.000','Siswa Baru','TK','fdsfsdfsd','sr32r34',5,'-','2018-12-12',0,'2018-11-29',3,1,'D:\\MyProject\\lampiranPSB\\111800005_akte.jpg','D:\\MyProject\\lampiranPSB\\111800005_kk.jpg','D:\\MyProject\\lampiranPSB\\111800005_ktp_wali.jpg','D:\\MyProject\\lampiranPSB\\111800005_wali.jpg','D:\\MyProject\\lampiranPSB\\111800005_pas_foto.jpg'),('121700006','danilsyah ari hardjo','danil saadsdsd','Laki-Laki','sumedang','2014-12-01','Islam','WNI',1,3,0,0,'INDONESIA',80,165,'A','tidak ada','tanjung uban','08212121','ORANG TUA','syahrizal','apong','Strata (S1)','Strata (S1)','WIRASWASTA','KARYAWAN SWASTA','syahrizal','Strata (S1)','ORANG TUA KANDUNG','WIRASWASTA','5.000.000 - 10.000.000','Pindahan','Rumah Tangga','-','-',0,'-','2018-12-01',1,'2018-12-12',3,1,'D:\\MyProject\\lampiranPSB\\121800006_akte.jpg','D:\\MyProject\\lampiranPSB\\121800006_kk.jpg','D:\\MyProject\\lampiranPSB\\121800006_ktp_wali.jpg','D:\\MyProject\\lampiranPSB\\121800006_wali.jpg','D:\\MyProject\\lampiranPSB\\121800006_pas_foto.jpg'),('121700007','paulina lubis','paulina','Perempuan','medan','2015-12-01','Protestan','WNI',1,2,0,0,'INDONESIA',12,212,'B','-','uban','3232333','ORANG TUA','wert','werh','SMA - Sederajat','SMA - Sederajat','KARYAWAN SWASTA','PEGAWAI NEGERI SIPIL','sadfghgh','SD - Sederajat','PAMAN/TANTE','PEGAWAI NEGERI SIPIL','3.000.000 - 5.000.000','Siswa Baru','Rumah Tangga','-','-',0,'-',NULL,0,'2018-12-13',1,3,'D:\\MyProject\\lampiranPSB\\121800007_akte.jpg','D:\\MyProject\\lampiranPSB\\121800007_kk.jpg','D:\\MyProject\\lampiranPSB\\121800007_ktp_wali.jpg','D:\\MyProject\\lampiranPSB\\121800007_wali.jpg','D:\\MyProject\\lampiranPSB\\121800007_pas_foto.jpg');

/*Table structure for table `setting_directory` */

DROP TABLE IF EXISTS `setting_directory`;

CREATE TABLE `setting_directory` (
  `id` int(1) NOT NULL DEFAULT '1',
  `alamat_folder` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `setting_directory` */

insert  into `setting_directory`(`id`,`alamat_folder`) values (1,'D:\\MyProject\\lampiranPSB\\');

/*Table structure for table `tahun_ajaran` */

DROP TABLE IF EXISTS `tahun_ajaran`;

CREATE TABLE `tahun_ajaran` (
  `kode_tahun_ajaran` int(10) NOT NULL AUTO_INCREMENT,
  `tahun_ajaran` varchar(50) DEFAULT NULL,
  `semester` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_tahun_ajaran`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tahun_ajaran` */

insert  into `tahun_ajaran`(`kode_tahun_ajaran`,`tahun_ajaran`,`semester`) values (1,'2018/2019','GANJIL'),(3,'2019/2020','GENAP');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `pass` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`id_user`,`nama`,`username`,`pass`) values (1,'Paulina','admin','123');

/*Table structure for table `v_pendaftaran` */

DROP TABLE IF EXISTS `v_pendaftaran`;

/*!50001 DROP VIEW IF EXISTS `v_pendaftaran` */;
/*!50001 DROP TABLE IF EXISTS `v_pendaftaran` */;

/*!50001 CREATE TABLE  `v_pendaftaran`(
 `no_pendaftaran` varchar(50) ,
 `bio_nama_lengkap` varchar(50) ,
 `bio_nama_panggilan` varchar(50) ,
 `bio_jenis_kelamin` varchar(50) ,
 `bio_tempat_lahir` varchar(50) ,
 `bio_tanggal_lahir` date ,
 `bio_agama` varchar(50) ,
 `bio_kewarganegaraan` varchar(50) ,
 `bio_anak_ke` int(2) ,
 `bio_jml_saudara_kandung` int(2) ,
 `bio_jml_saudara_tiri` int(2) ,
 `bio_jml_saudara_angkat` int(2) ,
 `bio_bahasa_sehari_hari` varchar(50) ,
 `bio_berat_badan` int(2) ,
 `bio_tinggi_badan` int(3) ,
 `bio_golongan_darah` varchar(2) ,
 `bio_penyakit_berat_yang_pernah_diderita` varchar(50) ,
 `bio_alamat_tempat_tinggal` varchar(100) ,
 `bio_no_telepon` varchar(14) ,
 `bio_bertempat_tinggal` varchar(50) ,
 `wali_nama_ayah_kandung` varchar(50) ,
 `wali_nama_ibu_kandung` varchar(50) ,
 `wali_pendidikan_tertinggi_ibu` varchar(50) ,
 `wali_pendidikan_tertinggi_ayah` varchar(50) ,
 `wali_pekerjaan_ayah` varchar(50) ,
 `wali_pekerjaan_ibu` varchar(50) ,
 `wali_nama_wali_siswa` varchar(50) ,
 `wali_pendidikan_tertinggi_wali_siswa` varchar(50) ,
 `wali_hubungan_terhadap_anak` varchar(50) ,
 `wali_pekerjaan_wali_siswa` varchar(50) ,
 `wali_pendapatan_perbulan_orang_tua` varchar(50) ,
 `asal_masuk_sekolah` varchar(50) ,
 `asal_anak` varchar(50) ,
 `asal_tk_nama_tk` varchar(50) ,
 `asal_tk_nomor_tahun_surat_keterangan` varchar(50) ,
 `asal_tk_lama_belajar` int(2) ,
 `asal_pindah_nama_sekolah_asal` varchar(50) ,
 `asal_pindah_tanggal` date ,
 `asal_pindah_dari_kelas` int(1) ,
 `asal_diterima_sekolah_tanggal` date ,
 `asal_diterima_dikelas` int(1) ,
 `kode_tahun_ajaran` int(10) ,
 `lampiran_akte_kelahiran` blob ,
 `lampiran_kk` blob ,
 `lampiran_ktp_ortu` blob ,
 `lampiran_foto_ortu` blob ,
 `lampiran_foto_anak` blob ,
 `tahun_ajaran` varchar(50) ,
 `semester` varchar(50) 
)*/;

/*View structure for view v_pendaftaran */

/*!50001 DROP TABLE IF EXISTS `v_pendaftaran` */;
/*!50001 DROP VIEW IF EXISTS `v_pendaftaran` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_pendaftaran` AS select `p`.`no_pendaftaran` AS `no_pendaftaran`,`p`.`bio_nama_lengkap` AS `bio_nama_lengkap`,`p`.`bio_nama_panggilan` AS `bio_nama_panggilan`,`p`.`bio_jenis_kelamin` AS `bio_jenis_kelamin`,`p`.`bio_tempat_lahir` AS `bio_tempat_lahir`,`p`.`bio_tanggal_lahir` AS `bio_tanggal_lahir`,`p`.`bio_agama` AS `bio_agama`,`p`.`bio_kewarganegaraan` AS `bio_kewarganegaraan`,`p`.`bio_anak_ke` AS `bio_anak_ke`,`p`.`bio_jml_saudara_kandung` AS `bio_jml_saudara_kandung`,`p`.`bio_jml_saudara_tiri` AS `bio_jml_saudara_tiri`,`p`.`bio_jml_saudara_angkat` AS `bio_jml_saudara_angkat`,`p`.`bio_bahasa_sehari_hari` AS `bio_bahasa_sehari_hari`,`p`.`bio_berat_badan` AS `bio_berat_badan`,`p`.`bio_tinggi_badan` AS `bio_tinggi_badan`,`p`.`bio_golongan_darah` AS `bio_golongan_darah`,`p`.`bio_penyakit_berat_yang_pernah_diderita` AS `bio_penyakit_berat_yang_pernah_diderita`,`p`.`bio_alamat_tempat_tinggal` AS `bio_alamat_tempat_tinggal`,`p`.`bio_no_telepon` AS `bio_no_telepon`,`p`.`bio_bertempat_tinggal` AS `bio_bertempat_tinggal`,`p`.`wali_nama_ayah_kandung` AS `wali_nama_ayah_kandung`,`p`.`wali_nama_ibu_kandung` AS `wali_nama_ibu_kandung`,`p`.`wali_pendidikan_tertinggi_ibu` AS `wali_pendidikan_tertinggi_ibu`,`p`.`wali_pendidikan_tertinggi_ayah` AS `wali_pendidikan_tertinggi_ayah`,`p`.`wali_pekerjaan_ayah` AS `wali_pekerjaan_ayah`,`p`.`wali_pekerjaan_ibu` AS `wali_pekerjaan_ibu`,`p`.`wali_nama_wali_siswa` AS `wali_nama_wali_siswa`,`p`.`wali_pendidikan_tertinggi_wali_siswa` AS `wali_pendidikan_tertinggi_wali_siswa`,`p`.`wali_hubungan_terhadap_anak` AS `wali_hubungan_terhadap_anak`,`p`.`wali_pekerjaan_wali_siswa` AS `wali_pekerjaan_wali_siswa`,`p`.`wali_pendapatan_perbulan_orang_tua` AS `wali_pendapatan_perbulan_orang_tua`,`p`.`asal_masuk_sekolah` AS `asal_masuk_sekolah`,`p`.`asal_anak` AS `asal_anak`,`p`.`asal_tk_nama_tk` AS `asal_tk_nama_tk`,`p`.`asal_tk_nomor_tahun_surat_keterangan` AS `asal_tk_nomor_tahun_surat_keterangan`,`p`.`asal_tk_lama_belajar` AS `asal_tk_lama_belajar`,`p`.`asal_pindah_nama_sekolah_asal` AS `asal_pindah_nama_sekolah_asal`,`p`.`asal_pindah_tanggal` AS `asal_pindah_tanggal`,`p`.`asal_pindah_dari_kelas` AS `asal_pindah_dari_kelas`,`p`.`asal_diterima_sekolah_tanggal` AS `asal_diterima_sekolah_tanggal`,`p`.`asal_diterima_dikelas` AS `asal_diterima_dikelas`,`p`.`kode_tahun_ajaran` AS `kode_tahun_ajaran`,`p`.`lampiran_akte_kelahiran` AS `lampiran_akte_kelahiran`,`p`.`lampiran_kk` AS `lampiran_kk`,`p`.`lampiran_ktp_ortu` AS `lampiran_ktp_ortu`,`p`.`lampiran_foto_ortu` AS `lampiran_foto_ortu`,`p`.`lampiran_foto_anak` AS `lampiran_foto_anak`,`t`.`tahun_ajaran` AS `tahun_ajaran`,`t`.`semester` AS `semester` from (`pendaftaran` `p` join `tahun_ajaran` `t` on((`p`.`kode_tahun_ajaran` = `t`.`kode_tahun_ajaran`))) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

/*
SQLyog Ultimate v8.32 
MySQL - 5.5.56 : Database - kjsj
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`kjsj` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `kjsj`;

/*Table structure for table `comments` */

DROP TABLE IF EXISTS `comments`;

CREATE TABLE `comments` (
  `cid` int(10) NOT NULL AUTO_INCREMENT,
  `ctid` int(10) NOT NULL,
  `cuid` int(10) NOT NULL,
  `ctext` varchar(100) NOT NULL,
  `creplyid` int(10) DEFAULT NULL,
  `cdate` datetime DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `ctid_tid_fk` (`ctid`),
  KEY `cuid_uid_fk` (`cuid`),
  KEY `creplyid_cid_pk` (`creplyid`),
  CONSTRAINT `creplyid_cid_pk` FOREIGN KEY (`creplyid`) REFERENCES `comments` (`cid`) ON DELETE CASCADE,
  CONSTRAINT `ctid_tid_fk` FOREIGN KEY (`ctid`) REFERENCES `talks` (`tid`) ON DELETE CASCADE,
  CONSTRAINT `cuid_uid_fk` FOREIGN KEY (`cuid`) REFERENCES `users` (`uid`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `comments` */

insert  into `comments`(`cid`,`ctid`,`cuid`,`ctext`,`creplyid`,`cdate`) values (1,1,374486002,'他是我孙子',NULL,NULL),(2,1,374486001,'你是我儿子',1,NULL),(3,2,374486001,'你是我儿子',NULL,NULL),(4,2,374486002,'你是我孙子',3,NULL),(7,4,1112,'test',4,'2018-06-25 09:10:35');

/*Table structure for table `friends` */

DROP TABLE IF EXISTS `friends`;

CREATE TABLE `friends` (
  `fid` int(10) NOT NULL AUTO_INCREMENT,
  `fuid` int(15) NOT NULL,
  `fuid2` int(15) NOT NULL,
  `fnickname` varchar(15) NOT NULL COMMENT '昵称',
  `fdegree` int(3) NOT NULL DEFAULT '0' COMMENT '亲密度\r\n',
  `fvisttime` datetime DEFAULT NULL COMMENT '最后访问时间',
  PRIMARY KEY (`fid`),
  KEY `fuid_uid_pk` (`fuid`),
  KEY `fuid2_uid_pk` (`fuid2`),
  CONSTRAINT `fuid2_uid_pk` FOREIGN KEY (`fuid2`) REFERENCES `users` (`uid`) ON DELETE CASCADE,
  CONSTRAINT `fuid_uid_pk` FOREIGN KEY (`fuid`) REFERENCES `users` (`uid`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `friends` */

insert  into `friends`(`fid`,`fuid`,`fuid2`,`fnickname`,`fdegree`,`fvisttime`) values (1,374486001,374486002,'李四是我张三的儿子',40,'2018-06-21 14:50:00'),(2,374486002,374486001,'张三是我李四的孙子',40,'2018-06-21 14:51:00'),(4,374486001,1113,'1113',55,'2018-06-25 11:24:57');

/*Table structure for table `likes` */

DROP TABLE IF EXISTS `likes`;

CREATE TABLE `likes` (
  `lid` int(10) NOT NULL AUTO_INCREMENT,
  `ltid` int(10) NOT NULL,
  `luid` int(15) NOT NULL,
  `ldate` datetime DEFAULT NULL,
  PRIMARY KEY (`lid`),
  KEY `luid_uid` (`luid`),
  KEY `ltid_tid_fk` (`ltid`),
  CONSTRAINT `ltid_tid_fk` FOREIGN KEY (`ltid`) REFERENCES `talks` (`tid`) ON DELETE CASCADE,
  CONSTRAINT `luid_uid` FOREIGN KEY (`luid`) REFERENCES `users` (`uid`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `likes` */

insert  into `likes`(`lid`,`ltid`,`luid`,`ldate`) values (1,1,374486001,NULL),(2,1,374486002,NULL),(3,2,374486001,NULL),(4,2,374486002,NULL),(6,4,374486002,'2018-06-25 13:47:20'),(7,4,374486002,'2018-06-25 08:59:51'),(8,4,374486002,'2018-06-25 13:47:22');

/*Table structure for table `photos` */

DROP TABLE IF EXISTS `photos`;

CREATE TABLE `photos` (
  `pid` int(10) NOT NULL AUTO_INCREMENT COMMENT '照片编号\r\n',
  `puid` int(15) NOT NULL COMMENT '照片所属用户\r\n',
  `ptid` int(10) DEFAULT NULL COMMENT '照片所属说说',
  `paddress` varchar(50) NOT NULL COMMENT '照片存放地址\r\n',
  `pgroup` varchar(50) DEFAULT NULL COMMENT '照片分组名称',
  PRIMARY KEY (`pid`),
  KEY `puid_uid_fk` (`puid`),
  CONSTRAINT `puid_uid_fk` FOREIGN KEY (`puid`) REFERENCES `users` (`uid`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `photos` */

insert  into `photos`(`pid`,`puid`,`ptid`,`paddress`,`pgroup`) values (1,374486001,NULL,'p1.img','1'),(2,374486001,NULL,'p2.img','1'),(3,374486001,NULL,'p3.img','2'),(4,374486001,NULL,'p4.img','3'),(5,374486001,NULL,'p5.img','3'),(6,374486001,NULL,'p6.img','4'),(7,374486001,NULL,'p7.img','1'),(8,374486001,NULL,'p8.img','3'),(9,374486001,NULL,'p9.img','4'),(10,374486002,NULL,'p10.img',NULL),(11,374486002,NULL,'p11.img',NULL),(12,374486002,NULL,'p12.img',NULL),(13,374486002,NULL,'p13.img',NULL),(14,374486002,NULL,'p14.img',NULL),(15,374486002,NULL,'p15.img',NULL),(16,374486002,NULL,'p16.img',NULL),(17,374486002,NULL,'p17.img',NULL),(18,374486002,NULL,'p18.img',NULL),(20,1112,4,'test.img','10');

/*Table structure for table `talks` */

DROP TABLE IF EXISTS `talks`;

CREATE TABLE `talks` (
  `tid` int(10) NOT NULL AUTO_INCREMENT,
  `tuid` int(15) NOT NULL,
  `tdate` datetime NOT NULL,
  `ttext` varchar(200) DEFAULT NULL,
  `ttype` char(1) NOT NULL DEFAULT '0' COMMENT '0-正常 1-被举报 2-违规',
  PRIMARY KEY (`tid`),
  KEY `tuid_uid_fk` (`tuid`),
  CONSTRAINT `tuid_uid_fk` FOREIGN KEY (`tuid`) REFERENCES `users` (`uid`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `talks` */

insert  into `talks`(`tid`,`tuid`,`tdate`,`ttext`,`ttype`) values (1,374486001,'2018-06-21 14:50:00','我张三新认了个儿子，他叫李四','0'),(2,374486002,'2018-06-21 14:51:00','我李四新认了个孙子，他叫张三','0'),(4,374486001,'2018-06-24 21:35:39','test','0');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `uid` int(15) NOT NULL COMMENT '用户id',
  `upwd` varchar(25) NOT NULL,
  `uname` varchar(15) NOT NULL,
  `umail` varchar(20) NOT NULL,
  `uheadportrait` varchar(50) DEFAULT NULL,
  `usex` char(1) DEFAULT '0' COMMENT '0-男  1-女',
  `uage` int(3) DEFAULT NULL,
  `ubirthday` date DEFAULT NULL,
  `ublood` char(1) DEFAULT '0' COMMENT '0-A 1-B 2-AB 3-O',
  `uNowIn` varchar(50) DEFAULT NULL,
  `uhometown` varchar(50) DEFAULT NULL,
  `utype` char(1) NOT NULL DEFAULT '0' COMMENT '0-用户 1-管理员',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`uid`,`upwd`,`uname`,`umail`,`uheadportrait`,`usex`,`uage`,`ubirthday`,`ublood`,`uNowIn`,`uhometown`,`utype`) values (1112,'23124','123','21431234','q434','0',22,'2018-06-22','1','hzhou','hzhou ','0'),(1113,'99999','123','999999','q434','0',22,'1997-07-09','1','hzhou','hzhou ','0'),(374486001,'123456','张三','374486001@qq.com','zs.img','0',22,'1997-07-07','0','杭州','杭州','0'),(374486002,'123456','李四','374486002@qq.com','ls.img','0',23,'1996-09-09','0','杭州','广州','0'),(999999999,'admin','管理员','admin@qq.com',NULL,'0',NULL,NULL,'0',NULL,NULL,'1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

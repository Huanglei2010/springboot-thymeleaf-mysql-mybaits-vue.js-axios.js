
/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : mytest

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-10-26 09:55:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'aaa', '90');
INSERT INTO `account` VALUES ('2', 'bbb', '110');
INSERT INTO `account` VALUES ('3', 'ccc', '1000');
INSERT INTO `account` VALUES ('4', 'huanglei', '1000');
INSERT INTO `account` VALUES ('5', 'huanglei', '1000');
INSERT INTO `account` VALUES ('6', 'huanglei', '1000');

-- ----------------------------
-- Table structure for admininfo
-- ----------------------------
DROP TABLE IF EXISTS `admininfo`;
CREATE TABLE `admininfo` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AdminName` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of admininfo
-- ----------------------------
INSERT INTO `admininfo` VALUES ('25', 'hhello');
INSERT INTO `admininfo` VALUES ('26', 'wr');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1019 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('11', 'hhhh', '1111', '111111');
INSERT INTO `t_user` VALUES ('1000', 'huang', '1111', '1111');
INSERT INTO `t_user` VALUES ('1001', 'hhhhh', 'jjjj', '1111');
INSERT INTO `t_user` VALUES ('1002', 'kkk', 'kkk', '1111');
INSERT INTO `t_user` VALUES ('1003', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1004', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1005', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1006', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1007', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1008', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1009', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1010', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1011', '刘备', '112233', '123456');
INSERT INTO `t_user` VALUES ('1012', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1013', 'huanglei', '112233', '123456');
INSERT INTO `t_user` VALUES ('1014', '梁上', '112233', '123456');
INSERT INTO `t_user` VALUES ('1015', '神风特攻队', '112233', '120');
INSERT INTO `t_user` VALUES ('1016', '好汉', '112233', '123456');


/*
 Navicat Premium Data Transfer

 Source Server         : localCentos7
 Source Server Type    : MySQL
 Source Server Version : 50552
 Source Host           : home.sgx.com
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50552
 File Encoding         : utf-8

 Date: 02/18/2017 17:07:11 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `test_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '名称',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `test_type` int(11) DEFAULT '0' COMMENT '测试下划线字段命名类型',
  `role` bigint(20) DEFAULT NULL,
  `phone` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`test_id`)
) ENGINE=InnoDB AUTO_INCREMENT=832876186228006913 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户表';

SET FOREIGN_KEY_CHECKS = 1;

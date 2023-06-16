/*
 Navicat Premium Data Transfer

 Source Server         : asa
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : ampdatabase

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 15/06/2023 02:38:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for assets
-- ----------------------------
DROP TABLE IF EXISTS `assets`;
CREATE TABLE `assets` (
  `pk_Id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `location` varchar(20) DEFAULT NULL COMMENT '位号',
  `tpe` varchar(30) DEFAULT NULL COMMENT '型号',
  `pump_head` int DEFAULT NULL COMMENT '扬程(m)',
  `flow` int DEFAULT NULL COMMENT '流量(m3/h)',
  `rpm` int DEFAULT NULL COMMENT '转速(r/min)',
  `quality` int DEFAULT NULL COMMENT '重量',
  `spare_part` varchar(20) DEFAULT NULL COMMENT '备件',
  `powr` int DEFAULT NULL COMMENT '功率(kw)',
  `factory_tim` timestamp NULL DEFAULT NULL COMMENT '出厂日期',
  `factory_num` varchar(20) DEFAULT NULL COMMENT '出厂编号',
  `factory_nam` int DEFAULT NULL COMMENT '厂家',
  `category` varchar(20) DEFAULT NULL COMMENT '泵型',
  `remake` varchar(50) DEFAULT NULL COMMENT '备注',
  `create_tim` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '建档时间',
  `correction_tim` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`pk_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='资产信息';

-- ----------------------------
-- Records of assets
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for assets_record
-- ----------------------------
DROP TABLE IF EXISTS `assets_record`;
CREATE TABLE `assets_record` (
  `fk_ast_st_id` int NOT NULL COMMENT '资产状态ID',
  `tpe` int DEFAULT NULL COMMENT '操作类型',
  `fk_rol_id` int NOT NULL COMMENT '操作角色',
  `operate_tim` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
  KEY `assets_record_role_pk_id_fk` (`fk_rol_id`),
  KEY `assets_record_assets_state_pk_id_fk` (`fk_ast_st_id`),
  CONSTRAINT `assets_record_assets_state_pk_id_fk` FOREIGN KEY (`fk_ast_st_id`) REFERENCES `assets_state` (`pk_id`),
  CONSTRAINT `assets_record_role_pk_id_fk` FOREIGN KEY (`fk_rol_id`) REFERENCES `role` (`pk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='资产变动信息';

-- ----------------------------
-- Records of assets_record
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for assets_state
-- ----------------------------
DROP TABLE IF EXISTS `assets_state`;
CREATE TABLE `assets_state` (
  `fk_ast_id` int NOT NULL COMMENT '资产类型ID',
  `current_state` int NOT NULL COMMENT '状态代码',
  `pk_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `locationn` varchar(10) DEFAULT NULL COMMENT '框架',
  `create_tim` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登机时间',
  `correction_tim` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`pk_id`),
  KEY `assets_state_assets_pk_Id_fk` (`fk_ast_id`),
  CONSTRAINT `assets_state_assets_pk_Id_fk` FOREIGN KEY (`fk_ast_id`) REFERENCES `assets` (`pk_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='资产状态';

-- ----------------------------
-- Records of assets_state
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for authorization
-- ----------------------------
DROP TABLE IF EXISTS `authorization`;
CREATE TABLE `authorization` (
  `fk_rol_id` int NOT NULL,
  `fk_per_id` int NOT NULL,
  `authorize_tim` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '授权时间',
  KEY `authorization_permission_pk_id_fk` (`fk_per_id`),
  KEY `authorization_role_pk_id_fk` (`fk_rol_id`),
  CONSTRAINT `authorization_permission_pk_id_fk` FOREIGN KEY (`fk_per_id`) REFERENCES `permission` (`pk_id`),
  CONSTRAINT `authorization_role_pk_id_fk` FOREIGN KEY (`fk_rol_id`) REFERENCES `role` (`pk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='授权';

-- ----------------------------
-- Records of authorization
-- ----------------------------
BEGIN;
INSERT INTO `authorization` VALUES (1, 7, '2023-06-14 21:44:10');
COMMIT;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `pk_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `str` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限名称',
  `remake` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `create_tim` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `correction_tim` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`pk_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3 COMMENT='权限';

-- ----------------------------
-- Records of permission
-- ----------------------------
BEGIN;
INSERT INTO `permission` VALUES (1, 'SystemAllAccess', '访问系统全部权限', '2023-06-14 21:41:06', '2023-06-14 21:41:06');
INSERT INTO `permission` VALUES (2, 'SystemReadOnlyAccess', '系统只读', '2023-06-14 21:41:06', '2023-06-14 21:41:06');
INSERT INTO `permission` VALUES (3, 'LoginAccess', '登陆', '2023-06-14 21:41:06', '2023-06-14 21:41:06');
INSERT INTO `permission` VALUES (4, 'RegisterAccess', '注册', '2023-06-14 21:41:06', '2023-06-14 21:41:06');
INSERT INTO `permission` VALUES (5, 'BackstageAllAccess', '后台管理', '2023-06-14 21:41:06', '2023-06-14 21:41:06');
INSERT INTO `permission` VALUES (6, 'BackstageReadOnlyAccess', '后台只读', '2023-06-14 21:41:06', '2023-06-14 21:41:06');
INSERT INTO `permission` VALUES (7, 'TestAccess', '测试用', '2023-06-14 21:44:03', '2023-06-14 21:44:03');
COMMIT;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `pk_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `nam` varchar(20) NOT NULL COMMENT '角色名',
  `create_tim` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `correction_tim` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`pk_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COMMENT='角色';

-- ----------------------------
-- Records of role
-- ----------------------------
BEGIN;
INSERT INTO `role` VALUES (1, '超级管理员', '2023-06-14 21:32:41', '2023-06-14 21:32:41');
COMMIT;

-- ----------------------------
-- Table structure for transfer
-- ----------------------------
DROP TABLE IF EXISTS `transfer`;
CREATE TABLE `transfer` (
  `fk_usr_id` int NOT NULL COMMENT '角色ID',
  `fk_rol_id` int DEFAULT NULL COMMENT '角色ID',
  `transfer_tim` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '调动时间',
  KEY `transfer_role_pk_id_fk` (`fk_rol_id`),
  KEY `transfer_usr_pk_id_fk` (`fk_usr_id`),
  CONSTRAINT `transfer_role_pk_id_fk` FOREIGN KEY (`fk_rol_id`) REFERENCES `role` (`pk_id`),
  CONSTRAINT `transfer_usr_pk_id_fk` FOREIGN KEY (`fk_usr_id`) REFERENCES `usr` (`pk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='调动';

-- ----------------------------
-- Records of transfer
-- ----------------------------
BEGIN;
INSERT INTO `transfer` VALUES (1, 1, '2023-06-14 21:43:12');
COMMIT;

-- ----------------------------
-- Table structure for usr
-- ----------------------------
DROP TABLE IF EXISTS `usr`;
CREATE TABLE `usr` (
  `pk_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `pwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `register_tim` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `correction_tim` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`pk_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COMMENT='用户';

-- ----------------------------
-- Records of usr
-- ----------------------------
BEGIN;
INSERT INTO `usr` VALUES (1, 'qwer', '123456', '测试用(SystemALlAccess)', '2023-06-14 20:47:49', '2023-06-14 21:43:01');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

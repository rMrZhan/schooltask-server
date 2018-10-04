/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50132
Source Host           : localhost:3306
Source Database       : term

Target Server Type    : MYSQL
Target Server Version : 50132
File Encoding         : 65001

Date: 2018-09-06 08:37:08
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `alltask`
-- ----------------------------
DROP TABLE IF EXISTS `alltask`;
CREATE TABLE `alltask` (
  `id` varchar(50) NOT NULL DEFAULT '',
  `taskid` varchar(50) DEFAULT NULL,
  `accept` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alltask
-- ----------------------------
INSERT INTO `alltask` VALUES ('123', '1', '0');

-- ----------------------------
-- Table structure for `mytask`
-- ----------------------------
DROP TABLE IF EXISTS `mytask`;
CREATE TABLE `mytask` (
  `id` varchar(50) NOT NULL DEFAULT '',
  `taskid` varchar(50) DEFAULT NULL,
  `end` tinyint(1) DEFAULT NULL,
  `accept` tinyint(1) DEFAULT NULL,
  `finish` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mytask
-- ----------------------------
INSERT INTO `mytask` VALUES ('111', '2', '1', '1', '0');
INSERT INTO `mytask` VALUES ('112', '3', '1', '1', '0');
INSERT INTO `mytask` VALUES ('123', '1', '1', '0', '1');

-- ----------------------------
-- Table structure for `task`
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `doid` varchar(50) DEFAULT NULL,
  `id` varchar(50) NOT NULL DEFAULT '',
  `name` varchar(50) DEFAULT NULL,
  `img` varchar(50) DEFAULT NULL,
  `money` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `detail` varchar(50) DEFAULT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `time` varchar(50) DEFAULT NULL,
  `accept` tinyint(1) NOT NULL DEFAULT '0',
  `end` tinyint(1) NOT NULL DEFAULT '0',
  `finishe` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------
INSERT INTO `task` VALUES ('66', '1', '强哥', '无', '5.00', '四川大学江安校区', '帮拿快递到6舍', '9945D2906450432AB4991707B871B9C2', '2018.07.31', '0', '1', '0');
INSERT INTO `task` VALUES ('66', '2', '小美', '无', '25.00', '双流县', '代购', '9945D2906450432AB4991707B871B9C2', '2018.08.05', '0', '0', '0');
INSERT INTO `task` VALUES ('66', '3', '大佬', '无', '200', '四川大学江安校区', '帮宠物洗澡', '9945D2906450432AB4991707B871B9C2', '2018.08.10', '0', '0', '0');
INSERT INTO `task` VALUES ('9945D2906450432AB4991707B871B9C2', '4', '涛哥', '无', '550', '双流县', '帮做暑假作业', '9945D2906450432AB4991707B871B9C2', '2018.08.1', '1', '1', '0');
INSERT INTO `task` VALUES ('66', '5', '小兵', '无', '1000', '成都市青羊宫', '王者荣耀代打上分青铜到星耀', '9945D2906450432AB4991707B871B9C2', '2018.08.2', '1', '1', '0');
INSERT INTO `task` VALUES ('66', '6', '小波', '无', '20', '成都市青羊宫', '第五人格代打上分人屠一阶到六阶', '9945D2906450432AB4991707B871B9C2', '2018.08.5', '1', '1', '0');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(50) NOT NULL DEFAULT '',
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `img` varchar(50) DEFAULT NULL,
  `money` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1A06FC08C2234F3C90E321E0DBBE9DA4', '亚瑟', '121', '暂无', '暂无', '暂无', null);
INSERT INTO `user` VALUES ('2F991EC5EF424C0C9DA39CB8A62B53BC', '盖伦', '555', '暂无', '暂无', '暂无', null);
INSERT INTO `user` VALUES ('98584CC3FFF24658A8B199AD73F03BA2', '123', '123', '暂无', '暂无', '暂无', null);
INSERT INTO `user` VALUES ('9945D2906450432AB4991707B871B9C2', '强哥', '111', '123123', '123123', '123123', null);
INSERT INTO `user` VALUES ('E01620167EB641D090FF2E38F16B88DE', '鲁班', '543', '暂无', '暂无', '暂无', null);

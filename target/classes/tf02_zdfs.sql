CREATE DATABASE TF02_ZDFS DEFAULT CHARSET UTF8; -- 创建数据库
USE tf02_zdfs;

CREATE TABLE `doctor_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `pwd` varchar(400) NOT NULL,
  `mail` varchar(40) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `photo` varchar(400) NOT NULL,
  `birthday` date NOT NULL,
  `hospital` varchar(100) NOT NULL,
  `department` varchar(200) NOT NULL,
  `job` varchar(100) NOT NULL COMMENT '职位',
  `good_at` varchar(400) DEFAULT NULL COMMENT '擅长',
  `online_state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '在线状态，0表示offline',
  `has_video` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否有视频,0表示没有',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `login_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tel` (`tel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医生信息表';

CREATE TABLE `r_doctor_anychat_t` (
  `doc_id` int(11) NOT NULL,
  `anychat_id` int(11) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0表示否',
  PRIMARY KEY (`doc_id`),
  UNIQUE KEY `anychat_id` (`anychat_id`),
  CONSTRAINT `r_doctor_anychat_t_ibfk_1` FOREIGN KEY (`doc_id`) REFERENCES `doctor_t` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医生和anychat的关联表';


CREATE TABLE `hospital_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(400) NOT NULL COMMENT '医院代码',
  `name` varchar(200) NOT NULL,
  `decription` text NOT NULL,
  `address` varchar(400) NOT NULL,
  `tel` varchar(40) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医院表';

CREATE TABLE `department_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(400) NOT NULL COMMENT '科室的代码',
  `name` varchar(40) NOT NULL,
  `description` varchar(200) NOT NULL,
  `level` tinyint(1) NOT NULL COMMENT '医生级别代码',
  `address` varchar(400) NOT NULL,
  `dep_photo` varchar(400) DEFAULT NULL COMMENT '科室的图片',
  `type_id` int(11) DEFAULT NULL COMMENT '对应第三方科室表ID',
  `tel` varchar(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag` tinyint(1) DEFAULT '0',
  `hos_id` int(11) NOT NULL COMMENT '医院的id',
  PRIMARY KEY (`id`),
  KEY `hos_id` (`hos_id`),
  CONSTRAINT `department_t_ibfk_1` FOREIGN KEY (`hos_id`) REFERENCES `hospital_t` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医院科室表';


CREATE TABLE `diagnose_t` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_id` varchar(40) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `info` varchar(600) NOT NULL COMMENT '就诊情况记录',
  `state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否是已视频就诊，1表示结束',
  `video` varchar(200) DEFAULT NULL COMMENT '视频地址',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='成员就诊记录表';


CREATE TABLE `appointment_t` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_id` varchar(40) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `info` varchar(400) DEFAULT NULL COMMENT '预约信息表',
  `appoint_date` date NOT NULL,
  `appoint_time` time NOT NULL,
  `state` int(11) NOT NULL DEFAULT '0' COMMENT '0表示尚未确认，1表示接受，2表示拒绝',
  `refuse_reason` int(11) DEFAULT NULL COMMENT '拒绝理由，1表示时间冲突，2表示其它',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='就诊预约表';


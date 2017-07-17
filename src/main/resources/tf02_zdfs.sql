drop table if exists diagnose_t;
drop table if exists  appointment_t;

drop table if exists  r_doctor_anychat_t;
drop table if exists  r_patient_doctors_t;
drop table if exists  r_doctor_patients_t;
drop table if exists  patient_t;
drop table if exists doctor_t;
drop table if exists doctor_type_t;
drop table if exists department_t;
drop table if exists hospital_t;

drop table if exists meta_department_type_t;
drop table if exists meta_doctor_type_t;

CREATE TABLE `hospital_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(400) NOT NULL COMMENT '医院代码',
  `name` varchar(200) NOT NULL,
  `decription` text NOT NULL,
  `address` varchar(400) NOT NULL,
  `tel` varchar(40) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag`  tinyint(1) not null DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='医院表';


create table meta_department_type_t(
  id int not null auto_increment,
  name varchar(60) not null,
  delflag tinyint(1) not null default 0,
  primary key(id)
) comment '科室类别的元数据表';

CREATE TABLE `department_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(400) NOT NULL COMMENT '科室的代码',
  `name` varchar(40) NOT NULL,
  `description` varchar(200) NOT NULL,
  `address` varchar(400) NOT NULL,
  `dep_photo` varchar(400) DEFAULT NULL COMMENT '科室的图片',
  `department_type_id` int(11) DEFAULT NULL COMMENT '对应第三方科室表ID',
  `tel` varchar(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag` tinyint(1) not null DEFAULT '0',
  `hos_id` int(11) NOT NULL COMMENT '医院的id',
  PRIMARY KEY (`id`),
  KEY `hos_id` (`hos_id`),
  CONSTRAINT  FOREIGN KEY (`hos_id`) REFERENCES `hospital_t` (`id`),
  constraint foreign key(department_type_id) references meta_department_type_t(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医院科室表';

Create table meta_doctor_type_t(
  id int not null auto_increment,
  name varchar(40) not null,
  delflag tinyint(1 )not null default 0,
  primary key(id)
) comment '医生类型的原数据表';

CREATE TABLE `doctor_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `pwd` varchar(400) NOT NULL,
  `mail` varchar(40) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `photo` varchar(400) NOT NULL,
  `birthday` date NOT NULL,
  `hospital_id` int(11) NOT NULL,
  `department_id` int(11) NOT NULL,
  `doctor_type_id` int NOT NULL COMMENT '职位',
  `good_at` varchar(400) DEFAULT NULL COMMENT '擅长',
  `online_state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '在线状态，0表示offline',
  `has_video` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否有视频,0表示没有',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag` tinyint(1) not null default 0,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tel` (`tel`),
  KEY `hospital_id` (`hospital_id`),
  KEY `department_id` (`department_id`),
  CONSTRAINT  FOREIGN KEY (`hospital_id`) REFERENCES `hospital_t` (`id`),
  CONSTRAINT FOREIGN KEY (`department_id`) REFERENCES `department_t` (`id`),
  constraint foreign key(doctor_type_id) references meta_doctor_type_t(id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='医生信息表';

CREATE TABLE `patient_t` (
  `p_id` int NOT NULL auto_increment comment '多个病人可以对应同一个用户，分别属于不同医生',
  `p_name` varchar(40) not null,
  `p_sex` tinyint(1) not null default 1 comment '病人的性别，默认1，男',
  `p_age` int not null ,
  `member_id` int not null comment '对应的tf02的member_id',
  `d_id` int(11) NOT NULL,
  `delflag` tinyint(1) not null default 0,
  primary KEY (p_id),
  unique(member_id,d_id), 
  constraint foreign key(d_id) references doctor_t(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '病人表，隶属于医生;病人的实体是Tf02的用户';

CREATE TABLE `diagnose_t` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `p_id` varchar(40) NOT NULL comment '病人的id',
  `tel` varchar(20) NOT NULL comment '病人的电话',
  `info` varchar(600) NOT NULL COMMENT '就诊情况记录',
  `state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否是已视频就诊，1表示结束',
  `video` varchar(200) DEFAULT NULL COMMENT '视频地址',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='成员就诊记录表';

CREATE TABLE `appointment_t` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `p_id` int NOT NULL comment '病人的id',
  `d_id` int not null comment '医生的id',
  `tel` varchar(20) NOT NULL comment '病人电话',
  `info` varchar(400) DEFAULT NULL COMMENT '预约信息表',
  `appoint_date` date NOT NULL comment '预约日期',
  `appoint_time_start` time NOT NULL comment '预约当日开始时间',
  `appoint_time_end` time not null comment '预约当日结束时间',
  `state` int(11) NOT NULL DEFAULT '0' COMMENT '0表示尚未确认，1表示接受，2表示拒绝',
  `refuse_reason` int(11) DEFAULT NULL COMMENT '拒绝理由，1表示时间冲突，2表示其它',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `delflag` tinyint(1) NOT NULL DEFAULT '0',
  `embark_direction` tinyint(1) not null default '0' comment '发启方，0表示医生发起，1表示病人发起', 
   PRIMARY KEY (`id`),
  constraint foreign key(p_id) references patient_t(p_id),
  constraint foreign key(d_id) references doctor_t(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='就诊预约表';


CREATE TABLE `r_doctor_anychat_t` (
  `doc_id` int(11) NOT NULL,
  `anychat_id` int(11) NOT NULL default 0 comment '0表示没有绑带anychat',
  `delflag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0表示否',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  UNIQUE KEY `anychat_id` (`anychat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医生和anychat的关联表';







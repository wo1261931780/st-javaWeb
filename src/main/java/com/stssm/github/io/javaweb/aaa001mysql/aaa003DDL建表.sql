desc demo1;
-- 解释表结构，包括字段和字段的注释


##############################################################################
# 首先执行一次删除
DROP TABLE if exists demo1;
-- 创建表格数据
create table study001sql.demo1
(
	id        int          not null comment '主键'
		primary key,
	name      varchar(20)  null comment '姓名',
	age       int          null comment '年龄',
	sex       char         null comment '性别',
	address   varchar(50)  null comment '地址',
	math      double(5, 2) null comment '数学成绩',
	english   double(5, 2) null comment '英语成绩',
	hire_date date         null comment '入职时间'
);

# 下面是navicat建表语句
# 两个还是有很大的差别
CREATE TABLE `demo1`
(
	`id`        int NOT NULL COMMENT '主键',
	`name`      varchar(20)  DEFAULT NULL COMMENT '姓名',
	`age`       int          DEFAULT NULL COMMENT '年龄',
	`sex`       char(1)      DEFAULT NULL COMMENT '性别',
	`address`   varchar(50)  DEFAULT NULL COMMENT '地址',
	`math`      double(5, 2) DEFAULT NULL COMMENT '数学成绩',
	`english`   double(5, 2) DEFAULT NULL COMMENT '英语成绩',
	`hire_date` date         DEFAULT NULL COMMENT '入职时间',
	PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
##############################################################################

-- 删除tb_brand表
drop table if exists tb_brand;
-- 创建tb_brand表
create table tb_brand
(
	-- id 主键
	id           int primary key auto_increment,
	-- 品牌名称
	brand_name   varchar(20),
	-- 企业名称
	company_name varchar(20),
	-- 排序字段
	ordered      int,
	-- 描述信息
	description  varchar(100),
	-- 状态：0：禁用  1：启用
	status       int
);

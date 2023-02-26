# 1.约束的概念
# 约束是作用于表中列上的规则，用于限制加入表的数据
# 约束的存在保证了数据库中数据的正确性、有效性和完整性
#
# 2.约束的分类
# 非空约束 保证列中所有数据不能有null值 NOT NULL
#
# 唯一约束 保证列中所有数据各不相同 UNIQUE
#
# 主键约束 主键是一行数据的唯一标识，要求非空且唯一 PRIMARYKEY
#
# 检查约束 保证列中的值满足某一条件 CHECK
#
# 默认约束 保存数据时，未指定值则采用默认值 DEFAULT
#
# 外键约束 外键用来让两个表的数据之间建立链接，保证数据的一致性和完整性 FOREIGNKEY
#
# Tips：MySQL不支持检查约束
#########################################################################

# 主键约束
DROP TABLE if EXISTS demo1;

create table demo1
(
	id        int          not null comment '主键' primary key,
	E_NAME    varchar(20)  null comment '姓名',
	age       int          null comment '年龄',
	sex       char         null comment '性别',
	address   varchar(50)  null comment '地址',
	math      double(5, 2) null comment '数学成绩',
	english   double(5, 2) null comment '英语成绩',
	hire_date date         null comment '入职时间'
);

#########################################################################

# 主键约束，并且自动增长
DROP TABLE if EXISTS demo2;
-- SQL的要求是非常严格的
-- 首先，建表语句必须在小括号里面
-- 其次，name一般表示一个特定的变量，不能直接用来作为表字段
-- 最后，建表语句里面，不允许括号前有逗号

CREATE TABLE demo2
(
	id      INT PRIMARY KEY AUTO_INCREMENT,-- 主键，默认非空且唯一,配置了自动增长
-- 自增长必须是数字类型的元素才可以使用
	E_NAME  VARCHAR(50)  NOT NULL UNIQUE,  -- 非空且唯一
	TAKE_DT DATE         NOT NULL,         -- 非空
	salary  DOUBLE(5, 2) NOT NULL,         -- 非空
	bonus   DOUBLE(5, 2) DEFAULT 0         -- 默认为0
);

-- 也可以建完表以后添加非空约束
alter table demo1 modify E_NAME VARCHAR(50) NOT NULL;
-- 编辑约束条件，这里编辑功能，实现的删除的结果
alter table demo1 modify E_NAME VARCHAR(50);

#########################################################################

SELECT * FROM DEMO2;
INSERT INTO DEMO2(id, E_NAME, TAKE_DT, salary, bonus) VALUES ('1', '2', '2020-01-01', '4', '5');
-- 对于日期类型，只要是按照固定格式写入，就可以进行解析
INSERT INTO DEMO2(id, E_NAME, TAKE_DT, salary, bonus) VALUES ('2', '3', '20200101', '4', '5');
-- 直接插入会报错
-- > 1048 - Column 'id' cannot be null
INSERT INTO DEMO2(id, E_NAME, TAKE_DT, salary, bonus) VALUES (NULL, '4', '20200101', '4', '5');

#########################################################################

-- 创建表时添加唯一约束
create table demo1
(
	id        int          not null comment '主键' primary key,
	E_NAME    varchar(20)  null comment '姓名' UNIQUE AUTO_INCREMENT, -- [CONSTRAINT] [约束名称] UNIQUE(列名)
	-- AUTO_INCREMENT：当不指定值时自动增长
	age       int          null comment '年龄',
	sex       char         null comment '性别',
	address   varchar(50)  null comment '地址',
	math      double(5, 2) null comment '数学成绩',
	english   double(5, 2) null comment '英语成绩',
	hire_date date         null comment '入职时间'
);

#########################################################################

DROP TABLE if EXISTS demo1;
create table demo1
(
	id        int          not null comment '主键',
	E_NAME    varchar(20)  null comment '姓名',
	age       int          null comment '年龄',
	sex       char         null comment '性别',
	address   varchar(50)  null comment '地址',
	math      double(5, 2) null comment '数学成绩',
	english   double(5, 2) null comment '英语成绩',
	hire_date date         null comment '入职时间'
);

-- 建完表后添加唯一约束
ALTER TABLE demo1 MODIFY E_NAME varchar(50) UNIQUE;

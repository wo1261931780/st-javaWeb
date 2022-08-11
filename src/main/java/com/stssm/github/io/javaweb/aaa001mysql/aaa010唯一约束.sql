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

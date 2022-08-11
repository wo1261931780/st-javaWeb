# DDL(Data Definition Language) 数据定义语言， 用来定义数据库对象：数据库，表，列等

# DML(Data Manipulation Language) 数据操作语言， 用来对数据库中表的数据进行增删改

# DQL(Data Query Language) 数据查询语言， 用来查询数据库中表的记录(数据)

# DCL(Data Control Language) 数据控制语言， 用来定义数据库的访问权限和安全级别，及创建用户


# dml和dql都是对数据进行操作的
# dql就是查询操作
# dml就是管理操作，简写为manage


show databases; -- 展示所有的数据库
show tables ; -- 展示当前数据库的所有表格

create database demo; --  创建demo数据库

create database if not exists demo; --  如果demo数据库不存在的话，创建demo数据库

###############################################
drop database demo; --  删除demo数据库
# 这两个不一样，注意一点
drop table demo1; --  删除demo表格
###############################################
drop database if exists demo; --  删除demo数据库
drop table if exists demo1; --  删除demo表格
# 上面两个语法几乎一样

select database(); --  选择查看当前使用的数据库

use demo;
--  使用demo数据库
--  use不同的数据库，是可以在任意路径下调用的
--  desc是解释表的结构信息，并没有查询具体的数据

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
# 	默认约束 保存数据时，未指定值则采用默认值 DEFAULT
#
# 外键约束 外键用来让两个表的数据之间建立链接，保证数据的一致性和完整性 FOREIGNKEY
#
# Tips：MySQL不支持检查约束
#########################################################################

SELECT * FROM demo1;

DROP TABLE if EXISTS demo2;
-- SQL的要求是非常严格的
-- 首先，建表语句必须在小括号里面
-- 其次，name一般表示一个特定的变量，不能直接用来作为表字段
-- 最后，建表语句里面，不允许括号前有逗号
CREATE TABLE demo2 (
id INT PRIMARY KEY AUTO_INCREMENT,-- 主键，默认非空且唯一
-- 自增长必须是数字类型的元素才可以使用
e_name VARCHAR(50) NOT NULL UNIQUE, -- 非空且唯一
takeDt DATE NOT NULL, -- 非空
salary DOUBLE(5,2) NOT NULL, -- 非空
bonus DOUBLE(5,2) DEFAULT 0 -- 默认为0
);

-- 也可以建完表以后添加非空约束
alter table demo1 modify name VARCHAR(50) NOT NULL;
-- 删除约束条件
alter table demo1 modify name VARCHAR(50);

#########################################################################





SELECT * FROM DEMO2;
INSERT INTO DEMO2(id,e_name,takeDt,salary,bonus) VALUES('1','2','2020-01-01','4','5');
-- 对于日期类型，只要是按照固定格式写入，就可以进行解析
INSERT INTO DEMO2(id,e_name,takeDt,salary,bonus) VALUES('2','3','20200101','4','5');
-- 直接插入会报错
-- > 1048 - Column 'id' cannot be null
INSERT INTO DEMO2(id,e_name,takeDt,salary,bonus) VALUES(NULL,'4','20200101','4','5');


DROP table  if EXISTS demo3emp;
DROP table  if EXISTS demo4dept;

CREATE TABLE demo3emp(
id int PRIMARY key auto_increment,
ename VARCHAR(5),
age INT ,
edp_id INT,
-- 外键关联
-- 从表的dep_id是根据主表demo4dept中的id进行关联的
-- fkkey是外键的名称，可以任意取
CONSTRAINT fkkey FOREIGN KEY(edp_id)  REFERENCES demo4dept(id)
-- 这个命令是建表过程中执行的
-- 如果要删除主表中的整个部门
-- 必须先删除从表中，部门内的所有人员
);

CREATE TABLE demo4dept(
id INT PRIMARY KEY auto_increment,
dept_id INT ,
addttr VARCHAR(50)
);


SELECT * FROM demo3emp;
-- 对于自动增长的数据，第一个数据的默认值为1
INSERT INTO demo3emp(id,ename,age,edp_id) VALUES(NULL,'1','1','2'),(NULL,'1','1','2');

SELECT* FROM demo4dept;
INSERT INTO demo4dept(id,dept_id,addttr) VALUES(NULL,'1','1');


-- 删除demo3emp表格中，外键fkkey
ALTER TABLE	demo3emp DROP FOREIGN KEY fkkey;
-- 在表格3中，添加外键demokey，关联的字段是edp_id和demo4dept中的id
ALTER TABLE demo3emp ADD CONSTRAINT demokey FOREIGN KEY(edp_id) REFERENCES demo4dept(id);

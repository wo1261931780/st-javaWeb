SELECT * FROM demo1;



DROP TABLE if EXISTS demo2;
-- SQL的要求是非常严格的
-- 首先，建表语句必须在小括号里面
-- 其次，name一般表示一个特定的变量，不能直接用来作为表字段
-- 最后，建表语句里面，不允许括号前有逗号
CREATE TABLE demo2 (
id INT PRIMARY KEY AUTO_INCREMENT,-- 主键，默认非空且唯一
-- 自增长必须是数字类型的元素才可以使用
ename VARCHAR(50) NOT NULL UNIQUE,
takeDt DATE NOT NULL,
salary DOUBLE(5,2) NOT NULL,
bonus DOUBLE(5,2) DEFAULT 0
);

SELECT * FROM DEMO2;
INSERT INTO DEMO2(id,ename,takeDt,salary,bonus) VALUES('1','2','2020-01-01','4','5');
-- 对于日期类型，只要是按照固定格式写入，就可以进行解析
INSERT INTO DEMO2(id,ename,takeDt,salary,bonus) VALUES('2','3','20200101','4','5');
-- 直接插入会报错
-- > 1048 - Column 'id' cannot be null
INSERT INTO DEMO2(id,ename,takeDt,salary,bonus) VALUES(NULL,'4','20200101','4','5');


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

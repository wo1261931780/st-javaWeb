

# 2.语法
# (1)添加约束
-- 创建表时添加外键约束
CREATE TABLE demo2
(
	name varchar(50) [CONSTRAINT] [外键名称] FOREIGN KEY (外键列名) REFERENCES demo1(主表列名)
);
-- 建完表后添加外键约束
ALTER TABLE demo2 ADD CONSTRAINT 外键名称 FOREIGN KEY (外键字段名称) REFERENCES 主表名称 (主表列名称);

# (2)删除约束
ALTER TABLE demo2 DROP FOREIGN KEY 外键名称;
#########################################################################

DROP table if EXISTS DEMO_3_EMP;
DROP table if EXISTS DEMO_4_DEPT;

CREATE TABLE DEMO_3_EMP
(
	id     int PRIMARY key auto_increment,
	E_NAME VARCHAR(5),
	age    INT,
	salary int,
	edp_id INT,

-- 外键关联
-- 从表的dep_id是根据主表demo4dept中的id进行关联的
-- FK_KEY是外键的名称，可以任意取
	CONSTRAINT FK_KEY FOREIGN KEY (edp_id) REFERENCES DEMO_4_DEPT (id)
#   [CONSTRAINT] [外键名称] FOREIGN KEY (外键列名) REFERENCES demo1(主表列名)
-- 这个命令是建表过程中执行的
-- 如果要删除主表中的整个部门
-- 必须先删除从表中，部门内的所有人员
);

CREATE TABLE DEMO_4_DEPT
(
	id      INT PRIMARY KEY auto_increment,
	DEPT_ID INT,
	address VARCHAR(50)
);
#########################################################################

SELECT * FROM DEMO_3_EMP;
-- 对于自动增长的数据，第一个数据的默认值为1
INSERT INTO DEMO_3_EMP(id, E_NAME, age, EDP_ID)
VALUES (NULL, '1', '1', '2'),
       (NULL, '1', '1', '2');

SELECT * FROM DEMO_4_DEPT;
INSERT INTO DEMO_4_DEPT(id, DEPT_ID, address)
VALUES (NULL, '1', '1');

-- 删除demo3emp表格中，外键fkkey
ALTER TABLE DEMO_3_EMP DROP FOREIGN KEY FK_KEY;
-- 在表格3中，添加外键demokey，关联的字段是edp_id和demo4dept中的id
ALTER TABLE DEMO_3_EMP ADD CONSTRAINT demokey FOREIGN KEY (EDP_ID) REFERENCES DEMO_4_DEPT (id);
# ALTER TABLE demo2 ADD CONSTRAINT 外键名称 FOREIGN KEY (外键字段名称) REFERENCES 主表名称 (主表列名称);

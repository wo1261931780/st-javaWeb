CREATE TABLE demo5order
(
	id           INT PRIMARY KEY auto_increment,
	payment      DOUBLE(10, 2),
	payment_type TINYINT,
	gdsstatus    TINYINT
);
CREATE TABLE demo6gds
(
	id        INT PRIMARY KEY auto_increment,
	title     VARCHAR(100),
	gds_price DOUBLE(10, 2),
	counts    INT
);


CREATE TABLE demo7tb
(
	id       INT PRIMARY KEY auto_increment,
	order_id INT,
	gd_id    INT
);

SELECT *
FROM demo5order;
SELECT *
FROM demo6gds;
SELECT *
FROM demo7tb;

alter TABLE demo7tb
	add CONSTRAINT fkorderkey FOREIGN KEY (order_id) REFERENCES demo5order (id);
alter TABLE demo7tb
	add CONSTRAINT fkgdskey FOREIGN KEY (gd_id) REFERENCES demo6gds (id);



CREATE TABLE demo8ydy
(
	id     INT PRIMARY KEY UNIQUE,
	ppname VARCHAR(5),
	age    INT
);
-- 只有主键才可以设置自动增加数值的属性

CREATE TABLE demo9idcard
(
	id      INT PRIMARY KEY UNIQUE,
	address VARCHAR(5)
);
ALTER TABLE demo8ydy
	add CONSTRAINT fkkey1 FOREIGN KEY (id) REFERENCES demo9idcard (id);
ALTER TABLE demo9idcard
	add CONSTRAINT fkkey2 FOREIGN KEY (id) REFERENCES demo8ydy (id);



-- 多表查询
-- 直接搜索就可以看到多表，但是多表之间没有关联关系
-- 根据两张表的数据，直接搜索只会得到相乘的结果
SELECT *
FROM DEMO_3_EMP;
SELECT *
FROM DEMO_4_DEPT;
SELECT *
FROM DEMO_3_EMP,
     DEMO_4_DEPT;
-- 直接相等，就是通过内连接进行查询，
-- 内连接，默认只能查询出来交集数据，5*4=20，如果左右同时存在一个空行，只会查询得到4条（左边为准）
SELECT *
FROM DEMO_3_EMP t1,
     DEMO_4_DEPT t2
WHERE t1.edp_id = t2.dept_id;
SELECT *
FROM DEMO_3_EMP t1
	     INNER JOIN DEMO_4_DEPT t2 on t1.edp_id = t2.dept_id;
-- 所谓的内外连接，实际上就是将where替换为on
-- 然后两个表的连接符替换为left/right join
SELECT *
FROM DEMO_3_EMP t1
	     LEFT JOIN DEMO_4_DEPT t2 on t1.edp_id = t2.dept_id;

SELECT *
FROM DEMO_3_EMP t1
	     RIGHT JOIN DEMO_4_DEPT t2 on t1.edp_id = t2.dept_id;

-- 子查询
SELECT *
FROM DEMO_3_EMP
WHERE salary > (SELECT salary FROM DEMO_3_EMP WHERE ename = '66');

-- 查询部门为12的
SELECT ename
FROM DEMO_3_EMP
WHERE edp_id = 1
   OR edp_id = 2;
SELECT *
FROM DEMO_3_EMP
WHERE edp_id IN (1, 2);
-- 将结果作为单列查询的条件，传入查询框中
SELECT *
FROM DEMO_3_EMP
WHERE ename IN (SELECT ename FROM DEMO_3_EMP WHERE edp_id = 1 OR edp_id = 2);

-- 虚拟表，实际上就是将多列查询的结果，作为一个新表，放到下一条语句中作为查询条件。
SELECT *
FROM DEMO_3_EMP
WHERE salary > 1400;

SELECT *
FROM (SELECT *FROM DEMO_3_EMP WHERE salary > 1400) t1,
     DEMO_4_DEPT t2
WHERE t1.edp_id = t2.dept_id;



CREATE TABLE demo11dept
(
	id    INT PRIMARY KEY auto_increment,
	dname VARCHAR(50),
	loc   VARCHAR(50)
);
CREATE TABLE demo13emp
(
	id       INT PRIMARY KEY auto_increment,
	ename    VARCHAR(50),
	mgr      INT,
	joindate DATE,
	salary   DECIMAL(7, 2),
	bonus    DECIMAL(7, 2),
	dept_id  INT,
	CONSTRAINT fkkey3 FOREIGN KEY (dept_id) REFERENCES demo11dept (id)
);
CREATE TABLE demo10job
(
	id     int PRIMARY key auto_increment,
	jname  VARCHAR(20),
	edp_id INT,
	CONSTRAINT fkkey4 FOREIGN KEY (edp_id) REFERENCES demo13emp (job_id)
);

CREATE TABLE demo12salarygrade
(
	grade     INT PRIMARY KEY auto_increment,
	losalary  INT,
	hissalary INT
);


SELECT t1.id, t1.ename, t1.salary, t2.jname, t2.edp_id
FROM demo13emp t1
	     LEFT JOIN demo10job t2 ON t1.job_id = t2.id;

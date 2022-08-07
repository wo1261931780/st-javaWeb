


-- SQL学习第五天
DROP table if EXISTS demo10job;
DROP table if EXISTS demo13emp;
DROP table if EXISTS demo11dept;-- 有外键，需要先删除一个
DROP table if EXISTS demo12salarygrade;



CREATE TABLE demo10job(
id int PRIMARY key auto_increment NOT NULL COMMENT '主键',
description VARCHAR(200) NULL COMMENT '描述信息',
job_name VARCHAR(20) NULL COMMENT '岗位名称',
edp_id INT NULL COMMENT '部门id'
-- CONSTRAINT fkkey_edp_id FOREIGN KEY(edp_id)  REFERENCES demo13emp(job_id)
);
CREATE TABLE demo11dept(
id INT PRIMARY KEY auto_increment NOT NULL COMMENT '主键',
dept_name VARCHAR(50) NULL COMMENT '部门名称',
loc_address VARCHAR(50) NULL COMMENT '部门所在地'
);

CREATE TABLE demo13emp(
id INT PRIMARY KEY auto_increment NOT NULL COMMENT '员工id',
emp_name VARCHAR(50) NULL COMMENT '员工姓名',
job_id INT NULL COMMENT '岗位id',
senior_leader INT NULL COMMENT '上级领导',
join_date DATE NULL COMMENT '入职日期',
salary DECIMAL(7,2) NULL COMMENT '薪资',
bonus DECIMAL(7,2) NULL COMMENT '奖金',
dept_id INT NULL COMMENT '部门id',
CONSTRAINT fkkey_job_id FOREIGN KEY(job_id)  REFERENCES demo10job(id),
CONSTRAINT fkkey_dept_id FOREIGN KEY(dept_id)  REFERENCES demo11dept(id)
);

CREATE TABLE demo12salarygrade(
salary_grade INT PRIMARY KEY auto_increment  COMMENT '薪资等级',
salary_min INT NULL COMMENT '最低工资',
salary_max INT NULL COMMENT '最高工资'
);


-- 随机生成数据以后，完成下面五个需求：
-- 1.查询所有员工信息。查询员工编号，员工姓名，工资，职务名称，职务描述
-- 这里是显示内连接，没有使用inner语句
SELECT t1.id,t1.emp_name,t1.salary,t2.job_name,t2.description FROM demo13emp t1,demo10job t2 WHERE t1.job_id=t2.id ORDER BY t1.id;
-- 使用inner语句
SELECT t1.id,t1.emp_name,t1.salary,t2.job_name,t2.description FROM demo13emp t1 INNER JOIN demo10job t2 ON t1.job_id=t2.id ORDER BY t1.id;

-- 2.查询员工编号，员工姓名，工资，职务名称，职务描述，部门名称，部门位置
-- 显示内连接
SELECT t1.id,t1.emp_name,t1.salary,t2.job_name,t2.description,t3.dept_name,t3.loc_address FROM demo13emp t1,demo10job t2, demo11dept t3 WHERE t1.job_id=t2.id and t1.dept_id=t3.id ORDER BY t1.id LIMIT 0,100;
-- 隐示内连接
SELECT t1.id,t1.emp_name,t1.salary,t2.job_name,t2.description,t3.dept_name,t3.loc_address FROM demo13emp t1 INNER JOIN demo10job t2 ON t1.job_id=t2.id INNER JOIN demo11dept t3 ON t1.dept_id=t3.id ORDER BY t1.id;

-- 3.查询员工姓名，工资，工资等级
-- 显示内连接
SELECT t1.emp_name,t1.salary,t2.salary_grade FROM demo13emp t1 ,demo12salarygrade t2 WHERE t1.salary>t2.salary_min AND t1.salary<t2.salary_max;
-- 隐示内连接
SELECT  t1.emp_name,t1.salary,t2.salary_grade FROM demo13emp t1 INNER JOIN demo12salarygrade t2 ON t1.salary >t2.salary_min and t1.salary<t2.salary_max;
-- 使用函数也可以
SELECT  t1.emp_name,t1.salary,t2.salary_grade FROM demo13emp t1 INNER JOIN demo12salarygrade t2 ON t1.salary BETWEEN t2.salary_min and t2.salary_max;

-- 4.查询员工姓名，工资，职务名称，职务描述，部门名称，部门位置，工资等级
SELECT t1.emp_name,t1.salary,t2.job_name,t3.loc_address,t4.salary_grade FROM demo13emp t1 INNER JOIN demo10job t2 ON t1.job_id=t2.id INNER JOIN demo11dept t3 ON t1.dept_id=t3.id INNER JOIN demo12salarygrade t4 ON t1.salary BETWEEN t4.salary_min and t4.salary_max;

-- 5.查询出部门编号、部门名称、部门位置、部门人数

SELECT t1.id,t1.loc_address,t1.dept_name,COUNT(*) FROM demo11dept t1 INNER JOIN demo13emp t2 ON t1.id=t2.job_id GROUP BY t1.dept_name;












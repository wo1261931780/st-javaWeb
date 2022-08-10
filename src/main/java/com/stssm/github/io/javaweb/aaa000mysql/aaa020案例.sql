
-- 随机生成数据以后，完成下面五个需求：
-- 1.查询所有员工信息。查询员工编号，员工姓名，工资，职务名称，职务描述
-- 这里是显示内连接，没有使用inner语句
SELECT t1.id, t1.emp_name, t1.salary, t2.job_name, t2.J_DESCRIPTION
FROM DEMO_13_EMP t1,
     DEMO_10_JOB t2
WHERE t1.job_id = t2.id
ORDER BY t1.id;
#########################################################################


-- 使用inner语句
SELECT t1.id, t1.emp_name, t1.salary, t2.job_name, t2.J_DESCRIPTION
FROM DEMO_13_EMP t1
	     INNER JOIN DEMO_10_JOB t2 ON t1.job_id = t2.id
ORDER BY t1.id;

#########################################################################


-- 2.查询员工编号，员工姓名，工资，职务名称，职务描述，部门名称，部门位置
-- 显示内连接
SELECT t1.id, t1.emp_name, t1.salary, t2.job_name, t2.J_DESCRIPTION, t3.dept_name, t3.loc_address
FROM DEMO_13_EMP t1,
     DEMO_10_JOB t2,
     DEMO_11_DEPT t3
WHERE t1.job_id = t2.id
  and t1.dept_id = t3.id
ORDER BY t1.id
LIMIT 0,100;
#########################################################################

-- 隐示内连接
SELECT t1.id, t1.emp_name, t1.salary, t2.job_name, t2.J_DESCRIPTION, t3.dept_name, t3.loc_address
FROM DEMO_13_EMP t1
	     INNER JOIN DEMO_10_JOB t2 ON t1.job_id = t2.id
	     INNER JOIN DEMO_11_DEPT t3 ON t1.dept_id = t3.id
ORDER BY t1.id;

#########################################################################

-- 3.查询员工姓名，工资，工资等级
-- 显示内连接
SELECT t1.emp_name, t1.salary, t2.salary_grade
FROM DEMO_13_EMP t1,
     DEMO_12_SALARY_GRADE t2
WHERE t1.salary > t2.salary_min
  AND t1.salary < t2.salary_max;

#########################################################################

-- 隐示内连接
SELECT t1.emp_name, t1.salary, t2.salary_grade
FROM DEMO_13_EMP t1
	     INNER JOIN DEMO_12_SALARY_GRADE t2 ON t1.salary > t2.salary_min and t1.salary < t2.salary_max;

#########################################################################

-- 使用函数也可以
SELECT t1.emp_name, t1.salary, t2.salary_grade
FROM DEMO_13_EMP t1
	     INNER JOIN DEMO_12_SALARY_GRADE t2 ON t1.salary BETWEEN t2.salary_min and t2.salary_max;

#########################################################################


-- 4.查询员工姓名，工资，职务名称，职务描述，部门名称，部门位置，工资等级
SELECT t1.emp_name, t1.salary, t2.job_name, t3.loc_address, t4.salary_grade
FROM DEMO_13_EMP t1
	     INNER JOIN DEMO_10_JOB t2 ON t1.job_id = t2.id
	     INNER JOIN DEMO_11_DEPT t3 ON t1.dept_id = t3.id
	     INNER JOIN DEMO_12_SALARY_GRADE t4 ON t1.salary BETWEEN t4.salary_min and t4.salary_max;

#########################################################################


-- 5.查询出部门编号、部门名称、部门位置、部门人数
SELECT t1.id, t1.loc_address, t1.dept_name, COUNT(*)
FROM DEMO_11_DEPT t1
	     INNER JOIN DEMO_13_EMP t2 ON t1.id = t2.job_id
GROUP BY t1.dept_name;

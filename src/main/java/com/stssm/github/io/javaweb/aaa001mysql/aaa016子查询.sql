
-- 子查询
SELECT * FROM DEMO_3_EMP
WHERE salary > (SELECT salary FROM DEMO_3_EMP WHERE E_NAME = '66');

-- 查询部门为12的
SELECT E_name FROM DEMO_3_EMP WHERE edp_id = 1 OR edp_id = 2;

SELECT * FROM DEMO_3_EMP WHERE edp_id IN (1, 2);
-- 将结果作为单列查询的条件，传入查询框中



SELECT * FROM DEMO_3_EMP
WHERE E_name IN (SELECT E_name FROM DEMO_3_EMP WHERE edp_id = 1 OR edp_id = 2);

-- 虚拟表，实际上就是将多列查询的结果，作为一个新表，放到下一条语句中作为查询条件。
SELECT * FROM DEMO_3_EMP WHERE salary > 1400;

SELECT *
FROM (SELECT * FROM DEMO_3_EMP WHERE salary > 1400) t1,DEMO_4_DEPT t2
WHERE t1.edp_id = t2.dept_id;

#########################################################################

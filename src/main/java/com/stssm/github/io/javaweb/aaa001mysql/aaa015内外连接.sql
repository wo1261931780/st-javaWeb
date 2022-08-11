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
#########################################################################

SELECT *
FROM DEMO_3_EMP t1
	     LEFT JOIN DEMO_4_DEPT t2 on t1.edp_id = t2.dept_id;

SELECT *
FROM DEMO_3_EMP t1
	     RIGHT JOIN DEMO_4_DEPT t2 on t1.edp_id = t2.dept_id;
#########################################################################

-- 子查询
SELECT *
FROM DEMO_3_EMP
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
FROM (SELECT * FROM DEMO_3_EMP WHERE salary > 1400) t1,
     DEMO_4_DEPT t2
WHERE t1.edp_id = t2.dept_id;

#########################################################################

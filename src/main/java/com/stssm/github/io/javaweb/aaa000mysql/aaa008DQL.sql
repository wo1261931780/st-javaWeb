-- 查询语句，直接搜索对应的栏目就可以
-- 最大的问题是，无法展示数据种类，会出现重复数据
-- SQL有点像选择，只展示选择的语句，没有选择的不展示
SELECT name, sex FROM demo1;

#########################################################################
-- 核心语法
# SELECT
#  	字段列表
# FROM
#  	表名列表
# WHERE
#  	条件列表
# GROUP BY
#  	分组字段
# HAVING
#  	分组后条件
# ORDER BY
#  	排序字段
# LIMIT
#  	分页限定

#########################################################################
SELECT * FROM demo1;

UPDATE demo1 set sex='女' WHERE id = '3';

-- 去除重复数据
SELECT DISTINCT address FROM demo1;

SELECT DISTINCT name as '姓名', age as '性别' FROM demo1;

SELECT * FROM demo1;
SELECT * FROM demo1 WHERE age > 60 ORDER BY age;
SELECT * FROM demo1 WHERE age > 60 && age < 70;-- 直接使用双连接也可以
SELECT * FROM demo1 WHERE age > 65 and age < 80;

-- 这个关联语句的两个数字，必须按照大小顺序写入
SELECT * FROM demo1 WHERE age BETWEEN 50 and 80;
-- SELECT *FROM demo1 WHERE age BETWEEN 80 and 50;-- 会报错

SELECT * FROM demo1 WHERE hire_date BETWEEN '2010-01-05' and '2010-01-10';

-- 判断结果，加不加单引号都是可以的
SELECT * FROM demo1 WHERE age = 57;
SELECT * FROM demo1 WHERE age = '57';
SELECT * FROM demo1 WHERE age != '57'; -- 这里和java中是一样的

SELECT * FROM demo1 WHERE age <> 61 ORDER BY age;

-- 这里使用双竖线和or都是可以的
SELECT * FROM demo1 WHERE age = 61 or age = 62 ORDER BY age;

-- 在SQL中，不能直接等于null来判断是否为空
SELECT * FROM demo1 WHERE age IS NULL;
SELECT * FROM demo1 WHERE age IS not NULL;


-- 模糊查询
-- 模糊查询可以前置也可以后置
SELECT * FROM demo1 WHERE name LIKE '%10';
-- 32在中间，前面有几个字符，就有几个下划线，后面的可以全部使用百分号代替
SELECT * FROM demo1 WHERE age LIKE '__32%';


-- 排序语法
SELECT * FROM demo1 ORDER BY age asc;-- 默认升序排列
SELECT * FROM demo1 ORDER BY age desc;
-- 降序排列
-- 按照年龄升序，然后姓名降序
-- 谁在前面，就谁优先
SELECT * FROM demo1 ORDER BY age asc, name desc;

-- 几个简单函数
-- 统计不同姓名的数量，不会吧null计算在里面
SELECT count(name) FROM demo1;
-- 直接计算所有列，然后得到结果数量
SELECT count(*) FROM demo1;

-- 计算最大值
SELECT max(id) FROM demo1;
SELECT min(age) FROM demo1;

-- 计算所有的年龄总和
SELECT SUM(age) FROM demo1;
-- 对于字符串类型，相加只会得到0
SELECT sum(address) FROM demo1;

-- 默认保留四位小数
SELECT AVG(id) FROM demo1;


-- 按照性别分组，
-- 然后统计平均分，同时展示性别数据
SELECT sex as '性别', AVG(math)
FROM demo1
GROUP BY sex;
-- 如果我查询的字段不是分组中的字段,
-- 那么展示出来的信息是没有意义的
SELECT name, sex as '性别', AVG(math)
FROM demo1
GROUP BY sex;

SELECT sex, AVG(math), count(*)
FROM demo1
GROUP BY sex;
-- 分组为性别，平均分66，人数13
-- 男	66.000000	13
-- 女	66.000000	10

-- 设置分组的条件，年龄必须大于60
SELECT sex, AVG(math), count(*)
FROM demo1
where age > 60
GROUP BY sex;

-- 在前面的基础上，给数量设置条件，必须大于7
-- 总结一下，
-- where和having和函数，这几个有执行的先后顺序
SELECT sex, AVG(math), count(*)
FROM demo1
WHERE age > 60
GROUP BY sex
HAVING count(*) > 7;


-- 分页
-- 这个的意思，应该是，从0开始，查询三个数据
SELECT *
from demo1
LIMIT 0,3;
-- 从3号索引开始，查询三个数据
SELECT *
FROM demo1
LIMIT 3,3;

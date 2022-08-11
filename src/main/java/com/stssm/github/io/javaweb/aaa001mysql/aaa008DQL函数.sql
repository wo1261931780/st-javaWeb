#########################################################################
-- 去除重复数据
SELECT DISTINCT address FROM demo1;

SELECT DISTINCT name as '姓名', age as '性别' FROM demo1;
#########################################################################
-- 几个简单函数
-- 统计不同姓名的数量，不会吧null计算在里面
SELECT count(name) FROM demo1;-- 统计不为null的列数量
-- 直接计算所有列，然后得到结果数量
SELECT count(*) FROM demo1;
-- 计算最大值
SELECT max(id) FROM demo1;-- 统计年龄最大值
SELECT min(age) FROM demo1;-- 统计年龄最小值
-- 计算所有的年龄总和
SELECT SUM(age) FROM demo1;
-- 对于字符串类型，相加只会得到0
SELECT sum(address) FROM demo1;
-- 默认保留四位小数
SELECT AVG(id) FROM demo1;

#########################################################################

-- 按照性别分组，
-- 然后统计平均分，同时展示性别数据
SELECT sex as '性别', AVG(math) FROM demo1 GROUP BY sex;
-- 如果我查询的字段不是分组中的字段,
-- 那么展示出来的信息是没有意义的
SELECT name, sex as '性别', AVG(math) FROM demo1 GROUP BY sex;

SELECT sex, AVG(math), count(*) FROM demo1 GROUP BY sex;
-- 分组为性别，平均分66，人数13
-- 男	66.000000	13
-- 女	66.000000	10

-- 设置分组的条件，年龄必须大于60
SELECT sex, AVG(math), count(*) FROM demo1 where age > 60 GROUP BY sex;

-- 在前面的基础上，给数量设置条件，必须大于7
-- 总结一下，
-- where和having和函数，这几个有执行的先后顺序
SELECT sex, AVG(math), count(*) FROM demo1 WHERE age > 60 GROUP BY sex HAVING count(*) > 7;
#########################################################################
#########################################################################
-- 分页
-- 这个的意思，应该是，从0开始，查询三个数据
SELECT * from demo1 LIMIT 0,3;
-- 从3号索引开始，查询三个数据
SELECT * FROM demo1 LIMIT 3,3;



SELECT * FROM st_table;




-- 单行添加数据
INSERT into st_table(id,name,age) VALUES(123,'123','322');
-- 如果可以为null，那么不插入数据的情况下，栏目不对，会报错
INSERT into st_table(id,a1,a2,address,name,age) VALUES(12,'123','322','123','123','123');
-- 给所有的行添加数据
INSERT into st_table(id,a1,a2,address,name,price,age) VALUES(11,'123','322','123','123','123','123');

-- 在给所有行添加数据的情况下，可以省略栏目名称
INSERT into st_table VALUES(11,'123','322','123','123','123','123');

-- 直接给多行添加数据，就在后面跟多行的数据内容
INSERT into st_table(id,a1,a2,address,name,price,age) VALUES(21,'123','322','123','123','123','123'),(31,'123','322','123','123','123','123'),(41,'123','322','123','123','123','123');


-- 更新数据
UPDATE st_table set a1='2222' where id='11';
UPDATE st_table set a2='2222',address='222' where id='11';

-- 在不写where的情况下，直接更新会导致所有age列都变成100
UPDATE st_table set age='100';


SELECT * FROM st_table;

-- 删除，从xx表，删除栏目为xx的一行数据
DELETE FROM st_table where a1='2222';
-- 如果有多列的数据相同。那么直接删除会删除多列
DELETE FROM st_table where a1='123';
-- 不加条件的情况下，会直接删除所有的数据
DELETE from st_table;





























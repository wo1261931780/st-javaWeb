
-- 更新数据
UPDATE st_table
set price='2222'
where id = '11';

UPDATE st_table
set price='2222',
    name='222'
where id = '11';

-- 在不写where的情况下，直接更新会导致所有age列都变成100
UPDATE st_table
set price='100';

-- 删除，从xx表，删除栏目为xx的一行数据
DELETE
FROM st_table
where id = '2222';
-- 如果有多列的数据相同。那么直接删除会删除多列
DELETE
FROM st_table
where id = '123';
-- 不加条件的情况下，会直接删除所有的数据
DELETE
from st_table;

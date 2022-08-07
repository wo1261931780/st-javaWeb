alter table demo1 rename to demo2;
-- 将demo表，重命名为demo2

alter table demo1 add sex char(1);
-- 在demo表中，新增“性别”这一列，数据类型为char类型，最多一个字符

alter table demo1 modify age char(2);
-- 将demo表中，年龄这一列，直接修改为char类型的数据，最多2个字符

alter table demo1 change sex sex1 char(1);
-- 将demo表格，重命名性别列为sex1，新的数据类型是char(1)

alter table demo1 drop sex;
-- 直接删除demo表中的sex列

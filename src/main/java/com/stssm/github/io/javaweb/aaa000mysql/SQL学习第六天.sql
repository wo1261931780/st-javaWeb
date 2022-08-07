

-- 事物

DROP TABLE if EXISTS demo14bankAccount;

CREATE TABLE demo14bankAccount(
id INT PRIMARY KEY auto_increment,
account_name VARCHAR(20) COMMENT '账户名',
balance DOUBLE(7,2) COMMENT '余额'
);

INSERT INTO demo14bankAccount(account_name,balance) VALUE("张三",1000),('李四',1000);

SELECT * FROM demo14bankAccount;

-- 开始事物
BEGIN;
-- 事物开始以后，当前窗口可以看到数据变化，但是其他窗口看不到
UPDATE demo14bankAccount SET balance=balance-500 WHERE account_name='张三';
-- deshi
UPDATE demo14bankAccount SET balance=balance+500 WHERE account_name='李四';
COMMIT;
-- 执行回滚以后，数据变成以前的状态
ROLLBACK;

SELECT * FROM demo14bankaccount;


SELECT @@autocommit;-- 1，表示自动提交
UPDATE demo14bankaccount SET balance='1200' WHERE account_name='张三';
-- commit 
-- 自动提交的情况，已经省略了commit的操作







-- 事物

DROP TABLE if EXISTS DEMO_14_BANK_ACCOUNT;

CREATE TABLE DEMO_14_BANK_ACCOUNT
(
	id           INT PRIMARY KEY auto_increment,
	account_name VARCHAR(20) COMMENT '账户名',
	balance      DOUBLE(7, 2) COMMENT '余额'
);

INSERT INTO DEMO_14_BANK_ACCOUNT(account_name, balance) VALUE ('张三', 1000), ('李四', 1000);

SELECT * FROM DEMO_14_BANK_ACCOUNT;

-- 开始事物
BEGIN;
-- 事物开始以后，当前窗口可以看到数据变化，但是其他窗口看不到
UPDATE DEMO_14_BANK_ACCOUNT
SET balance=balance - 500
WHERE account_name = '张三';
-- deshi
UPDATE DEMO_14_BANK_ACCOUNT
SET balance=balance + 500
WHERE account_name = '李四';
COMMIT;
-- 执行回滚以后，数据变成以前的状态
ROLLBACK;

SELECT * FROM DEMO_14_BANK_ACCOUNT;

SELECT @@autocommit;-- 1，表示自动提交

UPDATE DEMO_14_BANK_ACCOUNT
SET balance='1200'
WHERE account_name = '张三';
-- commit
-- 自动提交的情况，已经省略了commit的操作

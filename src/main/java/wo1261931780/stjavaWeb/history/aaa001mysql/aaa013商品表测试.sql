
# 下面是商品表测试

drop table if exists DEMO_5_ORDER;
CREATE TABLE DEMO_5_ORDER
(
	id           INT PRIMARY KEY auto_increment,
	payment      DOUBLE(10, 2),
	payment_type TINYINT,
	gdsstatus    TINYINT
);
drop table if exists DEMO_6_GDS;

CREATE TABLE DEMO_6_GDS
(
	id        INT PRIMARY KEY auto_increment,
	title     VARCHAR(100),
	gds_price DOUBLE(10, 2),
	counts    INT
);

drop table if exists DEMO_7_TB;
CREATE TABLE DEMO_7_TB
(
	id       INT PRIMARY KEY auto_increment,
	order_id INT,
	gd_id    INT
);

SELECT * FROM DEMO_5_ORDER;
SELECT * FROM DEMO_6_GDS;
SELECT * FROM DEMO_7_TB;

alter TABLE DEMO_7_TB	add CONSTRAINT FK_ORDER_KEY FOREIGN KEY (order_id) REFERENCES DEMO_5_ORDER (id);
alter TABLE DEMO_7_TB	add CONSTRAINT FK_GDS_KEY FOREIGN KEY (gd_id) REFERENCES DEMO_5_ORDER (id);

#########################################################################

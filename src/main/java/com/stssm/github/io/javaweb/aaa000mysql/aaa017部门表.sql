

CREATE TABLE DEMO_11_DEPT
(
	id    INT PRIMARY KEY auto_increment,
	D_NAME VARCHAR(50),
	loc   VARCHAR(50)
);
CREATE TABLE DEMO_13_EMP
(
	id        INT PRIMARY KEY auto_increment,
	E_name    VARCHAR(50),
	job_id    VARCHAR(50),
	mgr       INT,
	JOIN_DATE DATE,
	salary    DECIMAL(7, 2),
	bonus     DECIMAL(7, 2),
	dept_id   INT,
	CONSTRAINT FK_KEY_3 FOREIGN KEY (dept_id) REFERENCES DEMO_11_DEPT (id)
);
CREATE TABLE DEMO_10_JOB
(
	id     int PRIMARY key auto_increment,
	J_NAME VARCHAR(20),
	edp_id INT,
	CONSTRAINT fkkey4 FOREIGN KEY (edp_id) REFERENCES DEMO_13_EMP (job_id)
);

CREATE TABLE DEMO_12_SALARYGRADE
(
	grade      INT PRIMARY KEY auto_increment,
	LO_SALARY  INT,
	HIS_SALARY INT
);


SELECT t1.id, t1.E_name, t1.salary, t2.J_NAME, t2.edp_id
FROM DEMO_13_EMP t1
	     LEFT JOIN DEMO_10_JOB t2 ON t1.job_id = t2.id;

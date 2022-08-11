
DROP table if EXISTS DEMO_10_JOB;
DROP table if EXISTS DEMO_13_EMP;
DROP table if EXISTS DEMO_11_DEPT;-- 有外键，需要先删除一个
DROP table if EXISTS DEMO_12_SALARY_GRADE;


#########################################################################

CREATE TABLE DEMO_10_JOB
(
	id            int PRIMARY key auto_increment NOT NULL COMMENT '主键',
	J_DESCRIPTION VARCHAR(200)                   NULL COMMENT '描述信息',
	job_name      VARCHAR(20)                    NULL COMMENT '岗位名称',
	edp_id        INT                            NULL COMMENT '部门id'
-- CONSTRAINT FK_KEY_JOB_ID FOREIGN KEY(edp_id)  REFERENCES DEMO_13_EMP(job_id)
);

#########################################################################

CREATE TABLE DEMO_11_DEPT
(
	id          INT PRIMARY KEY auto_increment NOT NULL COMMENT '主键',
	dept_name   VARCHAR(50)                    NULL COMMENT '部门名称',
	loc_address VARCHAR(50)                    NULL COMMENT '部门所在地'
);

#########################################################################


CREATE TABLE DEMO_13_EMP
(
	id            INT PRIMARY KEY auto_increment NOT NULL COMMENT '员工id',
	emp_name      VARCHAR(50)                    NULL COMMENT '员工姓名',
	job_id        INT                            NULL COMMENT '岗位id',
	senior_leader INT                            NULL COMMENT '上级领导',
	join_date     DATE                           NULL COMMENT '入职日期',
	salary        DECIMAL(7, 2)                  NULL COMMENT '薪资',
	bonus         DECIMAL(7, 2)                  NULL COMMENT '奖金',
	dept_id       INT                            NULL COMMENT '部门id',
	CONSTRAINT FK_KEY_JOB_ID FOREIGN KEY (job_id) REFERENCES DEMO_10_JOB (id),
	CONSTRAINT FK_KEY_DEPT_ID FOREIGN KEY (dept_id) REFERENCES DEMO_11_DEPT (id)
);

#########################################################################


CREATE TABLE DEMO_12_SALARY_GRADE
(
	salary_grade INT PRIMARY KEY auto_increment COMMENT '薪资等级',
	salary_min   INT NULL COMMENT '最低工资',
	salary_max   INT NULL COMMENT '最高工资'
);

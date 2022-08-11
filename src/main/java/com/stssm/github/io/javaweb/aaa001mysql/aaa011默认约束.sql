# 默认约束
# (1)添加约束
CREATE TABLE demo1
(
	name varchar(50) DEFAULT 1
);

# --建完表后添加默认约束
ALTER TABLE demo1 ALTER name SET DEFAULT 1;

# (2)删除约束
# --创建表时添加默认约束
ALTER TABLE demo1 ALTER name DROP DEFAULT;

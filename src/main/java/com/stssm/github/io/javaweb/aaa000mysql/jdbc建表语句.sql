




DROP TABLE  if EXISTS demo1;
CREATE TABLE `demo1` (
  `id` int NOT NULL COMMENT '主键' ,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
	`price` int COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
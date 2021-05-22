
-- 员工表
CREATE TABLE employee (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  name varchar(50) NOT NULL COMMENT '姓名',
  joining_date date NOT NULL COMMENT '加入时间',
  salary double NOT NULL COMMENT '工资',
  ssn varchar(30) NOT NULL COMMENT 'ssn编号',
  PRIMARY KEY (id),
  UNIQUE KEY ssn (ssn)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


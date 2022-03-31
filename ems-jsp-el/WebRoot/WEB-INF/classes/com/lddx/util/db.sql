drop database ems;
create database ems default charset utf8;
use ems;
drop table if exists t_emp;
create table t_emp(
    id int primary key auto_increment,
    name varchar(50),
    salary double,
    age int
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into t_emp(name,salary,age) values('张三',30000.2,50);
insert into t_emp(name,salary,age) values('李四',10000.21,30);
insert into t_emp(name,salary,age) values('王五',5000,27);
insert into t_emp(name,salary,age) values('赵六',4003.6,60);
select * from t_emp;

select * from t_emp where id=3;
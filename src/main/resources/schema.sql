create table student
(
    id bigint generated  by default  as identity ,
    username varchar2(40),
    name varchar2(40),
    age int,
    balance decimal(10,4)
);


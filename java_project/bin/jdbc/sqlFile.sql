-- sql create record

create user 'javaUser'@'localhost' identified by 'mysql';

grant all privileges on javaDB.* to 'javaUser'@'localhost' with grant option;
flush privileges;

create table product ( 
pno int auto_increment,
pname varchar(50) not null,
price int default 0,
regdate datetime default now(),
madeby text,
primary key(pno)
);

-- DB는 수정되거나 추가되면 변경구문을 써놔야함.

-- 2024.10.15 first record.
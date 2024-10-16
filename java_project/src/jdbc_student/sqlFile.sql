-- sql create record

create user 'javaUser'@'localhost' identified by 'mysql';

grant all privileges on javaDB.* to 'javaUser'@'localhost' with grant option;
flush privileges;
-- 위 create, grant 는 jdbc 패키지에서 처리함.

create table student (
num int auto_increment,					-- 구분번호
studnum varchar(10) not null,			-- 학번
studname varchar(10) not null,			-- 이름
admitflag int default 1,				-- 재학구분 0:휴학 1:재학 2:졸업
birthdt varchar(15),					-- 생년월일
telnum varchar(15),						-- 연락처
addr varchar(20),						-- 주소
regdate datetime default now(),			-- 등록일자
primary key(num)
);

-- DB는 수정되거나 추가되면 변경구문을 써놔야함.

-- 2024.10.16 first record.
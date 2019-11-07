create database mysqljooq if not exists;
use mysqljooq;
create table if not exists student (roll_number int,name text,primary key(roll_number));
insert into student values(1, 'Ram');
insert into student values(2, 'Sham');

create database mysqljpa;
use mysqljpa;
create table if not exists teacher (teacher_id int, name text, salary int, primary key(teacher_id));
insert into teacher values(1, 'Rishu', 30000);
insert into teacher values(2, 'Indu', 40000);

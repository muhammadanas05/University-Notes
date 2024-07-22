create database lab5;


use lab5;


-- creating table

create table course(course_id int primary key auto_increment,course_name varchar(50) not null);
create table student(student_id int primary key,student_name varchar(50),marks float (4,2),course_id int,foreign key(course_id) references course(course_id));

-- record entering 

Insert Into course(course_name) values ('DLD'),('OOPS'),('DSA');
Insert Into student(student_id,student_name,marks,course_id) values 
(5,'ASAD','45.99',2);

describe student;

select * from student;



select s.student_id, s.student_name,s.marks, c.course_id, c.course_name
from student as s
 join course as c
on s.student_id=c.course_id;create database lab5;
use lab5;

-- creating table

create table course(course_id int primary key auto_increment,course_name varchar(50) not null);
create table student(student_id int primary key,student_name varchar(50),marks float (4,2),course_id int,foreign key(course_id) references course(course_id));

-- record entering 

Insert Into course(course_name) values ('DLD'),('OOPS'),('DSA');
Insert Into student(student_id,student_name,marks,course_id) values 
(1,'BILAL','75.99',1),(2,'SOOMAN','85.99',8),(3,'ARBAZ','95.99',3),(4,'MOHIB','65.99',1),(5,'ASAD','45.99',2);

describe student;


select * from student;


select s.student_id, s.student_name,s.marks, c.course_id, c.course_name
from student as s
 join course as c
on s.student_id=c.course_id;

alter table student
add std_address1 varchar(50) first;

alter table student
add std_address2 varchar(50) after std_address1;

alter table student
add DOB date;

alter table student
drop column std_address1;

select concate (student_name, ' ', marks) as Std_info from student; 

-- select replace -- 

Insert Into student(DOB) values ('2002'/'05'/'12');

update student set DOB = '1999/04/12' where student_id = '5';


select timestampdiff(month,curdate(),'1947/08/14');

select * from student;

select sum(marks) from student;

select avg(marks) from student;

select max(marks) from student;

select min(marks) from student;

select count(marks) from student;

select sum(marks) from student
group by student_id
having student_name = 'ASAD';


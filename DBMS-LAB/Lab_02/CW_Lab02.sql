create database university;
show databases;
use university;
create table student1 (st_ID int(6), st_name varchar(15), st_marks float(4,2));
show tables;
describe student1;
show databases;

alter table student change st_ID st_reg  varchar(7); 
-- alter table student modify st_reg varchar(6);  
alter table student add st_contact int, add st_address varchar(50);
alter table student1 add st_id int; 
alter table student1 drop st_contact;
rename table student to student1;
describe student1;

select * from student1;
insert into student1 (st_age, st_marks, st_name) values (18, 85, 'Talha');
insert into student1 (st_age, st_marks, st_name) values (21, 55, 'Ali');
insert into student1 (st_age, st_marks, st_name) values (22, 65, 'Kami');

update student1 set  st_id = '1005'
where st_name = 'Ali';
delete from student1 where st_id = '1026';
delete from student1;
delete from student;

select st_id, st_name from student1;
select st_id, st_name from student1 where st_id = '1004';
select * from student1 where st_id = '1004';
select st_marks from student1;
select distinct st_marks from student1;

select st_name as id from student1;

select * from student1
where st_name = 'Anas' And st_id = '1004';

select * from student1
where st_name = 'Anas' And st_id = 1005;

select * from student1
where st_name = 'Anas' or st_id = 1005;

select * from student1
where st_name = 'Anas' And st_id = 1004;

select * from student1
where st_id in (1013,1004,1005);

select * from student1
where st_id not in (1013,1004,1005);

select * from student1
where st_id between 1004  and 1010;

select * from student1
where st_id not between 1004  and 1010;

select * from student1
where st_name like '%a%';

select * from student1
where st_name like 'a%';

select * from student1
where st_name like '%a';

select * from student1
where st_name like 'a%s';


select * from student1
where st_name like '_a%';


select * from student1
limit 0,5;

select * from student1
limit 0,9;

select * from student1
limit 0,3;

select * from student1
limit 5;

select * from student1
limit 1;

select * from student1
limit 7;

select * from student1
order by st_id asc;

select * from student1
order by st_id desc;

select * from student1
order by st_name asc;

alter table student1 add st_id int; 

alter table student1 drop st_id; 

alter table student1 add st_id int first; 

select upper(st_name) from student1;

select lower(st_name) from student1;

select length(st_name) from student1;

select concat(st_age,st_marks) from student1;

select concat(st_age,st_marks) as st_data from student1;

select concat(st_age,' ','4B',' ',st_marks) as st_data from student1;

select replace(st_name, 'Anas', 'Khiz') from student1;

select replace(st_name, 'Anas', 'Khiz') as Name_change from student1;
USE HR;
CREATE TEMPORARY TABLE T1
select * from countries
where country_id ='AR';

select * from c1;

-- Clone table: existing table ka structure clone horha
create table c1 like hr.countries;		

-- second way to create clone table
create table c2
select e.employee_id, e.first_name, d.department_name
from employees as e
join departments as d
on e.department_id = d.department_id;


create database lab_05;
use lab_05;

CREATE TABLE Employee (
    emp_ID INT PRIMARY KEY,
    emp_Name VARCHAR(20),
    deptID int,
    FOREIGN KEY (deptID) references Department (deptID)
);

CREATE TABLE Department (
    deptID INT PRIMARY KEY,
    deptName VARCHAR(30),
    emp_ID int,
    FOREIGN KEY (emp_ID) references employee (emp_ID)
);

INSERT INTO Department (deptName, deptID, emp_ID) VALUES
('BBA', 5, 01),
('ACF', 6, 02),
('AML', 7, 01);

INSERT INTO Emp (emp_Name, emp_ID, deptID) VALUES
('Anas', 01, 4),
('Bilal', 02, 3 ),
('Talha', 03, 2 ),
('Faizan',04, 4),
('Ali',05,2),
('Kamran',06,3);



select count(deptID) from Depart;
select count(emp_ID) from Emp;


select e.emp_ID, e.deptID, d.deptName
from emp  e
join Depart  d
on e.deptID = d.deptID;

select e.emp_Name, d.deptName
from employee as e
join Department as d
on e.deptID = d.deptID
where deptName like "%e%";

select e.emp_ID, e.deptID, d.deptName
from employee as e
left join Department as d
on e.deptID = d.deptID;

select e.emp_ID, e.deptID, d.deptName
from employee as e
right join Department as d
on e.deptID = d.deptID;

-- Lab TASK

SELECT d.deptName, Count(e.emp_ID) as NumOfEmp
from department as d
left join employee as e
on d.deptID = e.deptID
group by d.deptName;

SELECT d.deptName, COUNT(e.emp_ID) AS total_employees_enrolled
FROM Department d
JOIN Employee e 
ON d.deptID = e.deptID
GROUP BY d.deptName
having COUNT(e.emp_ID) > 1;



SELECT emp_Name, COUNT(deptID) 
AS total_departments_enrolled
FROM Employee
GROUP BY emp_Name;

select e.emp_Name
from employee as e
join department as d
on e.emp_ID = d.emp_ID
group by (d.emp_ID)
having count(d.deptID)> 1;





create database lab_05_assignment;
use lab_05_assignment;

CREATE TABLE Employee (
    emp_ID INT PRIMARY KEY,
    emp_Name VARCHAR(20),
    deptID int,
    salary DECIMAL(6, 2),
    FOREIGN KEY (deptID) REFERENCES Department(deptID)
);

CREATE TABLE Department (
    deptID INT PRIMARY KEY,
    deptName VARCHAR(30),
    emp_ID int
);

ALTER TABLE department
ADD CONSTRAINT emp_ID
FOREIGN KEY (emp_ID) REFERENCES employee(emp_ID);

describe employee;


INSERT INTO Department (deptName, deptID,emp_ID) VALUES
('CS', 1),
('MS', 2),
('ME', 3),
('AI', 4),
('BBA', 5, 01),
('ACF', 6, 02),
('AML', 7, 01);


INSERT INTO Employee (emp_Name, emp_ID, deptID, salary) VALUES
('Anas', 01, 4, 50000),
('Bilal', 02, 3, 45000),
('Talha', 03, 2, 60000),
('Faizan', 04, 4, 55000),
('Ali', 05, 2, 48000),
('Kamran', 06, 3, 52000);



-- 1

SELECT d.deptName,
       COUNT(e.emp_ID) AS NUM_Employees,
       MAX(e.salary) AS MAX_Salary
FROM Department d
LEFT JOIN Employee e ON d.deptID = e.deptID
GROUP BY d.deptName;

-- 2

SELECT e.emp_ID,
       e.emp_Name,
       d.deptName AS designation,
       e.salary
FROM Employee e
INNER JOIN Department d ON e.deptID = d.deptID
ORDER BY e.salary
LIMIT 1;

-- 3

SELECT d.deptName AS designation,
       e.emp_Name AS employeeName
FROM Department d
LEFT JOIN Employee e ON d.deptID = e.deptID
ORDER BY d.deptName;


-- 4

SELECT d.deptName AS country,
       COUNT(d.deptID) AS Total_Depart
FROM Department d
GROUP BY d.deptName
HAVING COUNT(d.deptID) > 2;

-- 5

SELECT DISTINCT d.deptName AS city
FROM Department d
INNER JOIN Employee e ON d.deptID = e.deptID;

-- 6

SELECT d.deptName AS department,
       e.emp_Name AS employeeName
FROM Department d
LEFT JOIN Employee e ON d.deptID = e.deptID
ORDER BY d.deptName;








create database Lab_02;
use Lab_02;
CREATE TABLE Employees (
    employee_id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    designation VARCHAR(50),
    salary Float(7, 2),
    birth_date DATE,
    hire_date DATE,
    department VARCHAR(50),
    city VARCHAR(50)
);

INSERT INTO Employees (employee_id, first_name, last_name, designation, salary, birth_date, hire_date, department, city)
VALUES 
(1, 'Ali', 'Bilal', 'Manager', 50000, '2001-05-15', '2020-01-15', 'HR', 'Paris'),
(2, 'Hassan', 'Ahmed', 'Developer', 60000, '1999-08-20', '2019-03-10', 'IT', 'Lezenburg'),
(3, 'Talha', 'Ahmed', 'Auditor', 45000, '2001-11-10', '2020-06-20', 'Finance', 'Rome'),
(4, 'Muhammad', 'Saad', 'Manager', 55000, '2000-03-25', '2019-09-05', 'HR', 'Houston'),
(5, 'Talha', 'Nizamani', 'Developer', 39000, '2002-07-18', '2021-02-12', 'IT', 'Boston'),
(6, 'Sarah', 'Ali', 'Auditor', 48000, '1998-12-05', '2020-08-30', 'Finance', 'Seattle'),
(7, 'Usama', 'Faisal', 'Manager', 52000, '1999-09-12', '2018-05-20', 'HR', 'Lahore'),
(8, 'Peter', 'Pan', 'Developer', 65000, '1994-04-30', '2021-09-10', 'IT', 'San Francisco');

SELECT first_name, last_name, designation, department FROM Employees;

SELECT first_name, last_name, salary, hire_date 
FROM Employees 
ORDER BY hire_date DESC;

SELECT DISTINCT department FROM Employees;

SELECT * FROM Employees
WHERE salary < 40000 AND hire_date >= '2021-01-01' AND hire_date <= '2021-12-31';

SELECT DISTINCT city FROM Employees
WHERE city LIKE '%r%' OR city LIKE '%i%';

SELECT department, first_name, last_name, hire_date, salary
FROM Employees
WHERE hire_date BETWEEN '2019-02-01' AND '2021-10-31'
ORDER BY hire_date DESC, salary ASC;

SELECT * FROM Employees
WHERE designation = 'Manager' AND city = 'Lahore';

SELECT 
    first_name,
    salary,
    salary * 0.2 AS Bonus,
    salary * 1.2 AS "New Salary"
FROM Employees
WHERE designation IN ('Manager', 'Auditor');














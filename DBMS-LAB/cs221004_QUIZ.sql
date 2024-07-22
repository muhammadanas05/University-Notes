create database Q1;

use q1;

CREATE TABLE departments(department_id int primary key, department_name varchar(100), manager_id int); 

CREATE TABLE employees(employee_id int primary key, first_name varchar(100), manager_id int, salary int, department_id int ); 
ALTER TABLE employees
ADD CONSTRAINT department_id
  FOREIGN KEY () REFERENCES departments;


SELECT e.first_name
FROM employees e
JOIN departments d ON e.department_id = d.department_id
WHERE d.department_name = 'IT'
AND e.salary > (
    SELECT AVG(salary)
    FROM employees
    WHERE department_id IN (
        SELECT department_id
        FROM departments
        WHERE department_name = 'IT'
    )
);

SELECT first_name, salary
FROM employees
WHERE salary > (
    SELECT AVG(salary)
    FROM employees
);

SELECT e.first_name, d.department_id
FROM employees e
JOIN (
    SELECT manager_id
    FROM employees
    GROUP BY manager_id
    HAVING COUNT(*) >= 4
) ON e.employee_id = m.manager_id;

SELECT *
FROM departments
WHERE manager_id = 100;
























write queries my MySAL for below mentione requirements

Create tables for Employees and departments. Set column name and its data type according to the given data. Set primary key relation only.
Write a SQL query to find those employees who earn more than the average salary and who work in any of the 'IT' departments. Return the last name.
Write a query to find the first name and salary of the employees whose salary is greater than the average salary
Write a SQL query to find those managers who supervise four or more employees. Return manager name, and department ID.
Write a SQL query to find those departments managed by '100'. Return all the fields of departments
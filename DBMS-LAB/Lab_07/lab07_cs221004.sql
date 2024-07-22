use hr;

CREATE VIEW EmployeeView AS
SELECT First_Name, Hire_Date
FROM Employees;

DESCRIBE EmployeeView;


INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
VALUES (0507, 'Anas', 'Khan', 'anas.khan@yahoo.com', '021-555-1234', '2024-06-08', 'IT_PROG', 60000, NULL, NULL, 1);


SELECT * FROM employees;

CREATE VIEW EmployeeInfo AS
SELECT employee_id, first_name, last_name, hire_date
FROM employees;

SELECT * FROM EmployeeInfo;

SELECT * FROM EmployeeView;

CREATE OR REPLACE VIEW EmployeeView AS
SELECT first_name, hire_date
FROM employees
WHERE YEAR(hire_date) = 2020;

SELECT * FROM EmployeeView;

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
VALUES (1020, 'Ali', 'Bilal', 'ali.bilal@gmail.com', '021-555-5678', '2012-12-19', 'HR_REP', 45000.00, NULL, NULL, 2);

SELECT * FROM employees;

SELECT * FROM EmployeeInfo;

SELECT * FROM EmployeeView;

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
VALUES (1069, 'Basit', 'K', 'basit.k@gmail.com', '021-555-9876', '2020-08-16', 'SA_REP', 50000.00, NULL, NULL, 3);

SELECT * FROM employees;

SELECT * FROM EmployeeInfo;

SELECT * FROM EmployeeView;





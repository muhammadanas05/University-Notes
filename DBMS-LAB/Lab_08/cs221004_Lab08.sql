use hr;

SELECT first_name, last_name, job_title, salary
FROM employees e
JOIN jobs j ON e.job_id = j.job_id
WHERE salary = (SELECT MAX(salary) FROM employees);

SELECT first_name, last_name, TIMESTAMPDIFF(YEAR, hire_date, CURDATE()) AS experience
FROM employees
WHERE hire_date = (SELECT MIN(hire_date) FROM employees);

SELECT first_name, last_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

SELECT e.first_name, e.last_name, e.salary, d.department_name
FROM employees e
JOIN departments d ON e.department_id = d.department_id
WHERE salary = (
    SELECT MAX(salary)
    FROM employees e2
    WHERE e2.department_id = e.department_id
);


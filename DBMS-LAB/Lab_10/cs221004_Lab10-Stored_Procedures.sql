create database lab_10;

use lab_10;

CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    job_id VARCHAR(10),
    salary DECIMAL(10, 2),
    manager_id INT,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments(department_id)
);

CREATE TABLE Departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50),
    manager_id INT
);

-- 1

DELIMITER $$

CREATE PROCEDURE GetHighestPaidEmployee()
BEGIN
    SELECT first_name, job_id, salary
    FROM Employees
    WHERE salary = (SELECT MAX(salary) FROM Employees);
END$$

DELIMITER ;


-- 2

DELIMITER $$

CREATE PROCEDURE GetEmployeesWithSalaryAbove(IN salary_threshold DECIMAL(10, 2))
BEGIN
    SELECT employee_id, first_name, job_id, salary, manager_id, department_id
    FROM Employees
    WHERE salary > salary_threshold;
END$$

DELIMITER ;

-- 3

DELIMITER $$

CREATE PROCEDURE GetAverageOfMinimumSalaries(OUT avg_min_salary DECIMAL(10, 2))
BEGIN
    SELECT AVG(min_salary) INTO avg_min_salary
    FROM (
        SELECT MIN(salary) AS min_salary
        FROM Employees
        GROUP BY department_id
    ) AS min_salaries;
END$$

DELIMITER ;

-- 4

DELIMITER $$

CREATE PROCEDURE GetBonusPercentageIF(IN emp_id INT, OUT bonus_percentage DECIMAL(5, 2))
BEGIN
    DECLARE max_salary DECIMAL(10, 2);
    DECLARE emp_salary DECIMAL(10, 2);

    SELECT MAX(salary) INTO max_salary FROM Employees;
    SELECT salary INTO emp_salary FROM Employees WHERE employee_id = emp_id;

    IF emp_salary > 0.70 * max_salary THEN
        SET bonus_percentage = 5.0;
    ELSEIF emp_salary > 0.50 * max_salary THEN
        SET bonus_percentage = 15.0;
    ELSEIF emp_salary > 0.20 * max_salary THEN
        SET bonus_percentage = 25.0;
    ELSE
        SET bonus_percentage = 35.0;
    END IF;
END$$

DELIMITER ;

-- 5

DELIMITER $$

CREATE PROCEDURE GetBonusPercentageCASE(IN emp_id INT, OUT bonus_percentage DECIMAL(5, 2))
BEGIN
    DECLARE max_salary DECIMAL(10, 2);
    DECLARE emp_salary DECIMAL(10, 2);

    SELECT MAX(salary) INTO max_salary FROM Employees;
    SELECT salary INTO emp_salary FROM Employees WHERE employee_id = emp_id;

    SET bonus_percentage = CASE
        WHEN emp_salary > 0.70 * max_salary THEN 5.0
        WHEN emp_salary > 0.50 * max_salary THEN 15.0
        WHEN emp_salary > 0.20 * max_salary THEN 25.0
        ELSE 35.0
    END;
END$$

DELIMITER ;

-- 6

DELIMITER $$

CREATE PROCEDURE CalculateAllEmployeeBonuses()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE emp_id INT;
    DECLARE emp_salary DECIMAL(10, 2);
    DECLARE max_salary DECIMAL(10, 2);
    DECLARE bonus_percentage DECIMAL(5, 2);
    DECLARE emp_cursor CURSOR FOR SELECT employee_id, salary FROM Employees;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    SELECT MAX(salary) INTO max_salary FROM Employees;

    OPEN emp_cursor;

    read_loop: LOOP
        FETCH emp_cursor INTO emp_id, emp_salary;
        IF done THEN
            LEAVE read_loop;
        END IF;

        SET bonus_percentage = CASE
            WHEN emp_salary > 0.70 * max_salary THEN 5.0
            WHEN emp_salary > 0.50 * max_salary THEN 15.0
            WHEN emp_salary > 0.20 * max_salary THEN 25.0
            ELSE 35.0
        END;

        -- INSERT INTO EmployeeBonuses (employee_id, bonus_percentage) VALUES (emp_id, bonus_percentage);
    END LOOP;

    CLOSE emp_cursor;
END$$

DELIMITER ;









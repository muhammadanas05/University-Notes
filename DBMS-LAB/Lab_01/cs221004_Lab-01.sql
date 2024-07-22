CREATE DATABASE LAB_01;
SHOW DATABASES;
USE LAB_01;
SHOW TABLES;
CREATE TABLE table01(
    id INT,
    name VARCHAR(50),
    age INT,
    Address VARCHAR(15),
    City VARCHAR(20),
    DOB DATE
);

CREATE TABLE table02 (
    Last_Name VARCHAR(50),
    Father_Name CHAR(50),
    Siblings INT,
    GPA FLOAT,
    PASSED_HSSC BOOLEAN,
    SALARY NUMERIC
);

DESCRIBE table02;

		INSERT INTO table01 (id, name, age, Address, City, DOB)
		VALUES (1001, 'Faizan', 22, 'Phase 2', 'Karachi', '2001-06-05'),
			(1003, 'Talha', 19, 'Johar', 'Islamabad', '2004-11-01'),
			(1004, 'Anas', 20, 'Garden', 'Lahore', '2003-12-07'),
			(1005, 'Ali', 21, 'Model', 'Hyderabad', '2002-08-01');

INSERT INTO table02 VALUES 
    ('KHAN', 'qwe', 3, 3.58, TRUE, 90000),
    ('Nizamani', 'klm', 3, 3.70, FALSE, 60000),
    ('Muhammad', 'abc', 3, 3.00, TRUE, 50000),
    ('Bilal', 'xyz', 1, 3.30, FALSE, 80000);

SELECT * FROM table01;
SELECT * FROM table02;

ALTER TABLE table01 
    ADD COLUMN Phone_number VARCHAR(20),
    ADD COLUMN Cnic VARCHAR(100);



ALTER TABLE table02 
    MODIFY COLUMN SALARY INT,
    MODIFY COLUMN Father_name VARCHAR(50);

TRUNCATE TABLE table01;

Select * from table02;

DELETE FROM table02 where GPA = 3.00 limit 100;

UPDATE table02
SET Last_Name = 'KHAN', Father_name = 'ALI', Siblings = 6, GPA = 1.00, PASSED_HSSC = FALSE, SALARY = 100000
where GPA = 3.58 limit 	100;

SELECT * FROM table02;
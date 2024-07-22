create database lab_04_task;
use lab_04_task;

CREATE TABLE Employee (
    employeeID INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(20) NOT NULL,
    lastName VARCHAR(20) NOT NULL,
    hiringDate DATE,
    deptID INT,
    jobID VARCHAR(15)
);

CREATE TABLE Department (
    deptID INT AUTO_INCREMENT PRIMARY KEY,
    deptName VARCHAR(30) NOT NULL,
    locationID INT
);

CREATE TABLE Job (
    jobID VARCHAR(10) PRIMARY KEY,
    jobTitle VARCHAR(30) NOT NULL,
    salary DECIMAL(8, 2)
);

CREATE TABLE Location (
    locationID INT AUTO_INCREMENT PRIMARY KEY,
    city VARCHAR(20) NOT NULL DEFAULT 'Karachi',
    country VARCHAR(20) NOT NULL DEFAULT 'Pakistan'
);

INSERT INTO Employee (firstName, lastName, hiringDate, deptID, jobID) VALUES
('Muhammad', 'Anas', '2024-01-25', 1, 'IT1004'),
('Ali', 'Bilal', '2023-02-22', 2, 'MAN1005'),
('Talha', 'Nizamani', '2024-04-15', NULL, 'IT1003'),
('Faizan', 'Awan', '2023-08-05', 1, 'FIN1001');

INSERT INTO Department (deptName, locationID) VALUES
('Information Technology', 1),
('Management', 2),
('Finance', NULL);

INSERT INTO Job (jobID, jobTitle, salary) VALUES
('IT1004', 'Developer', 90000.00),
('MAN1005', 'Manager', 80000.00),
('FIN1001', 'Finance', 70000.00);

SELECT * FROM location;
describe job;

ALTER TABLE Employee MODIFY COLUMN firstName VARCHAR(50) NOT NULL;
ALTER TABLE Employee MODIFY COLUMN lastName VARCHAR(50) NOT NULL;
ALTER TABLE Department MODIFY COLUMN deptName VARCHAR(50) NOT NULL;
ALTER TABLE Job MODIFY COLUMN jobTitle VARCHAR(50) NOT NULL;



DELETE FROM Location WHERE locationID = 2;

UPDATE Department SET locationID = NULL WHERE locationID = 2;

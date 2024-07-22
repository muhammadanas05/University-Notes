USE HR;

CREATE TEMPORARY TABLE EmployeeInfo (
    full_name VARCHAR(30),
    job_title VARCHAR(10),
    department VARCHAR(15)
);

DESCRIBE EmployeeInfo;

CREATE TABLE Emp_Clone LIKE Employees;

INSERT INTO Emp_Clone SELECT * FROM Employees;

Describe Employees;
describe Emp_Clone;

SELECT * FROM Emp_Clone;


ALTER TABLE Emp_Clone DROP COLUMN hire_date;

describe Employees;
describe Emp_Clone;



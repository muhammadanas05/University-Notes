use lab_10;

CREATE TABLE DeleteLog (
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    employee_id INT,
    employee_name VARCHAR(50),
    deleted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER $$

DELIMITER $$

CREATE TRIGGER before_employee_delete
BEFORE DELETE ON Employees
FOR EACH ROW
BEGIN
    INSERT INTO DeleteLog (username, employee_id, employee_name, deleted_at)
    VALUES (@current_user, OLD.employee_id, OLD.first_name, CURRENT_TIMESTAMP);
END$$

DELIMITER ;


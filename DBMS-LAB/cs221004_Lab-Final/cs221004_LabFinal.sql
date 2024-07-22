-- Muhammad Anas
-- CS221004
create database Lab_Final;

use Lab_Final;

CREATE TABLE Supplier1 (
    sid INT PRIMARY KEY,
    sname VARCHAR(15) NOT NULL,
    scity VARCHAR(15),
    SupEstablished DATE
);

CREATE TABLE Categories (
    CategoryID INT PRIMARY KEY,
    CategoryName VARCHAR(50) NOT NULL,
    Description VARCHAR(100)
);

CREATE TABLE Customers (
    cid INT PRIMARY KEY,
    cname VARCHAR(55) NOT NULL,
    ccity VARCHAR(15)
);

CREATE TABLE Orders (
    cid INT,
    pid VARCHAR(7),
    ostatus bool,
    PRIMARY KEY (cid, pid),
    FOREIGN KEY (cid) REFERENCES Customers(cid),
    FOREIGN KEY (pid) REFERENCES Products(pid)
);

CREATE TABLE Products (
    pid VARCHAR(7) PRIMARY KEY,
    pname VARCHAR(55) NOT NULL,
    pcategory varchar(50),
    pprice DECIMAL(6, 2),
    sid INT,
    FOREIGN KEY (pcategory) REFERENCES Categories(CategoryID),
    FOREIGN KEY (sid) REFERENCES Supplier1(sid)
);

-- 2

CREATE TEMPORARY TABLE prod AS
SELECT * FROM Products;

UPDATE prod
SET pprice = 5000  
WHERE pcategory IN (SELECT pcategory FROM Products WHERE pid 
IN (SELECT pid FROM Orders GROUP BY pid HAVING COUNT(*) <= 5));

-- 3

CREATE TABLE prodTemp LIKE Products;

DESCRIBE prodTemp;
SELECT * FROM prodTemp;


-- 4

CREATE TABLE prodClone AS
SELECT c.cname, p.pname, o.ostatus FROM Customers c
JOIN Orders o ON c.cid = o.cid
JOIN Products p ON o.pid = p.pid;

DESCRIBE prodClone;
SELECT * FROM prodClone;

-- 5

CREATE VIEW supView AS
SELECT sid, sname, SupEstablished
FROM Supplier1 WHERE YEAR(SupEstablished) != 2019;

ALTER TABLE Supplier1
ADD CONSTRAINT Not_in_19 CHECK (YEAR(SupEstablished) != 2019);

INSERT INTO supView (sid, sname, SupEstablished)
VALUES (1004, 'ANAS', '2019-02-21');


-- 6

CREATE VIEW supView2 AS
SELECT sid, sname, SupEstablished FROM Supplier1 WHERE YEAR(SupEstablished) != 2019;

INSERT INTO supView2 (sid, sname, SupEstablished) VALUES (1004, 'Muhammad Anas', '2019-02-12');

SELECT * FROM Supplier1;

-- 7

SELECT pname, pprice,
       CASE
           WHEN pprice > 1000 THEN 'Expensive'
           ELSE 'Cheap'
       END AS status,
       ROUND(AVG(pprice) OVER (), 2) AS Avg_Price
FROM Products;


-- 8
SELECT AVG(Max_Price) AS Avg_MaxPrice
FROM (SELECT MAX(pprice) AS Max_Price FROM Products GROUP BY pcategory)
    as N;


-- 9
SELECT p.pname, s.sname, p.pprice FROM Products p
JOIN Supplier1 s ON p.sid = s.sid
WHERE p.pprice = (SELECT MIN(pprice) FROM Products WHERE pcategory = p.pcategory);

-- 10
DELIMITER $$
CREATE PROCEDURE Supplier_Status(IN supplier_id INT)
BEGIN
    DECLARE p_count INT;
    DECLARE sup_status VARCHAR(50);

    SELECT COUNT(*) INTO p_count
    FROM Products
    WHERE sid = supplier_id;

    IF p_count < 5 THEN
        SET sup_status = 'Least Preferred';
    ELSEIF p_count < 8 THEN
        SET sup_status = 'Average Supplier';
    ELSE
        SET sup_status = 'Most Preferred';
    END IF;

    SELECT sname, sup_status
    FROM Supplier1
    WHERE sid = supplier_id;
END $$
DELIMITER ;

CALL Supplier_Status(1); 

-- 11







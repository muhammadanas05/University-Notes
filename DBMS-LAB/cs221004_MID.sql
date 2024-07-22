create database MID;
use MID;


create table product( 
ProductID int,
ProductName varchar(40),
SupplierID int,
UnitPrice float(4,2),
primary key (ProductID)
);

create table Supplier( 
SupplierID int,
CompanyName varchar(40),
primary key (SupplierID)
);

create table OrderTable( 
orderid int,
orderdate date,
requireddate date,
shippeddate date,
primary key (orderid)
);

alter table product
add constraint supplierID foreign key (supplierID) reference Supplier (supplierID);

ALTER TABLE product 
CHANGE COLUMN ProductID ProductID INT NOT NULL AUTO_INCREMENT ;

ALTER TABLE product
CHANGE COLUMN ProductName ProductName VARCHAR(40) NOT NULL ;

ALTER TABLE supplier
CHANGE COLUMN CompanyName CompanyName VARCHAR(40) NOT NULL ;


SELECT p.SupplierID, p.ProductName, s.CompanyName
FROM product as p
JOIN supplier as s 
ON p.SupplierID = s.SupplierID
WHERE s.CompanyName IN ('Exotic Liquids', 'Specialty Biscuits, Ltd', 'Escargots Nouveaux')
ORDER BY p.SupplierID;


SELECT ProductID, ProductName, UnitPrice
FROM product
WHERE UnitPrice BETWEEN 18 AND 40;

SELECT orderid, orderdate, requireddate, shippeddate
FROM OrderTable
WHERE shippeddate > requireddate;

SELECT orderid, orderdate, requireddate, shippeddate
FROM OrderTable
WHERE orderid % 2 <> 0;


















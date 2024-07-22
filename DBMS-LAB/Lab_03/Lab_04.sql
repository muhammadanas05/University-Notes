create database Lab_04;
use Lab_04;
CREATE TABLE customer (
    c_id INT,
    c_name varchar(20),
    c_city VARCHAR(50)
);

alter table customer
change column 'c_id' 'c_id' int not auto_increment;

CREATE TABLE orders (
    cid INT,
    pid varchar(20),
    ostatus boolean
);

alter table orders add foreign key (cid) references customer(c_id);
alter table orders add foreign key (pid) references products(pid);

CREATE TABLE products (
    pid varchar(20),
    pname varchar(50),
    pcategory VARCHAR(50),
    pprice float(4,2),
    sid int
);

-- ALTER TABLE `lab_04`.`products` 
-- CHANGE COLUMN `sid` `sid` INT NOT NULL ,
-- DROP PRIMARY KEY,
-- ADD PRIMARY KEY (`pid`, `sid`);

alter table products add foreign key (sid) references suppliers(sid);


CREATE TABLE suppliers (
    sid INT,
    sname varchar(20),
    scity VARCHAR(50),
    sestablish varchar(10)
);


CREATE TABLE student (
    std_id INT unique not null,
    std_name varchar(20) unique
);

INSERT INTO student (std_id,std_name)
VALUES 
('', 'bilal');

CREATE TABLE employee (
    emp_id INT not null default '0000',
    emp_name varchar(20)
);

INSERT INTO employee (emp_name)
VALUES 
('bilal'); 
INSERT INTO employee (emp_id,emp_name)
VALUES 
(2,'bilal'); 




alter table customer
add check (c_id>=10);





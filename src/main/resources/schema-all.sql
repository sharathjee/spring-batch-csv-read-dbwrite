DROP TABLE CUSTOMER IF EXISTS;
CREATE TABLE CUSTOMER  (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(255),
    gender VARCHAR(255),
    age INT,
    registered DATE,
    orders INT,
    spent REAL,
    job VARCHAR(255),
    hobbies VARCHAR(255),
    is_married BOOLEAN
);
-- Create Database
CREATE DATABASE userdb;

-- Use Database
USE userdb;

-- Create Login Table
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100),

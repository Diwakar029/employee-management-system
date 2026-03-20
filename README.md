👨‍💼 Employee Management & Analytics System

A backend application built using Spring Boot that manages employee data and provides analytical insights such as salary trends and department-wise statistics.

🚀 Features

Add, update, and delete employee records

Retrieve all employee details via RESTful APIs

Generate average salary insights

Calculate department-wise employee count

Identify highest and lowest paid employees

Input validation using @Valid

Global exception handling for clean error responses

🛠️ Tech Stack

Java

Spring Boot

Spring Data JPA (Hibernate)

MySQL

Maven

🔗 API Endpoints

POST /employees → Add employee

GET /employees → Get all employees

PUT /employees/{id} → Update employee

DELETE /employees/{id} → Delete employee

📊 Analytics APIs

GET /employees/analytics/average-salary

GET /employees/analytics/department-count

GET /employees/analytics/highest-salary

GET /employees/analytics/lowest-salary

⚙️ How to Run

Clone the repository

Create MySQL database: employee_db

Update application.properties with your DB credentials

Run the Spring Boot application

Test APIs using Postman

📌 Highlights

Implemented layered architecture (Controller, Service, Repository)

Used custom JPA queries for analytics

Designed scalable and maintainable backend structure

Combined backend development with data analytics concepts

# Student Management System

This is a simple project made with Spring Boot for my OOP assignment.

---

## What this project does

- Add students  
- View all students  
- Update student information  
- Delete students  
- View courses  
- Assign courses to students  

---

## Technologies

- Java  
- Spring Boot  
- Maven  

---

## Endpoints

### Students

GET /students – get all students  
GET /students/{id} – get student by id  
POST /students – create student  
PUT /students/{id} – update student  
DELETE /students/{id} – delete student  

---

### Courses

GET /courses – get all courses  
GET /courses/{id} – get course  

---

### Extra

POST /students/{studentId}/courses/{courseId} – assign course to student  

---

## Project structure

controller – handles requests  
service – logic  
model – data  
exception – error handling  

---

## How to run

1. Open the project in IntelliJ IDEA  
2. Run StudentManagementApplication  
3. Open http://localhost:8080/students  

---

## Note

This project was created for learning purposes.

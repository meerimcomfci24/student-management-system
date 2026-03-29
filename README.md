# Student Management System

A backend application built with Spring Boot for managing students and courses.  
The project demonstrates CRUD operations, REST API design, and a layered architecture approach.

---

## Features

- Create, update, and delete student records  
- Retrieve all students or a specific student by ID  
- View available courses  
- Assign courses to students  
- Global exception handling  
- Clear separation of layers (controller, service, model)

---

## Technologies

- Java  
- Spring Boot  
- Maven  

---

## API Endpoints

### Students

| Method | Endpoint | Description |
|--------|--------|-------------|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students` | Create new student |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |

---

### Courses

| Method | Endpoint | Description |
|--------|--------|-------------|
| GET | `/courses` | Get all courses |
| GET | `/courses/{id}` | Get course by ID |

---

### Enrollment

| Method | Endpoint | Description |
|--------|--------|-------------|
| POST | `/students/{studentId}/courses/{courseId}` | Assign course to student |

---

## Project Structure
src/
├── controller
├── service
├── model
├── exception

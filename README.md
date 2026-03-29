# student-management-system
Spring Boot
What this project does
Add new students
See all students
Update student info
Delete students
View courses
Assign courses to students
Technologies
Java
Spring Boot
Maven
Endpoints
Students
GET /students → get all students
GET /students/{id} → get one student
POST /students → create student
PUT /students/{id} → update student
DELETE /students/{id} → delete student
Courses
GET /courses → get all courses
GET /courses/{id} → get course
Extra
POST /students/{studentId}/courses/{courseId} → assign course
Project structure
controller → handles requests
service → logic
model → data
exception → error handling

package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class StudentServiceImpl implements StudentService {
    private final ConcurrentHashMap<Long, Student> students = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);
    
    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }
    
    @Override
    public Student getStudentById(Long id) {
        Student student = students.get(id);
        if (student == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }
        return student;
    }
    
    @Override
    public Student createStudent(Student student) {
        Long id = idGenerator.getAndIncrement();
        student.setId(id);
        students.put(id, student);
        return student;
    }
    
    @Override
    public Student updateStudent(Long id, Student student) {
        Student existing = getStudentById(id);
        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        existing.setAge(student.getAge());
        return existing;
    }
    
    @Override
    public void deleteStudent(Long id) {
        students.remove(id);
    }
}

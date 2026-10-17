package com.example.demo.Controller;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


// StudentController handles HTTP requests.
@RestController // Spring automatically converts Java objects into JSON using Jackson.
// The browser/Postman receives the HTTP response directly.

public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/api/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudents(student);
    }
}
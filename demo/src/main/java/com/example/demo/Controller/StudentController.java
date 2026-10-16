package com.example.demo.Controller;
import com.example.demo.model.Student;
import com.example.demo.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
}

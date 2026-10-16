package com.example.demo.Service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(
                new Student(1, "Rahul", 20, 85)
        );

        students.add(
                new Student(2, "Ansh", 21, 92)
        );
    }
    public List<Student> getAllStudents() {
        return students;
    }
}

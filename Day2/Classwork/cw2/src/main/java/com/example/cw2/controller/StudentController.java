package com.example.cw2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw2.model.Student;

@RestController
public class StudentController {
    
    @GetMapping("/students")
    public Student getStudent() {
        Student stu = new Student("Nithish", 22);
        return stu;
    }
}

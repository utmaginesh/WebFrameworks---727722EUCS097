package com.example.cw3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw3.model.Student;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent(){
        Student stu = new Student(1L, "John Doe","This is a stiudent description");
        return stu;
    }
}

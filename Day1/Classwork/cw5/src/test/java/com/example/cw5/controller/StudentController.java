package com.example.cw5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw5.model.Student;


@RestController
public class StudentController {
    @GetMapping("/student")
    public List<Student> getStudent(){
        List<Student> student  = new ArrayList<>();
        student.add(new Student("John","Welcome, John!"));
        return student;
    }
}

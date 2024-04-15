package com.example.cw2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw2.model.Student;
import com.example.cw2.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService childrenService;
    @PostMapping("/student")
    public ResponseEntity<Student> getInfo(@RequestBody Student children) {
        Student createdChildren = childrenService.createChildren(children);
        if(createdChildren != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdChildren);
        }
        else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/student")
    public List<Student> sortbasedOnName(@RequestParam int pageNo,@RequestParam int pageSize) {
        return childrenService.sortFunc(pageNo,pageSize);
    }
    @GetMapping("/student/sort")
    public List<Student> sortLast(@RequestParam int pageNo,@RequestParam int pageSize,@RequestParam String sortBy) {
        return childrenService.sortlast(pageNo, pageSize, sortBy);
    }
}



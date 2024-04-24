package com.example.ce2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ce2.model.Course;
import com.example.ce2.service.CourseService;

@RestController
public class CourseController {
    @Autowired
    private CourseService ser;
    @PostMapping("/api/course")
    public ResponseEntity<Course> create(@RequestBody Course course) {
        Course createdCourse = ser.create(course);
        if(createdCourse != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdCourse);
        }
        else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/api/course")
    public List<Course> getMethod() {
        return ser.getList();
    }
    @GetMapping("/api/course/{courseName}")
    public List<Course> getByCourseName(@PathVariable("courseName") String courseName) {
        return ser.getByName(courseName);
    }
}

package com.example.ce2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ce2.model.Course;
import com.example.ce2.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    private CourseRepo repo;
    public Course create(Course course) {
        return repo.save(course);
    }
    public List<Course> getList() {
        return repo.findAll();
    }
    public List<Course> getByName(String name) {
        return repo.getbyname(name);
    }
}

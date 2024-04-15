package com.example.cw2.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.cw2.model.Student;
import com.example.cw2.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo sturepo;
    public Student createChildren(Student children) {
        return sturepo.save(children);
    }
    public List<Student> sortFunc(int pgno,int s) {
        return sturepo.findAll(PageRequest.of(pgno, s)).getContent();
    }
    public List<Student> sortlast(int page, int size, String field) {
        return sturepo.findAll(PageRequest.of(page, size, Sort.by(field))).getContent();
    }

}

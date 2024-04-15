package com.example.cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.cw1.model.Children;
import com.example.cw1.repository.ChildrenRepo;

@Service
public class ChildrenService {
    @Autowired
    private ChildrenRepo repo;
    public Children createChildren(Children children) {
        return repo.save(children);
    }
    public List<Children> sortFunc(String field) {
        return repo.findAll(Sort.by(field));
    }
    public List<Children> sortOff(int page, int size) {
        return repo.findAll(PageRequest.of(page, size)).getContent();
    }
    public List<Children> sortlast(int page, int size, String field) {
        return repo.findAll(PageRequest.of(page, size, Sort.by(field))).getContent();
    }
}


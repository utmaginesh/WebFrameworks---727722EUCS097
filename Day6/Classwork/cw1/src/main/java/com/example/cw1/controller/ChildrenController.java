package com.example.cw1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw1.model.Children;
import com.example.cw1.service.ChildrenService;

@RestController
@RequestMapping("/api")
public class ChildrenController {
    @Autowired
    private ChildrenService childrenService;
    @PostMapping("/children")
    public ResponseEntity<Children> getInfo(@RequestBody Children children) {
        Children createdChildren = childrenService.createChildren(children);
        if(createdChildren != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdChildren);
        }
        else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/children/sortBy/{field}")
    public List<Children> sortbasedOnName(@PathVariable("field") String field) {
        return childrenService.sortFunc(field);
    }
    @GetMapping("/children/{offset}/{pagesize}") 
    public List<Children> sortOffSet(@PathVariable("offset") int page, @PathVariable("pagesize") int size) {
        return childrenService.sortOff(page, size);
    }
    @GetMapping("/children/{offset}/{pagesize}/{field}")
    public List<Children> sortLast(@PathVariable("offset") int page, @PathVariable("pagesize") int size, @PathVariable("field") String field) {
        return childrenService.sortlast(page, size, field);
    }
}

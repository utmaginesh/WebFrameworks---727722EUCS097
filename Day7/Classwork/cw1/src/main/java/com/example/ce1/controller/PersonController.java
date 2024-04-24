package com.example.ce1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.ce1.model.Person;
import com.example.ce1.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    private PersonService ser;
    @PostMapping("/api/person")
    public ResponseEntity<Person> getMethod(@RequestBody Person p) {
        Person per = ser.create(p);
        if(per != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(per);
        }
        else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/api/person")
    public List<Person> getMethod1() {
        return ser.getObject();
    } 
    @GetMapping("/api/person/byAge")
    public List<Person> getMethod2(@RequestParam("age") int age) {
        return ser.getList(age);
    }
}

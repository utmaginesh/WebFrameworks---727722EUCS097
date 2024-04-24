package com.example.ce1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ce1.model.Person;
import com.example.ce1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    private PersonRepo repo;
    public Person create(Person p) {
        return repo.save(p);
    }
    public List<Person> getObject() {
        return repo.findAll();
    }
    public List<Person> getList(int k) {
        return repo.getlist(k);
    }
}

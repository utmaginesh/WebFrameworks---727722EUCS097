package com.example.ce3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ce3.model.Door;
import com.example.ce3.repository.DoorRepo;

@Service
public class DoorService {
    @Autowired
    private DoorRepo repo;
    public Door create(Door door) {
        return repo.save(door);
    }
    public List<Door> getList() {
        return repo.findAll();
    }
    public Door getObject(int doorId) {
        return repo.findById(doorId).orElse(null);
    }
    public List<Door> getByType(String accessType) {
        return repo.getbytype(accessType);
    }
}

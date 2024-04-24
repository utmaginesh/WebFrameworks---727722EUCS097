package com.example.ce3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ce3.model.Door;
import com.example.ce3.service.DoorService;

@RestController
public class DoorController {
    @Autowired
    private DoorService ser;
    @PostMapping("/api/door")
    public ResponseEntity<Door> create(@RequestBody Door door) {
        Door d = ser.create(door);
        if(d != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(d);
        }
        else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/api/door")
    public List<Door> getList() {
        return ser.getList();
    }
    @GetMapping("/api/door/{doorId}")
    public Door getbyid(@PathVariable("doorId") int doorId) {
        return ser.getObject(doorId);
    }
    @GetMapping("/api/door/accesstype/{accessType}")
    public List<Door> getByType(@PathVariable("accessType") String accessType) {
        return ser.getByType(accessType);
    }
}

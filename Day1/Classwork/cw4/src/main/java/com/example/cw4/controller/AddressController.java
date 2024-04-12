package com.example.cw4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw4.model.Address;

@RestController
public class AddressController {
    @GetMapping("address")
    public Address getAddress(){
        return new Address("Sample Name", 123, "Main St", 12345, "Sample Area", "Sample District", "Sample State", "Sample Country");
    }
}

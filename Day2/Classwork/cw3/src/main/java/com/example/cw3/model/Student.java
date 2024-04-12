package com.example.cw3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
    public long id;
    public String name;
    @JsonIgnore
    public String description;
    public Student(long id,String name,String description){
        this.name = name;
        this.id = id;
        this.description = description;
    }
}

package com.example.cw2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("st.name")
    public String name;
    
    @JsonProperty("st.age")
    public int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}

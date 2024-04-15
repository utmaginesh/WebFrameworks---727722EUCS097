package com.example.cw1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Children {
    @Id
    private int babyId;
    private String babyFirstName;
    private String babyLastName;
    private String fatherName;
    private String motherName;
    private String address;
}


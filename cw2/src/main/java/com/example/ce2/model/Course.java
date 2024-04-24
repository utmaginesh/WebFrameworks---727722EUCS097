package com.example.ce2.model;


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
public class Course {
    @Id
    private int courseId;
    private String courseName, instructor, preRequisites, enrolledStudents;
    private int creditHours, maxCapacity;
}

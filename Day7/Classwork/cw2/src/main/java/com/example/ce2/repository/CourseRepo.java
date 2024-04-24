package com.example.ce2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.ce2.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {
    @Query("select c from Course c where courseName = :val")
    List<Course> getbyname(@Param("val") String name);
    
}

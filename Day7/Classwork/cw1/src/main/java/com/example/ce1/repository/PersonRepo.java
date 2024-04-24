package com.example.ce1.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.ce1.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{
    @Query("select p from Person p where p.age = :val1")
    List<Person> getlist(@Param("val1") int n);
}

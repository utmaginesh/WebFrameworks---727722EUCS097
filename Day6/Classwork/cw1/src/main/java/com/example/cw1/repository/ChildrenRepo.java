package com.example.cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cw1.model.Children;

public interface ChildrenRepo extends JpaRepository<Children, Integer> 
{
    
}


package com.example.ce3.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.ce3.model.Door;

public interface DoorRepo extends JpaRepository<Door, Integer>{
    @Query("select d from Door d where accessType = :val")
    List<Door> getbytype(@Param("val") String accessType);
}

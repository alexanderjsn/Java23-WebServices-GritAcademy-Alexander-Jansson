package com.example.demo.models;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {


    List<StudentEntity> findByfNameContainingIgnoreCase(String fName);

}

package com.example.demo.models;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.StudentEntity;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

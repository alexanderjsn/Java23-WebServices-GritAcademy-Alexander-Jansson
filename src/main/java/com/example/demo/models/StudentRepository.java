package com.example.demo.models;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

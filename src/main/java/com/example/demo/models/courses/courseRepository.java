package com.example.demo.models.courses;
import com.example.demo.models.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface courseRepository extends JpaRepository<CourseEntity, Long> {
}

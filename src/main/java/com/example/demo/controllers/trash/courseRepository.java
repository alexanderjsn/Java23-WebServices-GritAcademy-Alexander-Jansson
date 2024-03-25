package com.example.demo.controllers.trash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface courseRepository extends JpaRepository<CourseEntity, Long> {
}

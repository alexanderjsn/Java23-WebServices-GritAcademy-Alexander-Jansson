package com.example.demo.models.courses;
import com.example.demo.Course;
import com.example.demo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface courseRepository extends JpaRepository<Course, Long> {


    @Query("SELECT c FROM Course c WHERE " +
            "LOWER(c.name) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(c.description) LIKE LOWER(CONCAT('%', :query, '%'))")
    List<Course> searchAllCourses(@Param("query") String query);
}

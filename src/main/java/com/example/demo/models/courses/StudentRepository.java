package com.example.demo.models.courses;
import com.example.demo.CourseNameDTO;
import com.example.demo.Student;
import com.example.demo.StudentNameDTO;
import com.example.demo.controllers.trash.StudentCoursesEntity;
import com.example.demo.controllers.trash.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {




    @Query("SELECT s FROM Student s WHERE " +
            "LOWER(s.fName) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(s.lName) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(s.town) LIKE LOWER(CONCAT('%', :query, '%'))")

    List<Student> searchAll(@Param("query") String query);
}

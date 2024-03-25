package com.example.demo.controllers.trash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
public interface StudentCourseRepository extends JpaRepository<StudentCoursesEntity, Long> {



    @Query("SELECT sc.students.id FROM StudentCoursesEntity sc WHERE sc.courses.id = :courseId")


    List<String> searchByCourseName(@Param("courseId") String courseId);


}

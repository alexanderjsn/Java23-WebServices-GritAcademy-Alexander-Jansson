package com.example.demo.models.courses;
import com.example.demo.StudentCourse;
import com.example.demo.StudentNameDTO;
import com.example.demo.controllers.trash.StudentCoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {

    @Query("SELECT new com.example.demo.StudentNameDTO(s.fName, s.lName) FROM StudentCourse sc JOIN sc.student s WHERE sc.course.id = :courseId")
    List<StudentNameDTO> findStudentNamesByCourseId(Long courseId);

}

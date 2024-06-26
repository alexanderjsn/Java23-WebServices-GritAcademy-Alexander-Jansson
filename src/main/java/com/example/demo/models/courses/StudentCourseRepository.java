package com.example.demo.models.courses;
import com.example.demo.CourseNameDTO;
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


    @Query("SELECT new com.example.demo.CourseNameDTO(c.name, c.description) FROM StudentCourse sc JOIN sc.course c WHERE sc.student.id = :studentId")
    List<CourseNameDTO> findCoursesByStudentId(Long studentId);


    @Query("SELECT new com.example.demo.StudentNameDTO(s.student.fName, s.student.lName) FROM StudentCourse s WHERE s.course.name = :courseName")
    List<StudentNameDTO> findStudentsByCourseName(@Param("courseName")String courseName);


    @Query("SELECT new com.example.demo.CourseNameDTO(c.name, c.description) FROM StudentCourse sc JOIN sc.student s JOIN sc.course c WHERE s.fName = :fName OR s.lName = :lName OR s.town = :town")
    List<CourseNameDTO> findCoursesByStudentDetails(@Param("fName") String fName, @Param("lName") String lName, @Param("town") String town);
}


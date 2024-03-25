package com.example.demo.controllers.trash;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCoursesService {

    // hämtar repository
    private final StudentCourseRepository studentCourseRepository;


    public StudentCoursesService(StudentCourseRepository studentCourseRepository) {
        this.studentCourseRepository = studentCourseRepository;
    }

    public List<String> allStudentsbyCourse(String courseName){
        return studentCourseRepository.searchByCourseName(courseName);
    }
}

package com.example.demo.models.courses;


import com.example.demo.CourseNameDTO;
import com.example.demo.StudentNameDTO;
import com.example.demo.models.courses.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCoursesService {

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentNameDTO> getStudentNamesbyCourseId(Long courseId){
        return studentCourseRepository.findStudentNamesByCourseId(courseId);
    }

    public List<CourseNameDTO> getCoursesByStudentId(Long studentId){
        return studentCourseRepository.findCoursesByStudentId(studentId);
    }

    public List<StudentNameDTO> getStudentsByCourseName(String courseName){
        return studentCourseRepository.findStudentsByCourseName(courseName);
    }


    public List<CourseNameDTO> getCoursesByStudentDetails(String fName, String lName, String town){
        return studentCourseRepository.findCoursesByStudentDetails(fName, lName, town);
    }

}




























/*
    // hämtar repository
    private final StudentCourseRepository studentCourseRepository;


    public StudentCoursesService(StudentCourseRepository studentCourseRepository) {
        this.studentCourseRepository = studentCourseRepository;
    }

    public List<String> allStudentsbyCourse(String courseName){
        return studentCourseRepository.searchByCourseName(courseName);
    }*/
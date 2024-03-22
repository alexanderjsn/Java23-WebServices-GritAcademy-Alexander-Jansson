package com.example.demo.controllers;

import com.example.demo.models.ServiceStudents;
import com.example.demo.models.StudentEntity;
import com.example.demo.models.courses.CourseEntity;
import com.example.demo.models.courses.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller

public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping("/getCourses")
    public String getCourses(Model model){
        List<CourseEntity> courses = courseService.findAllCourses();
        model.addAttribute("courses", courses);
        return "students";
    }



}

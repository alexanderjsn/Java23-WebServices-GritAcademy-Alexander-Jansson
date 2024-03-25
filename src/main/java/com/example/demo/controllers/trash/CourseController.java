package com.example.demo.controllers.trash;

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

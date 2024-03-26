package com.example.demo.models.courses;

import com.example.demo.Course;
import com.example.demo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller

public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping("/courses")
    public String getCourses(Model model){
        List<Course> courses = courseService.findAllCourses();
        model.addAttribute("courses", courses);
        return "courses";
    }

    @GetMapping("/courses/searchAllCourses")
    public String searchAll(@RequestParam("query") String query, Model model){
        List<Course> courseSearch = courseService.searchCourses(query);
        model.addAttribute("courseSearch", courseSearch);
        return "courses";
    }

}

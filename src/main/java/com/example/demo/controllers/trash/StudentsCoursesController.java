package com.example.demo.controllers.trash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student/course")

public class StudentsCoursesController {

        private StudentCoursesService studentCoursesService;

        @Autowired
        public StudentsCoursesController(StudentCoursesService studentCoursesService){
            this.studentCoursesService = studentCoursesService;
        }


        @GetMapping("/searchStudents")
        public String searchStudentsbyCourse(@RequestParam("name") String courseName, Model model){
            List<String> students=  studentCoursesService.allStudentsbyCourse(courseName);
            model.addAttribute("students", students);
            return "students";
        }
    }



/*
*    @GetMapping("/getAssociations")
    public String getAssociations(@RequestParam String query, Model model){
        List<String> associations = studentCoursesService.findStudentsByCourseId(query);
        model.addAttribute("associations", associations);
        return "students";
    }
*
* */
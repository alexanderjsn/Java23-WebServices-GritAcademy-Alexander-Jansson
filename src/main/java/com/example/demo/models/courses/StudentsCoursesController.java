package com.example.demo.models.courses;

import com.example.demo.StudentNameDTO;
import com.example.demo.models.courses.StudentCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class StudentsCoursesController {

    @Autowired
    private StudentCoursesService studentCoursesService;

    @GetMapping("/students/by_course")
    public String showForm(Model model){
        return "studentForm";
    }

    @PostMapping("/students/by-course")
    public String getStudentNamesByCourseId(@RequestParam("courseId") Long courseId, Model model) {
        List<StudentNameDTO> studentNames = studentCoursesService.getStudentNamesbyCourseId(courseId);
        model.addAttribute("studentNames", studentNames);
        return "studentList";
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
*
*
*
*
*
*
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
* */
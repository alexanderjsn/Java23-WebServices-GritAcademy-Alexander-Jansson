package com.example.demo.models.courses;
import com.example.demo.Student;
import com.example.demo.controllers.trash.StudentEntity;
import com.example.demo.models.courses.ServiceStudents;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;


@Controller

public class StudentController {

    private final ServiceStudents serviceStudents;

    public StudentController(ServiceStudents serviceStudents) {
        this.serviceStudents = serviceStudents;
    }


    @GetMapping("/students")
    public String getStudents(Model model){
        List<Student> students = serviceStudents.findAllStudents();
        model.addAttribute("students", students);
        return "students";
    }


    @GetMapping("/students/searchAll")
    public String searchAll(@RequestParam("query") String query, Model model){
        List<Student> students = serviceStudents.searchAll(query);
        model.addAttribute("students", students);
        return "students";
    }


/*
    @GetMapping("/searchfName")
    public String searchedStudents(@RequestParam("query") String query, Model model){
        List<StudentEntity> students = serviceStudents.searchfName(query);
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/searchlName")
    public String searchlName(@RequestParam("query") String query, Model model){
        List<StudentEntity> students = serviceStudents.searchlName(query);
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/searchTown")
    public String searchTown(@RequestParam("query") String query, Model model){
        List<StudentEntity> students = serviceStudents.searchTown(query);
        model.addAttribute("students", students);
        return "students";
    }*/


}

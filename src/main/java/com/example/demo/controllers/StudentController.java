package com.example.demo.controllers;
import com.example.demo.models.ServiceStudents;
import com.example.demo.models.StudentEntity;
import com.example.demo.models.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController

public class StudentController {

    private final ServiceStudents serviceStudents;

    public StudentController(ServiceStudents serviceStudents) {
        this.serviceStudents = serviceStudents;
    }


    @GetMapping("/getStudents")
    public List<StudentEntity> getStudents(){
        return serviceStudents.findAllStudents();
    }



}

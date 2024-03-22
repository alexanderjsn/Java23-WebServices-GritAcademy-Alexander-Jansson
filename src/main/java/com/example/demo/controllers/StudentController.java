package com.example.demo.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class StudentController {
    @GetMapping("/getStudents")
    public String getStudents(){
        return "test";

    }



}

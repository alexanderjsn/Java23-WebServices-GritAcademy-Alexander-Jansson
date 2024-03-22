package com.example.demo.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudents {

    // hämtar repository
    @Autowired
    private final StudentRepository studentRepository;

    public ServiceStudents(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll();
    }

}


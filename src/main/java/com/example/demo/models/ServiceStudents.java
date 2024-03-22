package com.example.demo.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;

@Service
public class ServiceStudents {

    // hämtar repository
    private final StudentRepository studentRepository;

    public ServiceStudents(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll();
    }

    public List<StudentEntity> searchedStudents(String query) {
    return studentRepository.findByfNameContainingIgnoreCase(query);
    }

}


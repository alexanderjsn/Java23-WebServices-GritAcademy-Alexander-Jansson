package com.example.demo.models.courses;


import com.example.demo.Course;
import com.example.demo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudents {

    // hämtar repository
    private final StudentRepository studentRepository;

    public ServiceStudents(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAllStudents() {

        return studentRepository.findAll();
    }
    public List<Student> searchAll(String query){
        return studentRepository.searchAll(query);
    }

}


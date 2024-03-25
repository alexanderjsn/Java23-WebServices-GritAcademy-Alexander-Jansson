package com.example.demo.controllers.trash;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    // hämtar repository
    @Autowired
    private final courseRepository courseRepository;

    public CourseService(com.example.demo.controllers.trash.courseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseEntity> findAllCourses() {
        return courseRepository.findAll();
    }


}


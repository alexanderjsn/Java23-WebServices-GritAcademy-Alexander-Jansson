package com.example.demo.models.courses;


import com.example.demo.models.courses.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    // hämtar repository
    @Autowired
    private final courseRepository courseRepository;

    public CourseService(com.example.demo.models.courses.courseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseEntity> findAllCourses() {
        return courseRepository.findAll();
    }

}


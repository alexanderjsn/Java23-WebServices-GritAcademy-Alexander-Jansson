package com.example.demo.models.courses;


import com.example.demo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

    public List<Course> findAllCourses() {

        return courseRepository.findAll();
    }

    public List<Course> searchCourses(@Param("query") String query) {

        return courseRepository.searchAllCourses(query);
    }


}


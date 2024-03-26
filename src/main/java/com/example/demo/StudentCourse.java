package com.example.demo;

import com.example.demo.controllers.trash.StudentEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.*;

@Entity
@Table(name = "students_courses")

@Getter
@Setter
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private StudentEntity student;
    @ManyToOne
    @JoinColumn(name = "course_id",referencedColumnName = "id")
    private Course course;
}
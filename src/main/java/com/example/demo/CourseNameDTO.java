package com.example.demo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CourseNameDTO {

    private String name;
    private String description;

    public CourseNameDTO(String name, String description){
        this.name = name;
        this.description = description;
    }
}

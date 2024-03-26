package com.example.demo;
import jakarta.persistence.Entity;
import lombok.*;


@Getter
@Setter
public class StudentNameDTO {

    private String fName;
    private String lName;

    public StudentNameDTO(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }
}

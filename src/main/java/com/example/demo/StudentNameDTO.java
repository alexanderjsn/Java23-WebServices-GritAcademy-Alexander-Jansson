package com.example.demo;
import jakarta.persistence.Entity;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
public class StudentNameDTO {

    private String fName;
    private String lName;

}

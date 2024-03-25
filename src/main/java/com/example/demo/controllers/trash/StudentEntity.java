package com.example.demo.controllers.trash;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {

    // står för id i tabell
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fname")
    private String fName;

    @Column(name = "lname")
    private String lName;
    @Column(name = "town")
    private String town;


}

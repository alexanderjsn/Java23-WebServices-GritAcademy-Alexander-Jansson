package com.example.demo.controllers.trash;


import org.springframework.stereotype.Service;

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

    // Här tar vi fram sökresultat med query som vi tar från formen. Vi använder vår metod i repositoryn för att ta fram namn
   /* public List<StudentEntity> searchfName(String query) {
        return studentRepository.findByfNameContainingIgnoreCase(query);
    }

    public List<StudentEntity> searchlName(String query){
        return studentRepository.findBylNameContainingIgnoreCase(query);
    }

    public List<StudentEntity> searchTown(String query){
        return studentRepository.findByTownContainingIgnoreCase(query);
    }*/

    public List<StudentEntity> searchAll(String query){
        return studentRepository.searchAll(query);
    }

}


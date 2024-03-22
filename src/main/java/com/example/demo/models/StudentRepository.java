package com.example.demo.models;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.StudentEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {


    // Denna lista agerar som ett SQL kommand, därav namnet på klassen. Skickar ut fName
   /* List<StudentEntity> findByfNameContainingIgnoreCase(String fName);

    List<StudentEntity> findBylNameContainingIgnoreCase(String lName);

    List<StudentEntity> findByTownContainingIgnoreCase(String town);*/


    @Query("SELECT s FROM StudentEntity s WHERE " +
            "LOWER(s.fName) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(s.lName) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(s.town) LIKE LOWER(CONCAT('%', :query, '%'))")

    List<StudentEntity> searchAll(@Param("query") String query);

}

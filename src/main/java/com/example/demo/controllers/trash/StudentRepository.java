package com.example.demo.controllers.trash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {



// söka på studenter där fname, lname eller town är query (från form) -> kvittar om det är stora eller små bokstäver
    @Query("SELECT s FROM StudentEntity s WHERE " +
            "LOWER(s.fName) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(s.lName) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(s.town) LIKE LOWER(CONCAT('%', :query, '%'))")

    List<StudentEntity> searchAll(@Param("query") String query);

}




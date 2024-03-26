package com.example.demo.models.courses;

import com.example.demo.Course;
import com.example.demo.CourseNameDTO;
import com.example.demo.StudentCourse;
import com.example.demo.StudentNameDTO;
import com.example.demo.models.courses.StudentCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class StudentsCoursesController {

    @Autowired
    private StudentCoursesService studentCoursesService;


    // Hämtar alla kurser som på student id

    // Hanterar formen
    @GetMapping("/students/by_course")
    public String showForm(Model model) {
        return "studentForm";
    }

    // Tar in data med förnamn baserat på kurs id
    @GetMapping("/students/by-course")
    public String getStudentNamesByCourseId(@RequestParam("courseId") Long courseId, Model model) {
        List<StudentNameDTO> studentNames = studentCoursesService.getStudentNamesbyCourseId(courseId);
        model.addAttribute("studentNames", studentNames);
        return "studentList";
    }

    // Tar fram studenter på kurs ID


    @GetMapping("/students/by_student")
    public String showCourseForm(Model model) {
        return "courseForm";
    }

    @GetMapping("/students/by-student")
    public String getCoursesByStudentId(@RequestParam("studentId") Long studentId, Model model) {
        List<CourseNameDTO> courses = studentCoursesService.getCoursesByStudentId(studentId);
        model.addAttribute("courses", courses);
        return "courseList";
    }


    // Tar fram student namn baserat på kurs namn

    //form
    @GetMapping("/students/by_course_name")
    public String showCourseFormbyName(Model model){

        List<StudentCourse> assocations = studentCoursesService.findAllAssociations();
        model.addAttribute("assocations", assocations);
        return "studentFormByName";
    }

    @GetMapping("/students/by-course-name")
    public String getStudentsByCourseName(@RequestParam("name") String courseName, Model model) {
        List<StudentNameDTO> studentsByName = studentCoursesService.getStudentsByCourseName(courseName);
        model.addAttribute("studentsByName", studentsByName);
        return "studentListByName";
    }



    // Få fram studentens kurser baserat på namn, efternamn och stad


    @GetMapping("/students/by_student_details")
    public String CoursesByStudentDetailsForm(){
        return "coursesByStudentDetails";
    }

    @GetMapping("/students/by-student-details")
    public String ShowCoursesByStudentDetails(@RequestParam("fName") String fName,
                                              @RequestParam("lName") String lName,
                                              @RequestParam("town") String town, Model model) {


        List<CourseNameDTO> CoursesByDetails = studentCoursesService.getCoursesByStudentDetails(fName, lName, town);
        model.addAttribute("CoursesByDetails", CoursesByDetails);
        return "studentListByDetails";
    }






    // ifall fel sker åker man tillbaka till fel sida istället
    @ExceptionHandler({NumberFormatException.class})
    public String handleNumberFormatException(Exception exception, Model model){
        model.addAttribute("error", "Only numbers");
        return "errorpage";
    }
}



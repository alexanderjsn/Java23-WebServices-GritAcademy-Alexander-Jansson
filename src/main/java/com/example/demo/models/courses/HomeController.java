package com.example.demo.models.courses;

import com.example.demo.CourseNameDTO;
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
public class HomeController {
    @GetMapping("/")
    public String homepage(){
        return "homepage";
    }
}

package com.example.jaffarShaikh.controller;
import com.example.jaffarShaikh.model.Student;
import com.example.jaffarShaikh.repository.StudentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List;


@RestController
@RequestMapping("/api/s1/student")

public class StudentController {

    @Autowired
    private StudentRepositry studentRepositry;

    @GetMapping
    public List<Student> getAllStudent () {
        return studentRepositry.findAll();
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepositry.save(student);
    }

}

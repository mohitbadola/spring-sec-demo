package com.jason.spring_sec_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(new Student(1,"Mohit","Java"),
            new Student(2,"Kaukau","Blockchain")));

    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }

}

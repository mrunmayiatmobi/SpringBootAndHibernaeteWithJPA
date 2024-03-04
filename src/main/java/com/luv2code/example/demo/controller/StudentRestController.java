package com.luv2code.example.demo.controller;

import com.luv2code.example.demo.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"xyz1","abc1","xyz1@gmail.com"));
        studentList.add(new Student(2,"xyz2","abc2","xyz2@gmail.com"));
        return studentList;
    }

    @GetMapping("/get/{ID}")
    public Student getStudentById(@PathVariable int ID){
        System.out.println("Path variable:"+ID);
        return new Student(1,"xyz1","abc1","xyz1@gmail.com");
    }
}

package com.luv2code.example.demo.controller;

import com.luv2code.example.demo.entities.Student;
import com.luv2code.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {

    @Autowired
    StudentService studentService;


    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable int id){
        System.out.println("Path variable:"+id);
        return studentService.getStudentById(id);
    }

    @PostMapping("/save")
    @ResponseBody
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }


}

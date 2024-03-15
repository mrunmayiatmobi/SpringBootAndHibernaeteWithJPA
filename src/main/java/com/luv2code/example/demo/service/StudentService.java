package com.luv2code.example.demo.service;

import com.luv2code.example.demo.entities.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public Student getStudentById(int id);

    List<Student> getAllStudent();

    void deleteStudent(int id);
}

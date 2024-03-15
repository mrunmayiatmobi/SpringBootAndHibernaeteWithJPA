package com.luv2code.example.demo.service.impl;

import com.luv2code.example.demo.dao.StudentDAO;
import com.luv2code.example.demo.entities.Student;
import com.luv2code.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO studentDAO;
    @Override
    public Student saveStudent(Student student) {

        return studentDAO.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentDAO.findById(id).get();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.findAll();
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteById(id);
    }


}

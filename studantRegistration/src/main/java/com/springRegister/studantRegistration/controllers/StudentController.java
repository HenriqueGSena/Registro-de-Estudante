package com.springRegister.studantRegistration.controllers;

import java.util.List;

import com.springRegister.studantRegistration.Service.StudentService;
import com.springRegister.studantRegistration.student.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        
        return studentService.getStudents();
    }

    @PostMapping("/registration")
    public void registerNewStudent(@RequestBody Student student) {

        studentService.addNewStudent(student);
    }
}

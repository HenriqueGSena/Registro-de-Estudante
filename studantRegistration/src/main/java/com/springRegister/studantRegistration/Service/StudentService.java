package com.springRegister.studantRegistration.Service;

import java.util.List;

import com.springRegister.studantRegistration.repository.StudentRepository;
import com.springRegister.studantRegistration.student.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        
        this.studentRepository = studentRepository;
    }
    
    public List<Student> getStudents() {
        
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {

        System.out.println(student);
    }
}

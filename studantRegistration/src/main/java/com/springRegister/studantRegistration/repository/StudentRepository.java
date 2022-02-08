package com.springRegister.studantRegistration.repository;

import com.springRegister.studantRegistration.student.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}

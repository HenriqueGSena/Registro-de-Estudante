package com.springRegister.studantRegistration.repository;

import java.util.Optional;

import com.springRegister.studantRegistration.student.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
    @Query("SELECT s FROM s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}

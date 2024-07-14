package com.demo;

import com.demo.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Define custom query methods if needed
}

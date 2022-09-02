package com.example.StudentManagementSystemBackend.repository;

import com.example.StudentManagementSystemBackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

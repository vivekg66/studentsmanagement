package com.studentmanagement.studentapp.repository;

import com.studentmanagement.studentapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

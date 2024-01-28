package com.example.Spring.repositoty;

import com.example.Spring.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {

    List<Student> findAll();

    void addStudent(Student student);
}

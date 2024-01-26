package com.example.Spring.service;

import com.example.Spring.domain.Student;
import com.example.Spring.dto.StudentDto;
import com.example.Spring.repositoty.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


//    public  Student getStudentByUserName(String studentName) {
//    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

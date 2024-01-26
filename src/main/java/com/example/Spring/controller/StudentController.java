package com.example.Spring.controller;

import com.example.Spring.domain.Student;
import com.example.Spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

//    @GetMapping("/{studentName}")
//    //URI 경로에서 특정 부분 추출
//    public Student getStudentByUserName(@PathVariable String studentName){
//        return studentService.getStudentByUserName(studentName);
//    }

}


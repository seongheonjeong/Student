package com.example.Spring.controller;

import com.example.Spring.dto.StudentDto;
import com.example.Spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/")
    public List<StudentDto> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/{studentName}")
    //URI 경로에서 특정 부분 추출
    public StudentDto getStudentByUserName(@PathVariable String StudentName){
        return StudentService.getStudentByUserName(StudentName);
    }

}


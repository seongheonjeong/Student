package com.example.Spring.controller;

import com.example.Spring.domain.Student;
import com.example.Spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Mysql에서는 id가 long형,몽고db에서는 id가 String형
@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/get")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PostMapping("/post")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
    @DeleteMapping("/delete") //DELETE 요청은 요청 바디를 가지지 않는 것이 일반적
    public void deleteStudent(@RequestParam Long id){//@RequestParam String id){
        studentService.deleteStudent(id);
    }
    @PutMapping("/put")
    public void updateStudent(@RequestParam Long id,@RequestBody Student student) {
        studentService.updateStudent(id,student);
    }
}


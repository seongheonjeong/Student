package com.example.Spring.service;

import com.example.Spring.domain.Student;
import com.example.Spring.repositoty.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
//    public void addStudent(Student student){
////        studentRepository.save(student);
//
//    }
//    public void deleteStudent(String id){
//        studentRepository.deleteById(id);
//    }
//    public void updateStudent(String id, Student student) {
//        student.setId(id);
//        studentRepository.save(student);
//    }

    @Transactional
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }
    @Transactional
    public void deleteStudent(Long id) {
        studentRepository.deleteStudent(id);
    }
    @Transactional
    public void updateStudent(Long id, Student student) {
        studentRepository.updateStudent(id,student);
    }
}

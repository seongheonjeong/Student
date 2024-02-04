package com.example.Spring.repositoty;

import com.example.Spring.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {

    List<Student> findAll();

    Student save(Student student);


    void deleteById(String id);


    //    List<Student> findAll();
//
//    void addStudent(Student student);
//
//
//    void deleteStudent(Long id);
//
//    void updateStudent(Long id, Student student);
}

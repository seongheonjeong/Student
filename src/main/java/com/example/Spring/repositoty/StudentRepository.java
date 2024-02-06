package com.example.Spring.repositoty;

import com.example.Spring.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {//extends MongoRepository<Student,String> {

//    List<Student> findAll(); //몽고 db 조회
//    Student save(Student student); //몽고 db 저장 및 업데이트
//    void deleteById(String id); //몽고 db 삭제

    List<Student> findAll(); //mysql db조회
    void addStudent(Student student); //mysql db 저장
    void deleteStudent(Long id); //mysql db 삭제
    void updateStudent(Long id, Student student); //mysql db 업데이트
}

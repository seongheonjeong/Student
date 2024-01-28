package com.example.Spring.repositoty;

import com.example.Spring.domain.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaStudentRepository implements  StudentRepository {

    private final EntityManager em;
    @Autowired
    public JpaStudentRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Student> findAll() {
        List<Student>result=em.createQuery("select s from Student s",Student.class)
                .getResultList();
        return result;
    }

    @Override
    public void addStudent(Student student) {
        em.persist(student);
    }

}

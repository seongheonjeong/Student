package com.example.Spring.repositoty;

import com.example.Spring.domain.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class JpaStudentRepository implements  StudentRepository {

    @PersistenceContext
    //스레드간에 공유 절대하면 안되기때문에 스프링이 관리해주는 방식
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

    @Override
    public void deleteStudent(Long id) {
        Student deleteStu=em.find(Student.class,id); //find는 PK만 가능
        if (deleteStu != null) {
            em.remove(deleteStu);
        }

    }

//     JPA에 따로 수정메서드는 없음
//    1. JPA에서는 트랜잭션이 끝나는 시점에 변화가 있는 모든 엔티티 객체를 데이터베이스에 자동으로 반영
//    2. 변화가 있다의 기준은 최초 조회 상태
//    3. JPA에서는 엔티티를 조회하면 해당 엔티티의 조회 상태 그대로 스냅샷 생성
//    4. 트랜잭션이 끝나는 시점에 이 스냅샷과 비교해서 다른 점이 있다면 Update Query를 데이터베이스로 전달
    @Override
    public void updateStudent(Long id, Student student) {
        Student temp=em.find(Student.class,id);
        temp.setName(student.getName());
        temp.setGrade(student.getGrade());
    }

}

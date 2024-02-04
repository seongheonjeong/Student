package com.example.Spring.domain;

//import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
//@Table(name = "student")

@Document(collection="Student")
public class Student {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 증가하는 시퀀스 사용
    private String id;
//    @Column(name = "name")
    private String name;

//    @Column(name = "phone_number")
    private String phone_number;

//    @Column(name = "studentid")
    private int studentid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getStudentId() {
        return studentid;
    }

    public void setStudentId(int studentId) {
        this.studentid = studentId;
    }
}

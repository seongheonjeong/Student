package com.example.Spring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table(name = "student")
//@Document(collection="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 아이디 자동증가
    private String id;
    @Column(name = "name")
//    @JsonProperty("name") //매핑시켜주는 어노테이션
    private String name;

    @Column(name = "phone_number")
//    @JsonProperty("phone_number")

    private String phone_number;


//    @JsonProperty("studentid")
    @Column(name = "student_id")
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

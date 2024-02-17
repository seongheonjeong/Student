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
    @Column(name = "grade")
//    @JsonProperty("grade")
    private String grade;
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
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

}

package com.example.Spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

    @Id
    private Long id;

    private String name;
    private String phone_number;
    private int studentid;
}

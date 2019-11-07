package com.example.multipledatabasesmultipleconnections.mysqljpa.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Teacher {
    @Id
    @Column(name = "teacher_id")
    private Integer teacherId;
    private String name;
    private Integer salary;
}

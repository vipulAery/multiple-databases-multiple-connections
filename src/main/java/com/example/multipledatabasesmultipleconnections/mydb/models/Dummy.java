package com.example.multipledatabasesmultipleconnections.mydb.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Dummy {
    @Id
    private Integer id;
    private String value;
}

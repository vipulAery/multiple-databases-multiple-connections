package com.example.multipledatabasesmultipleconnections.jooqdb.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    Integer id;
    String firstName;
    String lastName;
    Date dateOfBirth;
    Integer yearOfBirth;
    String address;
}

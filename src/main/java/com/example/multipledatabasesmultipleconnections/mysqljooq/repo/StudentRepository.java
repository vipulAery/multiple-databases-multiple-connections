package com.example.multipledatabasesmultipleconnections.mysqljooq.repo;

import com.example.multipledatabasesmultipleconnections.jooqdb.models.Author;
import com.example.multipledatabasesmultipleconnections.mysqljooq.models.Student;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.Author.AUTHOR;
import static com.example.multipledatabasesmultipleconnections.jooq.mysqljooq.mysqljooq.Tables.STUDENT;
import static org.jooq.impl.DSL.selectFrom;

@Service
public class StudentRepository {
    @Autowired
    DSLContext mysqljooqDslContext;

    public List<Student> findAll(){
        return mysqljooqDslContext.selectFrom(STUDENT).fetchInto(Student.class);
    }
}

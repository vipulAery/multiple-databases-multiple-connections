package com.example.multipledatabasesmultipleconnections.jooqdb.repo;


import com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.records.AuthorRecord;
import com.example.multipledatabasesmultipleconnections.jooqdb.models.Author;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import static com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.Author.AUTHOR;
import static org.jooq.impl.DSL.selectFrom;

@Service
public class AuthorRepository {
    @Autowired
    DSLContext jooqdbDslContext;

    public List<Author> findAll(){
        String query = selectFrom(AUTHOR).getSQL();
        System.out.println(query);
        List<Author> authors = jooqdbDslContext.selectFrom(AUTHOR).fetchInto(Author.class);
        return authors;
    }

}

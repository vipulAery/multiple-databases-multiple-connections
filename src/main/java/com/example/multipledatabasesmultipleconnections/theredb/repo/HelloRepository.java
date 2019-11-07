package com.example.multipledatabasesmultipleconnections.theredb.repo;


import com.example.multipledatabasesmultipleconnections.jooqdb.models.Author;
import com.example.multipledatabasesmultipleconnections.theredb.model.Hello;
import org.jooq.DSLContext;
import org.jooq.UniqueKey;
import org.jooq.impl.DAOImpl;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Immutable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.Author.AUTHOR;
import static com.example.multipledatabasesmultipleconnections.jooq.db.public_.tables.Book.BOOK;
import static com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.Tables.HELLO;
import static org.jooq.impl.DSL.selectFrom;

@Service
public class HelloRepository {
    @Autowired
    DSLContext theredbDslContext;

    public List<Hello> findAllHello(){
        return theredbDslContext.selectFrom(HELLO).fetchInto(Hello.class);
    }

}

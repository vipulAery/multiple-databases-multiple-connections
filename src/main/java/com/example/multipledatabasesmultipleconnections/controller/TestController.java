package com.example.multipledatabasesmultipleconnections.controller;

import com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.tables.records.HelloRecord;
import com.example.multipledatabasesmultipleconnections.jooqdb.models.Author;
import com.example.multipledatabasesmultipleconnections.jooqdb.repo.AuthorRepository;
import com.example.multipledatabasesmultipleconnections.mydb.models.Dummy;
import com.example.multipledatabasesmultipleconnections.mydb.repo.DummyRepository;
import com.example.multipledatabasesmultipleconnections.mysqljooq.models.Student;
import com.example.multipledatabasesmultipleconnections.mysqljooq.repo.StudentRepository;
import com.example.multipledatabasesmultipleconnections.mysqljpa.models.Teacher;
import com.example.multipledatabasesmultipleconnections.mysqljpa.repo.TeacherRepository;
import com.example.multipledatabasesmultipleconnections.theredb.model.Hello;
import com.example.multipledatabasesmultipleconnections.theredb.repo.HelloRepository;
import com.example.multipledatabasesmultipleconnections.yourdb.models.Book;
import com.example.multipledatabasesmultipleconnections.yourdb.repo.BookRepository;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.multipledatabasesmultipleconnections.jooq.theredb.public_.tables.records.*;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    DummyRepository dummyRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    HelloRepository helloRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping("/getAllDummy")
    public List<Dummy> getAllDummy(){
        return dummyRepository.findAll();
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/getAllAuthors")
    public List<Author> getAllAuthor(){
        return authorRepository.findAll();
    }

    @GetMapping("/getAllHello")
    public List<Hello> getAllHello(){
        return helloRepository.findAllHello();
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/getAllTeachers")
    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

}

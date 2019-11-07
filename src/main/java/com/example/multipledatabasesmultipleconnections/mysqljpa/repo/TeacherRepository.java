package com.example.multipledatabasesmultipleconnections.mysqljpa.repo;

import com.example.multipledatabasesmultipleconnections.mysqljpa.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}

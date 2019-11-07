package com.example.multipledatabasesmultipleconnections.mydb.repo;

import com.example.multipledatabasesmultipleconnections.mydb.models.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Integer> {
}

package com.Tpspring.TP2.Repository;

import com.Tpspring.TP2.Modele.Student;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    Student findById(Long id);
    List<Student> findAll();
}

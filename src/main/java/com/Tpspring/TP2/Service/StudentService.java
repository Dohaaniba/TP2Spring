package com.Tpspring.TP2.Service;

import com.Tpspring.TP2.Modele.Student;

public interface StudentService {
    void createStudent(Student student);
    Student findStudentById(Long id);
    void displayAllStudents();
}

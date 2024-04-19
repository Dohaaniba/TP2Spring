package com.Tpspring.TP2.Service;

import com.Tpspring.TP2.Modele.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService {

    private List<Student> students = new ArrayList<>();



    @Override
    public void createStudent(Student student) {
        students.add(student);
        System.out.println("eleve enregistrée: " + student);

    }

    @Override
    public Student findStudentById(Long id) {

        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void displayAllStudents() {
        System.out.println("Afficher tous les etudiants:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


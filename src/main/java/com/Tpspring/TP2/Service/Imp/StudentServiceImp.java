package com.Tpspring.TP2.Service.Imp;

import com.Tpspring.TP2.Modele.Student;
import com.Tpspring.TP2.Repository.StudentRepository;
import com.Tpspring.TP2.Service.StudentService;

import java.util.List;

public class StudentServiceImp implements StudentService {
    private final StudentRepository studentRepository;



    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void displayAllStudents() {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


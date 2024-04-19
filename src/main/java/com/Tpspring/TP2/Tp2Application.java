package com.Tpspring.TP2;

import com.Tpspring.TP2.Modele.Student;
import com.Tpspring.TP2.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Tp2Application.class, args);
		StudentService studentService = context.getBean(StudentService.class);

		// Utilisation des méthodes du service
		studentService.createStudent(new Student(1L, "Doha", "ANIBA"));
		studentService.createStudent(new Student(2L, "Khaadija", "ALAMI"));
		studentService.displayAllStudents();
	}

}

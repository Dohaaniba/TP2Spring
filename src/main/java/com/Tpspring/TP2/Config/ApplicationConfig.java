package com.Tpspring.TP2.Config;

import com.Tpspring.TP2.Repository.Imp.InMemoryStudentRepository;
import com.Tpspring.TP2.Repository.StudentRepository;
import com.Tpspring.TP2.Service.Imp.StudentServiceImp;
import com.Tpspring.TP2.Service.StudentService;
import com.Tpspring.TP2.Service.StudentServiceMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImp(studentRepository);
    }

    @Bean
    public StudentService studentServiceMock() {
        return new StudentServiceMock();
    }

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }
}

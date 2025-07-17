package com.example.demo.student;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student mariam = new Student(
                    "mariam",
                    LocalDate.of(2000, Month.JANUARY, 12),
                    "1234@email.com"
            );
            Student alex = new Student(
                    "Alex",
                    LocalDate.of(2001, Month.JANUARY, 12),
                    "12al@email.com"
            );
            repository.saveAll(
                    List.of(mariam, alex)
            );

        };
    }
}

package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "marium",
                        23,
                        LocalDate.of(2000, 2, 12),
                        "1234@email.com"
                )
        );
    }

}

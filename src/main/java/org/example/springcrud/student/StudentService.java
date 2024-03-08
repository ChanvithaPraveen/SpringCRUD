package org.example.springcrud.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L, "James", "Smith",LocalDate.of(1998, Month.APRIL, 17), 26));
    }
}

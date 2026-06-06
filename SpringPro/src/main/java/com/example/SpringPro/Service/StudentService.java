package com.example.SpringPro.Service;

import com.example.SpringPro.Entity.Student;
import com.example.SpringPro.Repositry.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

}

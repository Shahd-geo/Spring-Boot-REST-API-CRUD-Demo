package com.example.SpringPro.Service;

import com.example.SpringPro.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public Student addStudent(Student student){
        return student;
    }

        public List<Student> addListStudent(List<Student> students){
            return students;
        }
}
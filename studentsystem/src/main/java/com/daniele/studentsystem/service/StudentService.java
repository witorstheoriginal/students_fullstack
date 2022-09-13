package com.daniele.studentsystem.service;

import com.daniele.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();


}

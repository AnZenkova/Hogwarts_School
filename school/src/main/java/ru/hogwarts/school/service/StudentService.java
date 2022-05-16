package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Student;

import java.util.List;
import java.util.Set;

public interface StudentService {

    Student createStudent(Student student);

    Student findStudent(Long id);

    Student editStudent(Student student);

    void deleteStudent(Long id);

    List<Student> getAll();

    Set<Student> filterStudent(int age);
}
package com.loginapp.student.dao;

import com.loginapp.student.entities.Student;
import com.loginapp.util.dao.DAO;

import java.util.List;

public interface StudentDAO extends DAO {
    long insertStudent(Student student);
    boolean updateStudent(Student student);
    boolean deleteStudent(Student student);

    Student findStudentById(int ID);
    List<Student> findAll();
}

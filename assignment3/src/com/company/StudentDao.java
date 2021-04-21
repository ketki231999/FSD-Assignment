package com.company;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {

    void addStudent (Student student) throws SQLException;
    void updateStudent(Student student) throws SQLException;
    void deleteStudent(String mailid) throws SQLException;
    Student getStudentByroll_no(int roll) throws SQLException;
    List<Student> getStudent() throws SQLException;
}

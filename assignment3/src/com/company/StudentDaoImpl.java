package com.company;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private static Statement statement = null;
    private Connection conn;

    public StudentDaoImpl() throws SQLException {
        conn = ConnectionFactory.getConnection();
        statement = conn.createStatement();
    }


                @Override
                public void addStudent(Student student) throws SQLException {
                    String sql = "insert into student values ('"+ student.getName() +"', " + student.getRoll_no() +", '"+ student.getMailid() +"', '"+student.getDept()+"')";
                    int count = 0;
//                    Statement statement = null;
                    count = statement.executeUpdate(sql);

                    if(count>0){
                        System.out.println("Employee Saved");
                    }else{
                        System.out.println("Not Completed");
                    }




                }

                @Override
                public void updateStudent(Student student) throws SQLException {
                    String sql = "update student set name='"+student.getName()+"', email='"+student.getMailid()+"' where roll_no="+ student.getRoll_no();
                    int count = 0;
                    count = statement.executeUpdate(sql);

                    if (count > 0) {
                        System.out.println("student data saved");
                    } else {
                        System.out.println("Not saved");
                    }

                }

                @Override
                public void deleteStudent(String mailid) throws SQLException {
                    String sql = "delete from student where mailid= "+ mailid;
                    int count = 0;
                    count = statement.executeUpdate(sql);

                    if (count > 0) {
                        System.out.println("data saved");
                    } else {
                        System.out.println("Not saved");
                    }


                }

                @Override
                public Student getStudentByroll_no(int roll) throws SQLException {

                    Student student = null;
                    String sql = "select * from employee where roll_no = "+ roll;
                    ResultSet rs = statement.executeQuery(sql);
                    if(rs.next()){

                        String name = rs.getString("name");
                        int roll_no = rs.getInt("roll_no");
                        String mailid = rs.getString("mailid");
                        String dept = rs.getString("dept");
                        student = new Student(name, roll_no, mailid,dept);
                    }
                    return student;

                }

                @Override
                public List<Student> getStudent() throws SQLException {

        List<Student> list = new ArrayList<>();
        String sql = "select * from student";
                    ResultSet rs = statement.executeQuery(sql);
                    while(rs.next()){
                        String name= rs.getString("name");
                        int roll_no = rs.getInt("roll_no");
                        String mailid = rs.getString("mailid");
                        String dept = rs.getString("dept");
                        Student student = new Student(name,roll_no,mailid,dept);
                        list.add(student);
                    }
                    return list;
                }
            }
//        return dao;
//    }
//}

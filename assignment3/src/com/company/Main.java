package com.company;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        StudentDao dao = StudentDaoFactory.getStudentDao();
        System.out.println("Please select any one options");
        System.out.println("**************");
        System.out.println("Press 1: Insert");
        System.out.println("Press 2: Update");
        System.out.println("Press 3: Delete");
        System.out.println("Press 4: Get");
        System.out.println("**************");

        int option = scanner.nextInt();
        switch (option){
            case 1: {
                insert();
                break;
            }
            case 2: {
                update();
                break;
            }
            case 3: {
                delete();
                break;
            }
            case 4: {
                get();
                break;
            }
            default: {
                System.out.println("Incorrect options");
            }
        }
        // write your code here
//        StudentDao dao = StudentDaoFactory.getStudentDao();
//        Student student = new Student("softy",37, "ss@gmail.com","AI");
//        dao.addStudent(student);


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Name: ");
//        String name = scanner.next();
//
//        System.out.print("Enter roll_no: ");
//        int roll_no = scanner.nextInt();
//
//        System.out.print("Enter Email: ");
//        String mailid = scanner.next();
//
//
//        System.out.print("Enter department: ");
//        String dept = scanner.next();
//
//        Student student = new Student(name,roll_no,mailid,dept);
//        StudentDao dao = StudentDaoFactory.getStudentDao();
//        dao.addStudent(student);
        List<Student> list =  dao.getStudent();
        for (Student std:list) {
            System.out.println(std.toString());
        }
    }
    private static void insert(){

    }

    private static void update(){

    }

    private static void delete(){

    }

        private static void get () throws SQLException {

            StudentDao dao = StudentDaoFactory.getStudentDao();
            List<Student> list = dao.getStudent();
            for (Student std : list) {
                System.out.println(std.toString());
            }
        }
    }

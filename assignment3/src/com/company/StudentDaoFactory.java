package com.company;

import java.awt.color.ICC_ColorSpace;
import java.sql.SQLException;

public class StudentDaoFactory {
    private static StudentDao dao;

    public static StudentDao getStudentDao() throws SQLException {
        if (dao == null) {

            dao = (StudentDao) new StudentDaoImpl();
        }
        return dao;

        }
    }

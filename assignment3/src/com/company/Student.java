package com.company;

public class Student {

    private String name;
    private int roll_no;
    private String MailId;
    private String Dept;




    public Student(){

    }

    public Student(String name, int roll_no, String MailId, String Dept) {
        this.name = name;
        this.roll_no = roll_no;
        this.MailId= MailId;
        this.Dept=Dept;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getMailid() {
        return MailId;
    }

    public void setMailId(String mailid) {
        this.MailId = mailid;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        this.Dept = dept;
    }
//
@Override
public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", roll_no=" + roll_no +
            ", MailId='" + MailId + '\'' +
            ", Dept='" + Dept + '\'' +
            '}';
}


}



package com.example.demo;

public class UserPoJo {
    private int idstudent;
    private String studentname;
    private String studentgender;
    @Override
    public String toString() {
        return "UserPoJo [idstudent=" + idstudent + ", studentname=" + studentname + ", studentgender=" + studentgender
                + "]";
    }
    public int getIdstudent() {
        return idstudent;
    }
    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public String getStudentgender() {
        return studentgender;
    }
    public void setStudentgender(String studentgender) {
        this.studentgender = studentgender;
    }
}

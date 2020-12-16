package com.example.mynotes.dao.domain;

public class Student {
    private Integer student_id;
    private String student_name;
    private Integer student_sid;
    private String student_pwd;
    private Integer student_class;


    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Integer getStudent_sid() {
        return student_sid;
    }

    public void setStudent_sid(Integer student_sid) {
        this.student_sid = student_sid;
    }

    public String getStudent_pwd() {
        return student_pwd;
    }

    public void setStudent_pwd(String student_pwd) {
        this.student_pwd = student_pwd;
    }

    public Integer getStudent_class() {
        return student_class;
    }

    public void setStudent_class(Integer student_class) {
        this.student_class = student_class;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_sid=" + student_sid +
                ", student_pwd='" + student_pwd + '\'' +
                ", student_class=" + student_class +
                '}';
    }
}

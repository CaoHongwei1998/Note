package com.example.mynotes.dao.domain;

public class Teacher {

    private Integer teacher_id;
    private String teacher_name;
    private Integer teacher_jnum;
    private String teacher_pwd;
    private Integer teacher_class;

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public Integer getTeacher_jnum() {
        return teacher_jnum;
    }

    public void setTeacher_jnum(Integer teacher_jnum) {
        this.teacher_jnum = teacher_jnum;
    }

    public String getTeacher_pwd() {
        return teacher_pwd;
    }

    public void setTeacher_pwd(String teacher_pwd) {
        this.teacher_pwd = teacher_pwd;
    }

    public Integer getTeacher_class() {
        return teacher_class;
    }

    public void setTeacher_class(Integer teacher_class) {
        this.teacher_class = teacher_class;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", teacher_name='" + teacher_name + '\'' +
                ", teacher_jnum=" + teacher_jnum +
                ", teacher_pwd='" + teacher_pwd + '\'' +
                ", teacher_class=" + teacher_class +
                '}';
    }
}

package com.example.mynotes.service;

import com.example.mynotes.dao.domain.Teacher;

public interface TeacherService {
    //教师注册 0 失败
    public int teacherRegister(Teacher teacher);

    //教师登录
    public Teacher teacherLogin(Teacher teacher);

    //查询教师
    public Teacher findTeacherById(int teacher_id);

    //根据jnum查询
    public Teacher findTeacherByJnum(int teacher_jnum);

}

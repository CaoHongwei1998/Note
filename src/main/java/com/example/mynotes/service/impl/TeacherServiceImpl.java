package com.example.mynotes.service.impl;

import com.example.mynotes.dao.domain.Teacher;
import com.example.mynotes.dao.mapper.TeacherMapper;
import com.example.mynotes.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    //注册
    @Override
    public int teacherRegister(Teacher teacher) {
        int line = teacherMapper.teacherRegister(teacher);
        return line;
    }

    //登录
    @Override
    public Teacher teacherLogin(Teacher teacher) {
        Teacher t = teacherMapper.teacherLogin(teacher);
        return t;
    }
    @Override
    public Teacher findTeacherById(int teacher_id) {
        return teacherMapper.findTeacherById(teacher_id);
    }

    @Override
    public Teacher findTeacherByJnum(int teacher_jnum) {
        return teacherMapper.findTeacherByJnum(teacher_jnum);
    }
}

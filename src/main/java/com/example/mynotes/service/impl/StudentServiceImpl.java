package com.example.mynotes.service.impl;

import com.example.mynotes.dao.domain.Student;
import com.example.mynotes.dao.mapper.StudentMapper;
import com.example.mynotes.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    //注册
    @Override
    public int stuRegister(Student student) {
        int line = studentMapper.stuRegister(student);
        return line;
    }

    //登录
    @Override
    public Student stuLogin(Student student) {
        Student stu = studentMapper.stuLogin(student);
        return stu;
    }

    @Override
    public Student findStudentById(int student_id) {
        Student stu = studentMapper.findStudentById(student_id);
        return stu;
    }

    @Override
    public Student findStudentBySid(int student_sid) {
        return studentMapper.findStudentBySid(student_sid);
    }


}

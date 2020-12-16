package com.example.mynotes.dao.mapper;


import com.example.mynotes.dao.domain.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentMapper {
    //学生注册 0 失败
    public int stuRegister(Student student);

    //学生登录
    public Student stuLogin(Student student);

    //根据id查询
    public Student findStudentById(int student_id);

    //根据学号查询
    public Student findStudentBySid(int student_sid);




}

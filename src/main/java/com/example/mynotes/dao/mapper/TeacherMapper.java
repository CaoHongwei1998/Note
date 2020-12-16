package com.example.mynotes.dao.mapper;

import com.example.mynotes.dao.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TeacherMapper {


    //教师注册 0 失败
    public int teacherRegister(Teacher teacher);

    //教师登录
    public Teacher teacherLogin(Teacher teacher);

    //根据id查询
    public Teacher findTeacherById(int teacher_id);

    //根据jnum查询
    public Teacher findTeacherByJnum(int teacher_jnum);


}

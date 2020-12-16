package com.example.mynotes;


import com.example.mynotes.dao.domain.Teacher;
import com.example.mynotes.dao.mapper.TeacherMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MynotesApplication.class)
public class TeacherTest {

    @Autowired
    private TeacherMapper teacherMapper;



    @Test
    public void testLogin(){
        Teacher teacher=new Teacher();
        teacher.setTeacher_jnum(6001);
        teacher.setTeacher_pwd("123");

        Teacher t= teacherMapper.teacherLogin(teacher);
        System.out.println(t);
    }

    @Test
    public void testRegister(){
        Teacher teacher=new Teacher();
        teacher.setTeacher_name("老刘");
        teacher.setTeacher_jnum(6003);
        teacher.setTeacher_pwd("123");
        teacher.setTeacher_class(22);

        int line=teacherMapper.teacherRegister(teacher);
        System.out.println("line:"+line);
    }

    @Test
    public void testfindTeacherById(){

        Teacher t=teacherMapper.findTeacherById(1);
        System.out.println(t);
    }

}

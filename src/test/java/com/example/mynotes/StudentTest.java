package com.example.mynotes;


import com.example.mynotes.dao.domain.Student;
import com.example.mynotes.dao.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MynotesApplication.class)
public class StudentTest {

    @Autowired
    private StudentMapper studentMapper;



    @Test
    public void testLogin(){
        Student student=new Student();
        student.setStudent_sid(1001);
        student.setStudent_pwd("123");

        Student stu= studentMapper.stuLogin(student);
        System.out.println(stu);

    }

    @Test
    public void testRegister(){
        Student student=new Student();
        student.setStudent_name("狗蛋");
        student.setStudent_sid(1006);
        student.setStudent_pwd("123");
        student.setStudent_class(22);

        int line=studentMapper.stuRegister(student);
        System.out.println("line:"+line);
    }

    @Test
    public void testfindStudentById(){

        Student s=studentMapper.findStudentById(1);
        System.out.println(s);
    }

}

package com.example.mynotes.web;


import com.example.mynotes.dao.domain.Student;
import com.example.mynotes.dao.domain.Teacher;
import com.example.mynotes.dao.domain.User;
import com.example.mynotes.service.StudentService;
import com.example.mynotes.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;


    @RequestMapping("/login")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Object userLogin(@RequestBody User user){
        //Student stu = studentService.stuLogin(student);
        if (user.getUserid()<6000){//学生
            Student student = new Student();
            student.setStudent_sid(user.getUserid());
            student.setStudent_pwd(user.getPassword());
            System.out.println("查询中...");
            return studentService.stuLogin(student);
        }else{//老师
            Teacher teacher=new Teacher();
            teacher.setTeacher_jnum(user.getUserid());
            teacher.setTeacher_pwd(user.getPassword());
            System.out.println("查询中...");
            return teacherService.teacherLogin(teacher);
        }
    }

}

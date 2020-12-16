package com.example.mynotes.web;


import com.example.mynotes.dao.domain.Student;
import com.example.mynotes.dao.domain.Teacher;
import com.example.mynotes.dao.domain.User;
import com.example.mynotes.service.StudentService;
import com.example.mynotes.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;


    @RequestMapping("/register")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Object userLogin(@RequestBody User user){
        //Student stu = studentService.stuLogin(student);
        if (user.getUserid()<6000){//学生
            Student student = new Student();
            student.setStudent_name(user.getUsername());
            student.setStudent_sid(user.getUserid());
            student.setStudent_pwd(user.getPassword());
            student.setStudent_class(user.getUserclass());
            System.out.println("注册中...");
            return studentService.stuRegister(student);
        }else{//老师
            Teacher teacher=new Teacher();
            teacher.setTeacher_name(user.getUsername());
            teacher.setTeacher_jnum(user.getUserid());
            teacher.setTeacher_pwd(user.getPassword());
            teacher.setTeacher_class(user.getUserclass());
            System.out.println("注册中...");
            return teacherService.teacherRegister(teacher);
        }
    }

    @GetMapping("/check/{value}")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Object checkId(@PathVariable("value") String value){
        int id=Integer.parseInt(value);
        Student s=studentService.findStudentBySid(id);
        Teacher t=teacherService.findTeacherByJnum(id);
        if (s!=null || t!=null){
            return 0;
        }
        return 1;
    }

}

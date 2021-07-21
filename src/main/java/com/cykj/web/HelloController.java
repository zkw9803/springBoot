package com.cykj.web;

import com.cykj.bean.Student;
import com.cykj.sevice.StuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version 1.0
 * @author: xiaozheng
 * @date: 2021/7/12 15:57
 * @desc:
 */
@Controller
@RequestMapping("/admin")
public class HelloController {
@Autowired
private StuServiceImpl stuService;

    Student student=new Student();
    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        System.out.println("springMVC我来了");
        return "HelloWorld zkw";
    }
    @RequestMapping("/getLog")
    public @ResponseBody String getLog(String username,String password){
        System.out.println(username);
        System.out.println(password);
        student.setUsername(username);
        student.setPassword(password);
        List<Student>students=stuService.checkLog(student);
        if (!students.isEmpty()){
            System.out.println("登录成功");
            return "1";
        }else {
            System.out.println("登录失败");
            return "0";
        }
    }
    @RequestMapping("/getReg")
    public @ResponseBody String getReg(String username,String password){
        System.out.println(username);
        System.out.println(password);

        student.setUsername(username);
        student.setPassword(password);
        int i=stuService.checkReg(student);
        if (i==1){
            System.out.println("注册成功");
            return "1";
        }else {
            return "0";
        }
    }
    @RequestMapping("/getAdm")
    public @ResponseBody String getAdm(String username,String password){
        System.out.println(username);
        System.out.println(password);
        if (username.equals("admin")&&password.equals("12345")){
            System.out.println("登录成功");
            return "1";
        }else {
            System.out.println("登录失败");
            return "0";
        }
    }
    @RequestMapping("/getTable")
    public List getTable(){
        List list=stuService.stuSe();
        return list;
    }
    @ResponseBody
    @PostMapping("/getHello4")
    public String getHello4(String username,String password){
        System.out.println(username);
        System.out.println(password);
        Student student = new Student();
        student.setUsername(username);
        student.setPassword(password);
        List students =stuService.checkLog(student);
        System.out.println(students);
        return "11111";
    }
}

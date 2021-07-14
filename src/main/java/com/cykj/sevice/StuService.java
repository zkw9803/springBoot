package com.cykj.sevice;


import com.cykj.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: xiaozheng
 * @date: 2021/6/11 11:07
 * @desc:
 */
public interface StuService {
    //    注册
    int checkReg(Student student);
    //登录
    List<Student> checkLog(Student student);
    //查询
    ArrayList<Student> stuSe();
}

package com.cykj.mapper;

import com.cykj.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: xiaozheng
 * @date: 2021/6/11 13:59
 * @desc:
 */
@Repository
public interface StudentMapper {
//    注册
    int checkReg(Student student);
    //登录
    List<Student> checkLog(Student student);
    //查询
    ArrayList<Student> stuSe();
}

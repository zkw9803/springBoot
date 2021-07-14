package com.cykj.sevice;

import com.cykj.bean.Student;
import com.cykj.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: xiaozheng
 * @date: 2021/6/11 11:08
 * @desc:
 */
@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StudentMapper studentMapper;

//注册
    @Override
    public int checkReg(Student student) {
        int i=studentMapper.checkReg(student);
        return i;
    }
//登录
    @Override
    public List<Student> checkLog(Student student) {
        List<Student>students=studentMapper.checkLog(student);
        return students;
    }
//查询
    @Override
    public ArrayList<Student> stuSe() {
        ArrayList<Student>sse=studentMapper.stuSe();
        return sse;
    }


}

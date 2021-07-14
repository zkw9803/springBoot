package com.cykj.bean;

/**
 * @version 1.0
 * @author: xiaozheng
 * @date: 2021/7/8 17:08
 * @desc:
 */
public class Student {
    private  String id;
    private  String username;
    private  String password;
    private  String power;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}

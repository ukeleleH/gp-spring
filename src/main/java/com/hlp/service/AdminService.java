package com.hlp.service;

import com.hlp.pojo.Admin;
import com.hlp.pojo.Student;

import java.util.List;

public interface AdminService {
    //  登录
    Admin login(Admin admin);

    // 查询所有学生
    List<Student> selectAllStudent();
}

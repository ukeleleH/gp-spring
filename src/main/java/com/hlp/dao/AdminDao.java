package com.hlp.dao;

import com.hlp.pojo.Admin;
import com.hlp.pojo.Student;

import java.util.List;

public interface AdminDao {
    // 管理员登录
    Admin login(Admin admin);
    // 查询所有学生
    List<Student> selectAllStudent();
}

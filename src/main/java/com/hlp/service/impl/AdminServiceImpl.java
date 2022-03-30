package com.hlp.service.impl;

import com.hlp.dao.AdminDao;
import com.hlp.pojo.Admin;
import com.hlp.pojo.Student;
import com.hlp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin login(Admin admin) {
        return adminDao.login(admin);
    }

    @Override
    public List<Student> selectAllStudent() {
        return adminDao.selectAllStudent();
    }
}

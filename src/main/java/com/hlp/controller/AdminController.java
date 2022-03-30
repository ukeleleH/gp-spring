package com.hlp.controller;

import com.hlp.pojo.Admin;
import com.hlp.pojo.Student;
import com.hlp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("adminController")
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // 登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Admin login(@RequestBody Admin admin){
        return adminService.login(admin);
    }

    // 查询所有学生
    @RequestMapping("/selectAllStudent")
    @ResponseBody
    public List<Student> selectAllStudent(){
        return adminService.selectAllStudent();
    }

}

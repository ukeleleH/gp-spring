package com.hlp.controller;

import com.hlp.pojo.*;
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
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Admin login(@RequestBody LoginForm loginForm) {
        return adminService.login(loginForm);
    }

    // 查询所有学生
    @RequestMapping("/selectAllStudent")
    @ResponseBody
    public List<Student> selectAllStudent() {
        return adminService.selectAllStudent();
    }

    // 查询所有导师
    @RequestMapping("/selectAllTutor")
    @ResponseBody
    public List<Tutor> selectAllTutor() {
        return adminService.selectAllTutor();
    }

    //  新增学生信息时查询学号是否唯一
    @RequestMapping("/isUniqueStudentId")
    @ResponseBody
    public Student selectIsUniqueStudentId(long sno) {
        return adminService.selectIsUniqueStudentId(sno);
    }

    //  删除学生信息
    @RequestMapping("/deleteStudent")
    @ResponseBody
    public int deleteStudent(int id) {
        return adminService.deleteStudent(id);
    }

    //  新增学生信息
    @RequestMapping("/addStudent")
    @ResponseBody
    public int addStudent(@RequestBody Student student) {
        return adminService.addStudent(student);
    }

    //  修改学生信息
    @RequestMapping("/changeStudent")
    @ResponseBody
    public int changeStudent(@RequestBody Student student) {
        return adminService.changeStudent(student);
    }

    //  新增导师信息时查询工号是否唯一
    @RequestMapping("/isUniqueTutorId")
    @ResponseBody
    public Tutor selectIsUniqueTutorId(long tno) {
        return adminService.selectIsUniqueTutorId(tno);
    }

    //  删除导师信息
    @RequestMapping("/deleteTutor")
    @ResponseBody
    public int deleteTutor(int id) {
        return adminService.deleteTutor(id);
    }

    //  新增导师信息
    @RequestMapping("/addTutor")
    @ResponseBody
    public int addTutor(@RequestBody Tutor tutor) {
        return adminService.addTutor(tutor);
    }

    //  修改导师信息
    @RequestMapping("/changeTutor")
    @ResponseBody
    public int changeTutor(@RequestBody Tutor tutor) {
        return adminService.changeTutor(tutor);
    }

    //  新增公告
    @RequestMapping("/addNotice")
    @ResponseBody
    public int addNotice(@RequestBody Notice notice) {
        return adminService.addNotice(notice);
    }

    //  修改公告
    @RequestMapping("/changeNotice")
    @ResponseBody
    public int updateNotice(@RequestBody Notice notice) {
        return adminService.updateNotice(notice);
    }

    //  删除公告
    @RequestMapping("/deleteNotice")
    @ResponseBody
    public int deleteNotice(int id) {
        return adminService.deleteNotice(id);
    }

    //  新增专业
    @RequestMapping("/addMajor")
    @ResponseBody
    public int addMajor(@RequestBody Major major) {
        return adminService.addMajor(major);
    }

    //  修改专业
    @RequestMapping("/changeMajor")
    @ResponseBody
    public int updateMajor(@RequestBody Major major) {
        return adminService.updateMajor(major);
    }

    //  删除专业
    @RequestMapping("/deleteMajor")
    @ResponseBody
    public int deleteMajor(int id) {
        return adminService.deleteMajor(id);
    }
}

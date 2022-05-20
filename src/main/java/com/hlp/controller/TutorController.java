package com.hlp.controller;

import com.hlp.pojo.LoginForm;
import com.hlp.pojo.OpeningReport;
import com.hlp.pojo.Project;
import com.hlp.pojo.Tutor;
import com.hlp.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/tutor")
@Controller
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    // 登录
    public Tutor login(@RequestBody LoginForm loginForm) {
        return tutorService.login(loginForm);
    }

    // 修改个人基本信息
    @RequestMapping(value = "/changeProfile", method = RequestMethod.POST)
    @ResponseBody
    public int changeProfile(@RequestBody Tutor tutor) {
        return tutorService.changeProfile(tutor);
    }

    // 修改密码
    @RequestMapping("/changePassword")
    @ResponseBody
    public int changePassword(LoginForm loginForm) {
        return tutorService.changePassword(loginForm);
    }

    // 查询我发布的课题
    @RequestMapping("/myPublishProject")
    @ResponseBody
    public List<Project> queryMyPublishProject(long tutorId) {
        return tutorService.queryMyPublishProject(tutorId);
    }

    // 修改课题信息
    @RequestMapping(value = "/changeProjectInfo", method = RequestMethod.POST)
    @ResponseBody
    public int changeProjectInfo(@RequestBody Project project) {
        return tutorService.changeProjectInfo(project);
    }

    // 发布新课题
    @RequestMapping(value = "/publishNewProject", method = RequestMethod.POST)
    @ResponseBody
    public int publishNewProject(@RequestBody Project project) {
        return tutorService.publishNewProject(project);
    }

    // 新增选题时，查询课题名称是否唯一
    @RequestMapping("/isUniqueProjectName")
    @ResponseBody
    public Project queryIsUniqueProjectName(String name) {
        return tutorService.queryIsUniqueProjectName(name);
    }

    // 删除课题
    @RequestMapping("/deleteProject")
    @ResponseBody
    public int deleteProject(int id) {
        return tutorService.deleteProject(id);
    }

    // 查询选择我的课题的所有学生的学号和姓名
    @RequestMapping("/searchStudentSnoName")
    @ResponseBody
    public List<HashMap> searchStudentSnoName(long tno) {
        return tutorService.searchStudentSnoName(tno);
    }

    // 获取我的学生上传的所有开题报告
    @RequestMapping("/searchAllReport")
    @ResponseBody
    public List<OpeningReport> searchAllReport(long tno) {
        return tutorService.searchAllReport(tno);
    }

    // 根据学号查询某个学生的开题报告
    @RequestMapping("/getReportBySno")
    @ResponseBody
    public List<OpeningReport> getReportBySno(long sno) {
        return tutorService.getReportBySno(sno);
    }

    // 点评开题报告(即更新)
    @RequestMapping("/updateOpeningReport")
    @ResponseBody
    public int updateOpeningReport(@RequestBody HashMap map) {
        return tutorService.updateOpeningReport(map);
    }

}

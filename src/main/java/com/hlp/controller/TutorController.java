package com.hlp.controller;

import com.hlp.pojo.Project;
import com.hlp.pojo.Tutor;
import com.hlp.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/tutor")
@Controller
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    // 登录
    public Tutor login(@RequestBody Tutor tutor) {
        return tutorService.login(tutor);
    }

    // 修改密码
    @RequestMapping("/changePassword")
    @ResponseBody
    public int changePassword(Tutor tutor) {
        return tutorService.changePassword(tutor);
    }

    // 查询我发布的课题
    @RequestMapping("/myPublishProject")
    @ResponseBody
    public List<Project> queryMyPublishProject(long id) {
        return tutorService.queryMyPublishProject(id);
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
    public Project queryIsUniqueProjectName(String name){
        return tutorService.queryIsUniqueProjectName(name);
    }

    // 删除课题
    @RequestMapping("/deleteProject")
    @ResponseBody
    public int deleteProject(int id) {
        return tutorService.deleteProject(id);
    }
}

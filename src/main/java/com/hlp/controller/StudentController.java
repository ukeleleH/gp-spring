package com.hlp.controller;

import com.hlp.pojo.Notice;
import com.hlp.pojo.Project;
import com.hlp.pojo.Student;
import com.hlp.pojo.Tutor;
import com.hlp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller("studentController")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 登录的方法
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Student login(@RequestBody Student student) {
        return studentService.login(student);
    }

    // 修改密码的方法
    @RequestMapping("/changePassword")
    @ResponseBody
    public int changePassword(Student student) {
        return studentService.changePassword(student);
    }

    // 查询学生选择的毕业设计题目
    @RequestMapping("/sProject")
    @ResponseBody
    public String querySProject(long id) {
        return studentService.querySProject(id);
    }

    // 查询学生可重选课题的机会次数
    @RequestMapping("/getOpportunity")
    @ResponseBody
    public int getOpportunity(long id) {
        return studentService.getOpportunity(id);
    }

    // 更新学生可重选课题的机会次数
    @RequestMapping("/updateOpportunity")
    @ResponseBody
    public int updateOpportunity(long id) {
        return studentService.updateOpportunity(id);
    }

    // 更新学生已选择的课题信息
    @RequestMapping("/updateHasChooseProject")
    @ResponseBody
    public int updateHasChooseProject(long id) {
        return studentService.updateHasChooseProject(id);
    }

    // 查询全系所有毕业设计选题信息
    @RequestMapping("/allProject")
    @ResponseBody
    public List<Project> queryAllProject() {
        return studentService.queryAllProject();
    }

    // 查询所有课题对应的导师的名字
    @RequestMapping("/allProjectOfTutor")
    @ResponseBody
    public List<String> queryAllProjectOfTutor() {
        return studentService.queryAllProjectOfTutor();
    }

    // 查询我选择的课题信息
    @RequestMapping("/myProject")
    @ResponseBody
    public Project queryMyProject(long id) {
        return studentService.queryMyProject(id);
    }

    // 查询我的课题导师信息
    @RequestMapping("/myProjectTutor")
    @ResponseBody
    public Tutor queryMyProjectTutor(long tutorId) {
        return studentService.queryMyProjectTutor(tutorId);
    }

    // 获取左侧公告的方法
    @RequestMapping("/leftNotice")
    @ResponseBody
    public List<Notice> getLeftNotice() {
        return studentService.getLeftNotice();
    }

    // 选择课题的方法
    @RequestMapping(value = "/chooseProject",method = RequestMethod.POST)
    @ResponseBody
    public int chooseProject(@RequestBody Project project){
        return studentService.chooseProject(project);
    }

    // 文件上传的方法
    @RequestMapping("/upload")
    @ResponseBody
    public void upload(MultipartFile file) throws IOException {
        // 获得上传文件的名称
        String originalFilename = file.getOriginalFilename();
        System.out.println(originalFilename);
        // 存储文件
        file.transferTo(new File("D:/upload/" ,originalFilename));
    }
}

package com.hlp.controller;

import com.hlp.pojo.*;
import com.hlp.service.StudentService;
import com.hlp.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller("studentController")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 登录
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Student login(@RequestBody LoginForm loginForm) {
        return studentService.login(loginForm);
    }

    // 修改个人基本信息
    @RequestMapping(value = "/changeProfile",method = RequestMethod.POST)
    @ResponseBody
    public int changeProfile(@RequestBody Student student) {
        return studentService.changeProfile(student);
    }

    // 修改密码
    @RequestMapping("/changePassword")
    @ResponseBody
    public int changePassword(LoginForm loginForm) {
        return studentService.changePassword(loginForm);
    }

    // 查询学生选择的毕业设计题目
    @RequestMapping("/sProject")
    @ResponseBody
    public String querySProject(long studentId) {
        return studentService.querySProject(studentId);
    }

    // 查询学生可重选课题的机会次数
    @RequestMapping("/getOpportunity")
    @ResponseBody
    public int getOpportunity(long sno) {
        return studentService.getOpportunity(sno);
    }

    // 更新学生可重选课题的机会次数
    @RequestMapping("/updateOpportunity")
    @ResponseBody
    public int updateOpportunity(long sno) {
        return studentService.updateOpportunity(sno);
    }

    // 更新学生已选择的课题信息
    @RequestMapping("/updateHasChooseProject")
    @ResponseBody
    public int updateHasChooseProject(long studentId) {
        return studentService.updateHasChooseProject(studentId);
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
    public Project queryMyProject(long studentId) {
        return studentService.queryMyProject(studentId);
    }

    // 查询我的课题导师信息
    @RequestMapping("/myProjectTutor")
    @ResponseBody
    public Tutor queryMyProjectTutor(long tno) {
        return studentService.queryMyProjectTutor(tno);
    }

    // 查询课题详情里的学生信息
    @RequestMapping("/getStudentData")
    @ResponseBody
    public Student queryStudentData(long sno) {
        return studentService.queryStudentData(sno);
    }

    // 获取左侧公告的方法
    @RequestMapping("/leftNotice")
    @ResponseBody
    public List<Notice> getLeftNotice() {
        return studentService.getLeftNotice();
    }

    // 选择课题的方法
    @RequestMapping(value = "/chooseProject", method = RequestMethod.POST)
    @ResponseBody
    public int chooseProject(@RequestBody Project project) {
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
        file.transferTo(new File("D:/upload/", originalFilename));
    }

    // 文件下载的方法
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    @ResponseBody
    public void download(HttpServletResponse response, HttpServletRequest request) throws IOException {
//        String realPath = URLDecoder.decode(ResourceUtils.getURL("").getPath(), "UTF-8");
        File file = new File("D:\\upload\\简历 - 副本.docx");
        ResponseUtils.download(request,response,file);
    }
}

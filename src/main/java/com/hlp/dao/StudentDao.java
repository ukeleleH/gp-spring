package com.hlp.dao;

import com.hlp.pojo.*;

import java.util.List;

public interface StudentDao {
    //  登录的方法，查找账号是否存在
    Student login(LoginForm loginForm);

    // 修改个人基本信息的方法
    int changeProfile(Student student);

    // 修改密码的方法
    int changePassword(LoginForm loginForm);

    // 查询学生选择的毕业设计题目
    String querySProject(long studentId);

    // 查询学生可重选课题的机会次数
    int getOpportunity(long sno);

    // 更新学生可重选课题的机会次数
    int updateOpportunity(long sno);

    // 更新学生已选择的课题信息
    int updateHasChooseProject(long studentId);

    // 查询全系所有毕业设计选题信息
    List<Project> queryAllProject();

    // 查询所有课题对应的导师的名字
    List<String> queryAllProjectOfTutor();

    // 查询我选择的课题信息
    Project queryMyProject(long studentId);

    // 查询我的课题导师信息
    Tutor queryMyProjectTutor(long tno);

    // 查询课题详情里的学生信息
    Student queryStudentData(long sno);

    // 获取左侧公告的方法
    List<Notice> getLeftNotice();

    // 选择课题的方法
    int chooseProject(Project project);

    // 查询我的开题报告
    List<OpeningReport> getMyOpeningReport(long sno);

    // 上传开题报告
    int uploadOpeningReport(OpeningReport openingReport);

    // 下载开题报告
    String downloadOpeningReport(int id);

    // 删除开题报告
    int deleteOpeningReport(int id);

    // 查询我的导师的学号
    long searchTutorTno(long sno);
}

package com.hlp.dao;

import com.hlp.pojo.LoginForm;
import com.hlp.pojo.OpeningReport;
import com.hlp.pojo.Project;
import com.hlp.pojo.Tutor;

import java.util.HashMap;
import java.util.List;

public interface TutorDao {
    // 导师登录的方法
    Tutor login(LoginForm loginForm);

    // 修改个人基本信息
    int changeProfile(Tutor tutor);

    // 修改密码
    int changePassword(LoginForm loginForm);

    // 查询我发布的课题
    List<Project> queryMyPublishProject(long tutorId);

    // 修改课题信息
    int changeProjectInfo(Project project);

    // 发布新课题
    int publishNewProject(Project project);

    // 查询课题名称是否唯一
    Project queryIsUniqueProjectName(String name);

    // 删除课题
    int deleteProject(int id);

    // 查询选择我的课题的所有学生的学号和姓名
    List<HashMap> searchStudentSnoName(long tno);

    // 获取我的学生上传的所有开题报告
    List<OpeningReport> searchAllReport(long tno);

    // 根据学号查询某个学生的开题报告
    List<OpeningReport> getReportBySno(long sno);

    // 点评开题报告(即更新)
    int updateOpeningReport(HashMap map);

}

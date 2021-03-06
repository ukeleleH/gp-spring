package com.hlp.service.impl;

import com.hlp.dao.TutorDao;
import com.hlp.pojo.LoginForm;
import com.hlp.pojo.OpeningReport;
import com.hlp.pojo.Project;
import com.hlp.pojo.Tutor;
import com.hlp.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TutorServiceImpl implements TutorService {

    @Autowired
    private TutorDao tutorDao;

    @Override
    public Tutor login(LoginForm loginForm) {
        return tutorDao.login(loginForm);
    }

    @Override
    // 修改个人基本信息
    public int changeProfile(Tutor tutor) {
        return tutorDao.changeProfile(tutor);
    }

    @Override
    public int changePassword(LoginForm loginForm) {
        return tutorDao.changePassword(loginForm);
    }

    @Override
    // 查询我发布的课题
    public List<Project> queryMyPublishProject(long tutorId) {
        return tutorDao.queryMyPublishProject(tutorId);
    }

    @Override
    // 修改课题信息
    public int changeProjectInfo(Project project) {
        return tutorDao.changeProjectInfo(project);
    }

    @Override
    // 发布新课题
    public int publishNewProject(Project project) {
        return tutorDao.publishNewProject(project);
    }

    @Override
    // 新增选题时，查询课题名称是否唯一
    public Project queryIsUniqueProjectName(String name) {
        return tutorDao.queryIsUniqueProjectName(name);
    }

    @Override
    // 删除课题
    public int deleteProject(int id) {
        return tutorDao.deleteProject(id);
    }

    @Override
    // 查询选择我的课题的所有学生的学号和姓名
    public List<HashMap> searchStudentSnoName(long tno) {
        return tutorDao.searchStudentSnoName(tno);
    }

    @Override
    // 获取我的学生上传的所有开题报告
    public List<OpeningReport> searchAllReport(long tno) {
        return tutorDao.searchAllReport(tno);
    }

    @Override
    // 根据学号查询某个学生的开题报告
    public List<OpeningReport> getReportBySno(long sno) {
        return tutorDao.getReportBySno(sno);
    }

    @Override
    // 点评开题报告(即更新)
    public int updateOpeningReport(HashMap map) {
        return tutorDao.updateOpeningReport(map);
    }

}

package com.hlp.service.impl;

import com.hlp.dao.TutorDao;
import com.hlp.pojo.Project;
import com.hlp.pojo.Tutor;
import com.hlp.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorServiceImpl implements TutorService {

    @Autowired
    private TutorDao tutorDao;

    @Override
    public Tutor login(Tutor tutor) {
        return tutorDao.login(tutor);
    }

    @Override
    public int changePassword(Tutor tutor) {
        return tutorDao.changePassword(tutor);
    }

    @Override
    // 查询我发布的课题
    public List<Project> queryMyPublishProject(long id) {
        return tutorDao.queryMyPublishProject(id);
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

}

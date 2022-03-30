package com.hlp.dao;

import com.hlp.pojo.Project;
import com.hlp.pojo.Tutor;

import java.util.List;

public interface TutorDao {
    // 导师登录的方法
    Tutor login(Tutor tutor);

    // 修改密码
    int changePassword(Tutor tutor);

    // 查询我发布的课题
    List<Project> queryMyPublishProject(long id);

    // 修改课题信息
    int changeProjectInfo(Project project);

    // 发布新课题
    int publishNewProject(Project project);

    // 查询课题名称是否唯一
    Project queryIsUniqueProjectName(String name);

    // 删除课题
    int deleteProject(int id);

}

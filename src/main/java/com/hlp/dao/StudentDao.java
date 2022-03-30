package com.hlp.dao;

import com.hlp.pojo.Notice;
import com.hlp.pojo.Project;
import com.hlp.pojo.Student;
import com.hlp.pojo.Tutor;

import java.util.List;

public interface StudentDao {
    //  登录的方法，查找账号是否存在
    Student login(Student student);

    // 修改密码的方法
    int changePassword(Student student);

    // 查询学生选择的毕业设计题目
    String querySProject(long id);

    // 查询全系所有毕业设计选题信息
    List<Project> queryAllProject();

    // 查询所有课题对应的导师的名字
    List<String> queryAllProjectOfTutor();

    // 查询我选择的课题信息
    Project queryMyProject(long id);

    // 查询我的课题导师信息
    Tutor queryMyProjectTutor(long tutorId);

    // 获取左侧公告的方法
    List<Notice> getLeftNotice();

    // 选择课题的方法
    int chooseProject(Project project);
}

package com.hlp.dao;

import com.hlp.pojo.*;

import java.util.List;

public interface AdminDao {
    // 管理员登录
    Admin login(LoginForm loginForm);

    // 查询所有学生
    List<Student> selectAllStudent();

    // 查询所有导师
    List<Tutor> selectAllTutor();

    // 新增学生信息时查询学号是否唯一
    Student selectIsUniqueStudentId(long sno);

    // 删除学生信息
    int deleteStudent(int id);

    // 新增学生信息
    int addStudent(Student student);

    // 修改学生信息
    int changeStudent(Student student);

    // 新增导师信息时查询工号是否唯一
    Tutor selectIsUniqueTutorId(long tno);

    // 删除导师信息
    int deleteTutor(int id);

    // 新增导师信息
    int addTutor(Tutor tutor);

    // 修改导师信息
    int changeTutor(Tutor tutor);

    //  新增公告
    int addNotice(Notice notice);

    //  修改公告
    int updateNotice(Notice notice);

    //  删除公告
    int deleteNotice(int id);

    //  新增专业
    int addMajor(Major major);

    //  修改专业
    int updateMajor(Major major);

    //  删除专业
    int deleteMajor(int id);
}

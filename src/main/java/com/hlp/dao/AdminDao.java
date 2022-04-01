package com.hlp.dao;

import com.hlp.pojo.Admin;
import com.hlp.pojo.Student;
import com.hlp.pojo.Tutor;

import java.util.List;

public interface AdminDao {
    // 管理员登录
    Admin login(Admin admin);

    // 查询所有学生
    List<Student> selectAllStudent();

    // 查询所有导师
    List<Tutor> selectAllTutor();

    // 新增学生信息时查询学号是否唯一
    Student selectIsUniqueStudentId(long id);

    // 删除学生信息
    int deleteStudent(long id);

    // 新增学生信息
    int addStudent(Student student);

    // 修改学生信息
    int changeStudent(Student student);

    // 新增导师信息时查询学号是否唯一
    Tutor selectIsUniqueTutorId(long id);

    // 删除导师信息
    int deleteTutor(long id);

    // 新增导师信息
    int addTutor(Tutor tutor);

    // 修改导师信息
    int changeTutor(Tutor tutor);
}

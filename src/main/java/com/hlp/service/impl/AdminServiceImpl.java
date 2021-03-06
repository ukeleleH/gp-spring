package com.hlp.service.impl;

import com.hlp.dao.AdminDao;
import com.hlp.pojo.*;
import com.hlp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin login(LoginForm loginForm) {
        return adminDao.login(loginForm);
    }

    @Override
    public List<Student> selectAllStudent() {
        return adminDao.selectAllStudent();
    }

    @Override
    public List<Tutor> selectAllTutor() {
        return adminDao.selectAllTutor();
    }

    @Override
    public Student selectIsUniqueStudentId(long sno) {
        return adminDao.selectIsUniqueStudentId(sno);
    }

    @Override
    public int deleteStudent(int id) {
        return adminDao.deleteStudent(id);
    }

    @Override
    public int addStudent(Student student) {
        return adminDao.addStudent(student);
    }

    @Override
    public int changeStudent(Student student) {
        return adminDao.changeStudent(student);
    }

    @Override
    public Tutor selectIsUniqueTutorId(long tno) {
        return adminDao.selectIsUniqueTutorId(tno);
    }

    @Override
    public int deleteTutor(int id) {
        return adminDao.deleteTutor(id);
    }

    @Override
    public int addTutor(Tutor tutor) {
        return adminDao.addTutor(tutor);
    }

    @Override
    public int changeTutor(Tutor tutor) {
        return adminDao.changeTutor(tutor);
    }

    @Override
    public int addNotice(Notice notice) {
        return adminDao.addNotice(notice);
    }

    @Override
    public int updateNotice(Notice notice) {
        return adminDao.updateNotice(notice);
    }

    @Override
    public int deleteNotice(int id) {
        return adminDao.deleteNotice(id);
    }

    @Override
    public int addMajor(Major major) {
        return adminDao.addMajor(major);
    }

    @Override
    public int updateMajor(Major major) {
        return adminDao.updateMajor(major);
    }

    @Override
    public int deleteMajor(int id) {
        return adminDao.deleteMajor(id);
    }

}

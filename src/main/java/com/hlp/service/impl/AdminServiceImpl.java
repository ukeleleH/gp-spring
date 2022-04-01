package com.hlp.service.impl;

import com.hlp.dao.AdminDao;
import com.hlp.pojo.Admin;
import com.hlp.pojo.Student;
import com.hlp.pojo.Tutor;
import com.hlp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin login(Admin admin) {
        return adminDao.login(admin);
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
    public Student selectIsUniqueStudentId(long id) {
        return adminDao.selectIsUniqueStudentId(id);
    }

    @Override
    public int deleteStudent(long id) {
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
    public Tutor selectIsUniqueTutorId(long id) {
        return adminDao.selectIsUniqueTutorId(id);
    }

    @Override
    public int deleteTutor(long id) {
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

}

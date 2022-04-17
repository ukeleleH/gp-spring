package com.hlp.service.impl;

import com.hlp.dao.StudentDao;
import com.hlp.pojo.*;
import com.hlp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student login(LoginForm loginForm) {
        return studentDao.login(loginForm);
    }

    @Override
    public int changeProfile(Student student) {
        return studentDao.changeProfile(student);
    }

    @Override
    public int changePassword(LoginForm loginForm){
        return studentDao.changePassword(loginForm);
    }

    @Override
    public String querySProject(long studentId){
        return studentDao.querySProject(studentId);
    }

    @Override
    public int getOpportunity(long sno) {
        return studentDao.getOpportunity(sno);
    }

    @Override
    public int updateOpportunity(long sno) {
        return studentDao.updateOpportunity(sno);
    }

    @Override
    public int updateHasChooseProject(long studentId) {
        return studentDao.updateHasChooseProject(studentId);
    }

    @Override
    public List<Project> queryAllProject(){
        return studentDao.queryAllProject();
    }

    @Override
    public List<String> queryAllProjectOfTutor(){
        return studentDao.queryAllProjectOfTutor();
    }

    @Override
    public Project queryMyProject(long studentId){
        return studentDao.queryMyProject(studentId);
    }

    @Override
    public Tutor queryMyProjectTutor(long tno){
        return studentDao.queryMyProjectTutor(tno);
    }

    @Override
    public Student queryStudentData(long sno) {
        return studentDao.queryStudentData(sno);
    }

    @Override
    public List<Notice> getLeftNotice(){
        return studentDao.getLeftNotice();
    }

    @Override
    public int chooseProject(Project project) {
        return studentDao.chooseProject(project);
    }

}

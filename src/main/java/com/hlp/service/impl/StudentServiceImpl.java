package com.hlp.service.impl;

import com.hlp.dao.StudentDao;
import com.hlp.pojo.Notice;
import com.hlp.pojo.Project;
import com.hlp.pojo.Student;
import com.hlp.pojo.Tutor;
import com.hlp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student login(Student student){
        return studentDao.login(student);
    }

    @Override
    public int changePassword(Student student){
        return studentDao.changePassword(student);
    }

    @Override
    public String querySProject(long id){
        return studentDao.querySProject(id);
    }

    @Override
    public int getOpportunity(long id) {
        return studentDao.getOpportunity(id);
    }

    @Override
    public int updateOpportunity(long id) {
        return studentDao.updateOpportunity(id);
    }

    @Override
    public int updateHasChooseProject(long id) {
        return studentDao.updateHasChooseProject(id);
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
    public Project queryMyProject(long id){
        return studentDao.queryMyProject(id);
    }

    @Override
    public Tutor queryMyProjectTutor(long tutorId){
        return studentDao.queryMyProjectTutor(tutorId);
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

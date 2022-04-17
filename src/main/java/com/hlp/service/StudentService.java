package com.hlp.service;

import com.hlp.pojo.*;

import java.util.List;

public interface StudentService {
    Student login(LoginForm loginForm);

    int changeProfile(Student student);

    int changePassword(LoginForm loginForm);

    String querySProject(long studentId);

    int getOpportunity(long sno);

    int updateOpportunity(long sno);

    int updateHasChooseProject(long studentId);

    List<Project> queryAllProject();

    List<String> queryAllProjectOfTutor();

    Project queryMyProject(long studentId);

    Tutor queryMyProjectTutor(long tno);

    Student queryStudentData(long sno);

    List<Notice> getLeftNotice();

    int chooseProject(Project project);
}

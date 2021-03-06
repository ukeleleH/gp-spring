package com.hlp.service;

import com.hlp.pojo.LoginForm;
import com.hlp.pojo.OpeningReport;
import com.hlp.pojo.Project;
import com.hlp.pojo.Tutor;

import java.util.HashMap;
import java.util.List;

public interface TutorService {
    Tutor login(LoginForm loginForm);

    int changeProfile(Tutor tutor);

    int changePassword(LoginForm loginForm);

    List<Project> queryMyPublishProject(long tutorId);

    int changeProjectInfo(Project project);

    int publishNewProject(Project project);

    Project queryIsUniqueProjectName(String name);

    int deleteProject(int id);

    List<HashMap> searchStudentSnoName(long tno);

    List<OpeningReport> searchAllReport(long tno);

    List<OpeningReport> getReportBySno(long sno);

    int updateOpeningReport(HashMap map);
}

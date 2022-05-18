package com.hlp.service;

import com.hlp.pojo.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    List<OpeningReport> getMyOpeningReport(long sno);

    int uploadOpeningReport(MultipartFile file,long sno,long tno);

    void downloadOpeningReport(HttpServletRequest request,HttpServletResponse response, int id);

    int deleteOpeningReport(int id);

    long searchTutorTno(long sno);
}

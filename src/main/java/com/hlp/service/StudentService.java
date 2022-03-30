package com.hlp.service;

import com.hlp.pojo.Notice;
import com.hlp.pojo.Project;
import com.hlp.pojo.Student;
import com.hlp.pojo.Tutor;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface StudentService {
    Student login(Student student);

    int changePassword(Student student);

    String querySProject(long id);

    List<Project> queryAllProject();

    List<String> queryAllProjectOfTutor();

    Project queryMyProject(long id);

    Tutor queryMyProjectTutor(long tutorId);

    List<Notice> getLeftNotice();

    int chooseProject(Project project);
}

package com.hlp.service;

import com.hlp.pojo.Project;
import com.hlp.pojo.Tutor;

import java.util.List;

public interface TutorService {
    Tutor login(Tutor tutor);

    int changePassword(Tutor tutor);

    List<Project> queryMyPublishProject(long id);

    int changeProjectInfo(Project project);

    int publishNewProject(Project project);

    Project queryIsUniqueProjectName(String name);

    int deleteProject(int id);

}

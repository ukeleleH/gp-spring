package com.hlp.service.impl;

import com.hlp.dao.StudentDao;
import com.hlp.pojo.*;
import com.hlp.service.StudentService;
import com.hlp.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
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
    public int changePassword(LoginForm loginForm) {
        return studentDao.changePassword(loginForm);
    }

    @Override
    public String querySProject(long studentId) {
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
    public List<Project> queryAllProject() {
        return studentDao.queryAllProject();
    }

    @Override
    public List<String> queryAllProjectOfTutor() {
        return studentDao.queryAllProjectOfTutor();
    }

    @Override
    public Project queryMyProject(long studentId) {
        return studentDao.queryMyProject(studentId);
    }

    @Override
    public Tutor queryMyProjectTutor(long tno) {
        return studentDao.queryMyProjectTutor(tno);
    }

    @Override
    public Student queryStudentData(long sno) {
        return studentDao.queryStudentData(sno);
    }

    @Override
    public List<Notice> getLeftNotice() {
        return studentDao.getLeftNotice();
    }

    @Override
    public int chooseProject(Project project) {
        return studentDao.chooseProject(project);
    }

    @Override
    public List<OpeningReport> getMyOpeningReport(long sno) {
        return studentDao.getMyOpeningReport(sno);
    }

    @Override
    public int uploadOpeningReport(MultipartFile file, long sno,long tno) {
        String filename = file.getOriginalFilename();
        String fileUrl = "D:\\upload\\" + filename;
        Date date = new Date();

        // 封装成对象
        OpeningReport openingReport = new OpeningReport();
        openingReport.setSno(sno);
        openingReport.setTno(tno);
        openingReport.setFileName(filename);
        openingReport.setFileUrl(fileUrl);
        openingReport.setUploadTime(date);

        // 存储文件
        try {
            file.transferTo(new File("D:/upload/", filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentDao.uploadOpeningReport(openingReport);
    }

    @Override
    public void downloadOpeningReport(HttpServletRequest request, HttpServletResponse response, int id) {
        String fileUrl = studentDao.downloadOpeningReport(id);
        File file = new File(fileUrl);
        ResponseUtils.download(request, response, file);
    }

    @Override
    public int deleteOpeningReport(int id) {
        return studentDao.deleteOpeningReport(id);
    }

    @Override
    public long searchTutorTno(long sno) {
        return studentDao.searchTutorTno(sno);
    }

}

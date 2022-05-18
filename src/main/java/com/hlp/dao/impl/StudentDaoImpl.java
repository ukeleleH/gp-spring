package com.hlp.dao.impl;

import com.hlp.dao.StudentDao;
import com.hlp.pojo.*;
import com.hlp.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Override
    // 登录
    public Student login(LoginForm loginForm) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.login", loginForm);
    }

    @Override
    // 修改个人基本信息的方法
    public int changeProfile(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("studentMapper.changeProfile",student);
    }

    @Override
    // 修改密码
    public int changePassword(LoginForm loginForm) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("studentMapper.changePassword", loginForm);
    }

    @Override
    // 查询学生选择的毕业设计题目
    public String querySProject(long studentId) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.querySProject", studentId);
    }

    @Override
    // 查询学生可重选课题的机会次数
    public int getOpportunity(long sno) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.getOpportunity",sno);
    }

    @Override
    // 更新学生可重选课题的机会次数
    public int updateOpportunity(long sno) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("studentMapper.updateOpportunity",sno);
    }

    @Override
    // 更新学生已选择的课题信息
    public int updateHasChooseProject(long studentId) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("studentMapper.updateHasChooseProject",studentId);
    }

    @Override
    // 查询全系所有毕业设计选题信息
    public List<Project> queryAllProject() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("studentMapper.queryAllProject");
    }

    @Override
    // 查询所有课题对应的导师的名字
    public List<String> queryAllProjectOfTutor() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("studentMapper.queryAllProjectOfTutor");
    }

    @Override
    // 查询我选择的课题信息
    public Project queryMyProject(long studentId) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.queryMyProject", studentId);
    }

    @Override
    // 查询我的课题导师信息
    public Tutor queryMyProjectTutor(long tno) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.queryMyProjectTutor", tno);
    }

    @Override
    // 查询课题详情里的学生信息
    public Student queryStudentData(long sno) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.queryStudentData", sno);
    }

    @Override
    // 获取公告
    public List<Notice> getLeftNotice() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("studentMapper.getLeftNotice");
    }

    @Override
    // 选择课题的方法
    public int chooseProject(Project project) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.insert("studentMapper.chooseProject",project);
    }

    @Override
    // 获取我上传的开题报告
    public List<OpeningReport> getMyOpeningReport(long sno) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("studentMapper.getMyOpeningReport",sno);
    }

    @Override
    // 上传开题报告
    public int uploadOpeningReport(OpeningReport openingReport) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.insert("studentMapper.uploadOpeningReport",openingReport);
    }

    @Override
    // 下载开题报告
    public String downloadOpeningReport(int id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.downloadOpeningReport",id);
    }

    @Override
    public int deleteOpeningReport(int id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.delete("studentMapper.deleteOpeningReport",id);
    }

    @Override
    // 查询导师的工号
    public long searchTutorTno(long sno) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.searchTutorTno",sno);
    }
}

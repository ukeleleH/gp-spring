package com.hlp.dao.impl;

import com.hlp.dao.TutorDao;
import com.hlp.pojo.LoginForm;
import com.hlp.pojo.Project;
import com.hlp.pojo.Tutor;
import com.hlp.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TutorDaoImpl implements TutorDao {

    @Override
    public Tutor login(LoginForm loginForm) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("tutorMapper.login", loginForm);
    }

    @Override
    public int changeProfile(Tutor tutor) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("tutorMapper.changeProfile",tutor);
    }

    @Override
    public int changePassword(LoginForm loginForm) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("tutorMapper.changePassword", loginForm);
    }

    @Override
    public List<Project> queryMyPublishProject(long tutorId) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("tutorMapper.queryMyPublishProject", tutorId);
    }

    @Override
    public int changeProjectInfo(Project project) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("tutorMapper.changeProjectInfo", project);
    }

    @Override
    public int publishNewProject(Project project) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.insert("tutorMapper.publishNewProject", project);
    }

    @Override
    public Project queryIsUniqueProjectName(String name) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("tutorMapper.queryIsUniqueProjectName",name);
    }

    @Override
    public int deleteProject(int id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.delete("tutorMapper.deleteProject",id);
    }

}

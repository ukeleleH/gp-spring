package com.hlp.dao.impl;

import com.hlp.dao.StudentDao;
import com.hlp.pojo.Notice;
import com.hlp.pojo.Project;
import com.hlp.pojo.Student;
import com.hlp.pojo.Tutor;
import com.hlp.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Override
    // 登录
    public Student login(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.login", student);
    }

    @Override
    // 修改密码
    public int changePassword(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("studentMapper.changePassword", student);
    }

    @Override
    // 查询学生选择的毕业设计题目
    public String querySProject(long id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.querySProject", id);
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
    public Project queryMyProject(long id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.queryMyProject", id);
    }

    @Override
    // 查询我的课题导师信息
    public Tutor queryMyProjectTutor(long tutorId) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("studentMapper.queryMyProjectTutor", tutorId);
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
}

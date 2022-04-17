package com.hlp.dao.impl;

import com.hlp.dao.AdminDao;
import com.hlp.pojo.Admin;
import com.hlp.pojo.LoginForm;
import com.hlp.pojo.Student;
import com.hlp.pojo.Tutor;
import com.hlp.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

    @Override
    public Admin login(LoginForm loginForm) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("adminMapper.login",loginForm);
    }

    @Override
    public List<Student> selectAllStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("adminMapper.selectAllStudent");
    }

    @Override
    public List<Tutor> selectAllTutor() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("adminMapper.selectAllTutor");
    }

    @Override
    public Student selectIsUniqueStudentId(long sno) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("adminMapper.isUniqueStudentId",sno);
    }

    @Override
    public int deleteStudent(int id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.delete("adminMapper.deleteStudent",id);
    }

    @Override
    public int addStudent(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.insert("adminMapper.addStudent",student);
    }

    @Override
    public int changeStudent(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("adminMapper.updateStudent",student);
    }

    @Override
    public Tutor selectIsUniqueTutorId(long tno) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("adminMapper.isUniqueTutorId",tno);
    }

    @Override
    public int deleteTutor(int id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.delete("adminMapper.deleteTutor",id);
    }

    @Override
    public int addTutor(Tutor tutor) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.insert("adminMapper.addTutor",tutor);
    }

    @Override
    public int changeTutor(Tutor tutor) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.update("adminMapper.updateTutor",tutor);
    }
}

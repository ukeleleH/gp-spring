package com.hlp.dao.impl;

import com.hlp.dao.AdminDao;
import com.hlp.pojo.Admin;
import com.hlp.pojo.Student;
import com.hlp.pojo.Tutor;
import com.hlp.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

    @Override
    public Admin login(Admin admin) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("adminMapper.login",admin);
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
    public Student selectIsUniqueStudentId(long id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("adminMapper.isUniqueStudentId",id);
    }

    @Override
    public int deleteStudent(long id) {
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
    public Tutor selectIsUniqueTutorId(long id) {
        System.out.println(id);
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectOne("adminMapper.isUniqueTutorId",id);
    }

    @Override
    public int deleteTutor(long id) {
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

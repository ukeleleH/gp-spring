package com.hlp.dao.impl;

import com.hlp.dao.AdminDao;
import com.hlp.pojo.Admin;
import com.hlp.pojo.Student;
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
}

package com.hlp.dao.impl;

import com.hlp.dao.SystemDao;
import com.hlp.pojo.Clazz;
import com.hlp.pojo.Department;
import com.hlp.pojo.Major;
import com.hlp.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("systemDao")
public class SystemDaoImpl implements SystemDao {

    @Override
    public List<Department> searchDepartment() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("systemMapper.selectDepartment");
    }

    @Override
    public List<Major> searchMajor() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("systemMapper.selectMajor");
    }

    @Override
    public List<Major> searchMajorByDid(int d_id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("systemMapper.searchMajorByDid",d_id);
    }

    @Override
    public List<Clazz> searchClass(int limitNum) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        return sqlSession.selectList("systemMapper.selectClass",limitNum);
    }
}

package com.hlp.service.impl;

import com.hlp.dao.SystemDao;
import com.hlp.pojo.Clazz;
import com.hlp.pojo.Department;
import com.hlp.pojo.Major;
import com.hlp.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("systemService")
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemDao systemDao;

    @Override
    public List<Department> searchDepartment() {
        return systemDao.searchDepartment();
    }

    @Override
    public List<Major> searchMajor() {
        return systemDao.searchMajor();
    }

    @Override
    public List<Clazz> searchClass(int limitNum) {
        return systemDao.searchClass(limitNum);
    }
}

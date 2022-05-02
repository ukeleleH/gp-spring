package com.hlp.dao;

import com.hlp.pojo.Clazz;
import com.hlp.pojo.Department;
import com.hlp.pojo.Major;

import java.util.List;

public interface SystemDao {

    // 查询学科部信息
    List<Department> searchDepartment();

    // 查询专业信息
    List<Major> searchMajor();

    // 查询班级信息
    List<Clazz> searchClass(int limitNum);

}

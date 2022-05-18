package com.hlp.service;

import com.hlp.pojo.Clazz;
import com.hlp.pojo.Department;
import com.hlp.pojo.Major;

import java.util.List;

public interface SystemService {

    // 查询学科部信息
    List<Department> searchDepartment();

    // 查询所有专业信息
    List<Major> searchMajor();

    // 按学科部查询专业信息
    List<Major> searchMajorByDid(int d_id);

    // 查询班级
    List<Clazz> searchClass(int limitNum);

}

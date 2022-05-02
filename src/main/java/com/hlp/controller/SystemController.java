package com.hlp.controller;

import com.hlp.pojo.Clazz;
import com.hlp.pojo.Department;
import com.hlp.pojo.Major;
import com.hlp.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("systemController")
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private SystemService systemService;

    // 查询学科部信息
    @RequestMapping("/searchDepartment")
    @ResponseBody
    public List<Department> searchDepartment() {
        return systemService.searchDepartment();
    }

    // 查询专业信息
    @RequestMapping("/searchMajor")
    @ResponseBody
    public List<Major> searchMajor() {
        return systemService.searchMajor();
    }

    // 查询班级信息
    @RequestMapping("/searchClass")
    @ResponseBody
    public List<Clazz> searchClass(int limitNum){
        return systemService.searchClass(limitNum);
    }
}

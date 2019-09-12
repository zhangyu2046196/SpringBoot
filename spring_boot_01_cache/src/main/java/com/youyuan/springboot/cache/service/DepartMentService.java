package com.youyuan.springboot.cache.service;

import com.youyuan.springboot.cache.bean.Department;
import com.youyuan.springboot.cache.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author zhangyu
 * @version 1.0
 * @description 部门业务接口
 * @date 2018/12/20 14:08
 */
@Service
public class DepartMentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Cacheable(cacheNames = "dept",condition = "#result!=null")
    public Department getDeptById(Integer id){
        return departmentMapper.getDepartmentById(id);
    }
}

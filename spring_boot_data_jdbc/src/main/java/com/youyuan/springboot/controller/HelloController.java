package com.youyuan.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试JdbcTemplate
 * @date 2018/12/16 20:22
 */
@Controller
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/query")
    public Map<String,Object> query(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from department");
        return list.get(0);
    }
}

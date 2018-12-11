package com.pro.controller;

import com.pro.entity.StudentEntity;
import com.pro.jpa.StudentJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangjinyu on 2018/11/16 16:03.
 */
@RestController
public class TestSpringBoot {
    @Autowired
    private StudentJpa studentJpa;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/studentInfo")
    public List<StudentEntity> listStudentIndo() {
        List<StudentEntity> all = studentJpa.findAll();
        return all;
    }

}

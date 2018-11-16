package com.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangjinyu on 2018/11/16 16:03.
 */
@Controller
public class TestSptingBoot {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}

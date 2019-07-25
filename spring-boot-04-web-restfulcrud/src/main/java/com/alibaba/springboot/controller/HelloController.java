package com.alibaba.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map) {
        map.put("hello","世界早安");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }

/*    @RequestMapping({"/","/login"})
    public String login() {
        return "login";
    }*/
}

package com.ddcb.activity7.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @GetMapping("/article/{id}")
    public @ResponseBody
    String getArticle(@PathVariable(value = "id") String name) {
        return "你好"+name;
    }
}

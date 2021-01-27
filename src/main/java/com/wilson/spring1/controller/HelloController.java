package com.wilson.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloController {

    @GetMapping(value = "/success")
    public String success(Map map){
        map.put("aaa", "AAA");
        return "success";
    }
}

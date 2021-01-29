package com.wilson.spring1.controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.WebBindingInitializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private volatile org.springframework.context.ApplicationContext applicationContext;

    @Autowired
    private volatile ListableBeanFactory beanFactory;

    @GetMapping(value = "/success")
    public String success(Map map){
        map.put("aaa", "AAA");
        return "success";
    }

    @ResponseBody
    @GetMapping(value = "/hello")
    public String hello(){
        List<WebBindingInitializer> list = new ArrayList<>(this.applicationContext.getBeansOfType(WebBindingInitializer.class).values());
        List<WebBindingInitializer> list2 = new ArrayList<>(beanFactory.getBeansOfType(WebBindingInitializer.class).values());
        return "hello";
    }
}

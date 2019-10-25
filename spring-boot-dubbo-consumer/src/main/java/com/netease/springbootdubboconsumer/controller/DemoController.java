package com.netease.springbootdubboconsumer.controller;

import com.netease.service.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/demo")
    public String demo(){
        String result =  demoService.sayHello("refineli");
        System.out.println(result);
        return "hello";
    }
}

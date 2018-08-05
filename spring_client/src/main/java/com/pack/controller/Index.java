package com.pack.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Index
 * @Description TODO
 * @Author zhaohongwei
 * @Date 2018/6/7 14:23
 * @Version 1.0
 **/
@RestController
public class Index {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(String name){
        return "hi "+name+",i am from port:" +port;
    }
}

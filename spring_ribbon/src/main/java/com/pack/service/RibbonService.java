package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RibbonService
 * @Description TODO
 * @Author zhaohongwei
 * @Date 2018/6/8 14:39
 * @Version 1.0
 **/
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String ribbonServiceTest(String name){
        return restTemplate.getForObject("http://SERVICE-HI/index?name="+name,String.class);
    }

}

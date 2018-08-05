package com.pack.controller;

import com.pack.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RibbonController
 * @Description TODO
 * @Author zhaohongwei
 * @Date 2018/6/8 14:42
 * @Version 1.0
 **/
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/index")
    public String index(String name){
        return ribbonService.ribbonServiceTest(name);
    }

}

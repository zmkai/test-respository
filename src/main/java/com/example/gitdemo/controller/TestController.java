package com.example.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: mengkai.zhou@hand-china.com
 * @date: 2019/8/25
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String testHello(){
        System.out.println("这是test-branch1所做的修改，我会等着合并的");
        return "Test Hello!!!";
    }
}

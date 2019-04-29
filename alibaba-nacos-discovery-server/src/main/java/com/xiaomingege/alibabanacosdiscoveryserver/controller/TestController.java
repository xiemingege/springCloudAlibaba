package com.xiaomingege.alibabanacosdiscoveryserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2019/4/29
 * @TINE 11:34
 **/
@Slf4j
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        System.out.println("invoked name  =" + name);
        return "invoked name  =" + name;
    }
}

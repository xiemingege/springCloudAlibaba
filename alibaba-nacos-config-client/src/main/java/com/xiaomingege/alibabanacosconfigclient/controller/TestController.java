package com.xiaomingege.alibabanacosconfigclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2019/5/6
 * @TINE 10:35
 **/
@Slf4j
@RefreshScope
@RestController
public class TestController {
    @Value("${xiaominge.title:}")
    String title;

    @GetMapping("/title")
    public String getTitle() {
        return title;
    }
}

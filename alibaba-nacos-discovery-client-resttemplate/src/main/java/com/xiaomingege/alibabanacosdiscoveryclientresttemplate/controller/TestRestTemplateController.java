package com.xiaomingege.alibabanacosdiscoveryclientresttemplate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @create 2019/4/29
 * @TINE 16:11
 **/
@Slf4j
@RestController
public class TestRestTemplateController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String testRestTemplate() {
        String url = restTemplate.getForObject("http://alibaba-nacos-discovery-server/hello?name=xiaominge",String.class);
        return url;
    }
}

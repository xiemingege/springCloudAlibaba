package com.xiaomingege.alibabanacosdiscoveryclientfeign.controller;

import com.xiaomingege.alibabanacosdiscoveryclientfeign.dao.FeignTestDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2019/4/30
 * @TINE 16:55
 **/
@Slf4j
@RestController
public class TestFeignController {
    @Autowired
    private FeignTestDao feignTestDao;
    @GetMapping("/test")
    public String testGetFeign() {
        String hello = feignTestDao.hello("xiaominge");
        return "return :" + hello;
    }
}

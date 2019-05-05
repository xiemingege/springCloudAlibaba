package com.xiaomingege.alibabanacosdiscoveryclientfeign.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @create 2019/4/30
 * @TINE 17:00
 **/
@FeignClient("alibaba-nacos-discovery-server")
public interface FeignTestDao {

    @GetMapping("/hello")
    String hello(@RequestParam(name = "name") String name);

}

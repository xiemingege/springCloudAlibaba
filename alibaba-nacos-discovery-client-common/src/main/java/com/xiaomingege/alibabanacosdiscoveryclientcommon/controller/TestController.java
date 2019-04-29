package com.xiaomingege.alibabanacosdiscoveryclientcommon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @create 2019/4/29
 * @TINE 11:48
 **/
@Slf4j
@RestController
public class TestController {
    @Autowired
    LoadBalancerClient  loadBalancerClient;
    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-nacos-discovery-server");
        String url = serviceInstance.getUri()+"/hello?name="+"xiaominge";
        RestTemplate restTemplate =new RestTemplate();
        String result =restTemplate.getForObject(url,String.class);
        return "Invoke : " +url+", return : "+result;
    }
}

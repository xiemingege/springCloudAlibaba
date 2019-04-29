package com.xiaomingege.alibabanacosdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaNacosDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryServerApplication.class, args);
    }

}

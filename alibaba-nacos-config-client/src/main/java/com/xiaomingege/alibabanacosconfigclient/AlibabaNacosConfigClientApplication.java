package com.xiaomingege.alibabanacosconfigclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Slf4j
@SpringBootApplication
@RefreshScope
public class AlibabaNacosConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosConfigClientApplication.class, args);
    }

}

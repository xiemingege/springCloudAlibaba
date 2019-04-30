package com.xiaomingege.alibabanacosdiscoveryclientresttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaNacosDiscoveryClientResttemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryClientResttemplateApplication.class, args);
    }

    /**
     * 定义一个 RestTemplate
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

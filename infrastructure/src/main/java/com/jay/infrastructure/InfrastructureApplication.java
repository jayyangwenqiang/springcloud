package com.jay.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 基础服务类
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class InfrastructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApplication.class, args);
    }
}

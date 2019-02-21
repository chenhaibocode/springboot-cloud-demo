package com.chenhaibo.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: chenhaibo
 * @Description:
 * @Date: Created in 16:04 2018/7/26
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableFeignClients
@ComponentScan(basePackages = {"com.chenhaibo"})
public class SpringCloudClientEntry {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientEntry.class, args);
    }
}
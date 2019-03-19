package com.chenhaibo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: chenhaibo
 * @Description:
 * @Date: Created in 16:04 2018/7/26
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudClientEntry {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientEntry.class, args);
    }
}
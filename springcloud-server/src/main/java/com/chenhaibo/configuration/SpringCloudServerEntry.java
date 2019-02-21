package com.chenhaibo.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: chenhaibo
 * @Description:
 * @Date: Created in 16:04 2018/7/26
 */
@SpringBootApplication(scanBasePackages = "com.chenhaibo")
@ComponentScan(basePackages = {"com.chenhaibo"})
@MapperScan("com.chenhaibo.dao")
@EnableDiscoveryClient
public class SpringCloudServerEntry {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerEntry.class, args);
    }
}
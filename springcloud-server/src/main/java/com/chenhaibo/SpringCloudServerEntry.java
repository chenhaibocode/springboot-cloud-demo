package com.chenhaibo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: chenhaibo
 * @Description:
 * @Date: Created in 16:04 2018/7/26
 */
@MapperScan("com.chenhaibo.dao")
@SpringBootApplication
public class SpringCloudServerEntry {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerEntry.class, args);
    }
}
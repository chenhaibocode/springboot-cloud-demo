package com.chenhaibo;

import com.chenhaibo.filters.RequestTimeGatewayFilterFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudGatewayEntry {

    public static void main(String[] args) {
        SpringApplication.run( SpringCloudGatewayEntry.class, args );
    }

    @Bean
    public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }
}

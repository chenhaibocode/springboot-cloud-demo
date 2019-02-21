package com.chenhaibo.rpc;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: chenhaibo
 * @Date: 2018/11/18 15:15
 * @Description:
 */
@Service
public class UserRpc {
    private static final String url = "http://springcloud-server/user";
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUserIdByNameFallback")
    public String getUserIdByName(String name) {
        return restTemplate.getForEntity(url + "/getUserIdByName?name=" + name, String.class).getBody();
    }

    private String getUserIdByNameFallback(String name) {
        return "service error";
    }
}

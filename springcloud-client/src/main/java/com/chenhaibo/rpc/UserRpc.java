package com.chenhaibo.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: chenhaibo
 * @Date: 2018/11/18 15:15
 * @Description:
 */
@FeignClient(name = "springcloud-server")
public interface UserRpc {

    @GetMapping("/user/{name}")
    String getUserIdByName(@PathVariable("name") String name);
}
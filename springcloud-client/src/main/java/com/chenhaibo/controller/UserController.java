package com.chenhaibo.controller;

import com.chenhaibo.rpc.UserRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: chenhaibo
 * @Description:
 * @Date: Created in 15:51 2018/7/26
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserRpc userRpc;

    @RequestMapping(value = "/index")
    public String index() {
        return "user/index";
    }

    @RequestMapping(value = "show")
    @ResponseBody
    public String show(@RequestParam(value = "name") String name) {
        String result = userRpc.getUserIdByName(name);
        if (!StringUtils.isEmpty(result)) {
            return result;
        }
        return "null";
    }
}

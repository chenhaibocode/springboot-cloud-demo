package com.chenhaibo.controller;

import com.chenhaibo.model.User;
import com.chenhaibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: com.chenhaibo.controller
 * date: 2019.02.21 17:03
 *
 * @author yks
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUserIdByName")
    public String getUserIdByName(@RequestParam(value = "name") String name) {
        User user = userService.findByUserName(name);
        if (null == user) {
            return "user is null";
        } else {
            return user.getId() + "";
        }
    }
}

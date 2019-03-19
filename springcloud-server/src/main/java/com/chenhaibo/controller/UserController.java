package com.chenhaibo.controller;

import com.chenhaibo.model.User;
import com.chenhaibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: com.chenhaibo.controller
 * date: 2019.02.21 17:03
 *
 * @author yks
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{name}")
    public String getUserIdByName(@PathVariable String name) {
        User user = userService.findByUserName(name);
        if (null == user) {
            return "user is null";
        } else {
            return user.getId() + "";
        }
    }
}

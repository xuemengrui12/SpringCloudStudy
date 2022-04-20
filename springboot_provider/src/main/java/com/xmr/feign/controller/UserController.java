package com.xmr.feign.controller;

import com.xmr.feign.entity.User;
import com.xmr.feign.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xmr on 2020/3/20.
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return userService.queryById(id);
    }
}

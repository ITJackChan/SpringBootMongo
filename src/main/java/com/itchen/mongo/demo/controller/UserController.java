/**
 * Copyright © 2018 by ITJackChan. All rights reserved.
 */
package com.itchen.mongo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itchen.mongo.demo.entity.User;
import com.itchen.mongo.demo.service.UserService;

/**
 * @author Chen Yibiao
 * @version UserController.java, v 0.1 2018年5月2日 下午9:16:24 Written by Chen
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Setter method for property <tt>userService</tt>.
     *
     * @param userService value to be assigned to property userService
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.queryAll();
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {
        user = new User(null, "Chen Yibao", 18, true);
        return userService.insertOne(user);
    }

    @RequestMapping("/modifyUser")
    public boolean modifyUser(User user) {
        return userService.updateOne(user);
    }

    @RequestMapping("/rmUser")
    public boolean rmUser(String id) {
        return userService.deleteById(id);
    }
}

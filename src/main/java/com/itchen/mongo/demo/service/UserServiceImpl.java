/**
 * Copyright © 2018 by ITJackChan. All rights reserved.
 */
package com.itchen.mongo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itchen.mongo.demo.dao.UserDAO;
import com.itchen.mongo.demo.entity.User;

/**
 * @author Chen Yibiao
 * @version UserServiceImpl.java, v 0.1 2018年5月2日 下午9:24:30 Written by Chen
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    /**
     * Setter method for property <tt>userDAO</tt>.
     *
     * @param userDAO value to be assigned to property userDAO
     */
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#queryAll()
     */
    @Override
    public List<User> queryAll() {
        return userDAO.queryAll();
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#queryById(java.lang.String)
     */
    @Override
    public User queryById(String id) {
        return userDAO.queryById(id);
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#insertOne(java.lang.Object)
     */
    @Override
    public String insertOne(User obj) {
        return userDAO.insertOne(obj);
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#updateOne(java.lang.Object)
     */
    @Override
    public boolean updateOne(User obj) {
        return userDAO.updateOne(obj);
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#deleteById(java.lang.String)
     */
    @Override
    public boolean deleteById(String id) {
        return userDAO.deleteById(id);
    }

}

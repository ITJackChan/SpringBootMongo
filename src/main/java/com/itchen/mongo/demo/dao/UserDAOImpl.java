/**
A * Copyright © 2018 by ITJackChan. All rights reserved.
*/
package com.itchen.mongo.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.itchen.mongo.demo.entity.User;

/**
 * @author Chen Yibiao
 * @version UserD.java, v 0.1 2018年5月2日 下午9:27:16 Written by Chen
 */
//@Component
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * Setter method for property <tt>mongoTemplate</tt>.
     *
     * @param mongoTemplate value to be assigned to property mongoTemplate
     */
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#queryAll()
     */
    @Override
    public List<User> queryAll() {
        return mongoTemplate.findAll(User.class);
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#queryById(java.lang.String)
     */
    @Override
    public User queryById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query, User.class);
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#insertOne(java.lang.Object)
     */
    @Override
    public String insertOne(User obj) {
        mongoTemplate.insert(obj);
        return obj.getId();
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#updateOne(java.lang.Object)
     */
    @Override
    public boolean updateOne(User obj) {
        mongoTemplate.save(obj);
        return true;
    }

    /**
     * @see com.itchen.mongo.demo.util.BaseAdapter#deleteById(java.lang.String)
     */
    @Override
    public boolean deleteById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, User.class);
        return true;
    }

}

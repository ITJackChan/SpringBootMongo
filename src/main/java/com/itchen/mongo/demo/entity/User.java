/**
 * Copyright © 2018 by ITJackChan. All rights reserved.
 */
package com.itchen.mongo.demo.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Chen Yibiao
 * @version User.java, v 0.1 2018年5月2日 下午9:15:31 Written by Chen
 */
@SuppressWarnings("serial")
@Document(collection = "user")
public class User implements Serializable {

    @Id
    private String  id;

    private String  name;

    private int     age;

    private boolean sex;

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
    }

    /**
     * 
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param id
     * @param name
     * @param age
     * @param sex
     */
    public User(String id, String name, int age, boolean sex) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>age</tt>.
     *
     * @return property value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     *
     * @param age value to be assigned to property age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter method for property <tt>sex</tt>.
     *
     * @return property value of sex
     */
    public boolean isSex() {
        return sex;
    }

    /**
     * Setter method for property <tt>sex</tt>.
     *
     * @param sex value to be assigned to property sex
     */
    public void setSex(boolean sex) {
        this.sex = sex;
    }

}

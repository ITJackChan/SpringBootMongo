/**
 * Copyright © 2018 by ITJackChan. All rights reserved.
 */
package com.itchen.mongo.demo.util;

import java.util.List;

/**
 * @author Chen Yibiao
 * @version BaseAdapter.java, v 0.1 2018年5月2日 下午9:19:28 Written by Chen
 */
public interface BaseAdapter<T> {

    List<T> queryAll();

    T queryById(String id);

    String insertOne(T obj);

    boolean updateOne(T obj);

    boolean deleteById(String id);

}

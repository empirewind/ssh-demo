/*
 * 文件名：GenericDao.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月25日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.yuan.shop.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年7月25日
 * @see GenericDao
 * @since
 */

public interface GenericDao<T, PK extends Serializable> {

    T load(PK id);  
    
    T get(PK id);  
      
    List<T> findAll();  
      
    void persist(T entity);  
      
    PK save(T entity);  
      
    void saveOrUpdate(T entity);  
      
    void delete(PK id);  
      
    void flush();  
}

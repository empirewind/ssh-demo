/*
 * 文件名：UserInfoService.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月25日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.yuan.shop.service;

import java.util.List;

import com.bonc.yuan.shop.entity.UserInfo;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年7月25日
 * @see UserInfoService
 * @since
 */

public interface UserInfoService {

    UserInfo load(Integer id);  
    
    UserInfo get(Integer id);  
  
    List<UserInfo> findAll();  
  
    void persist(UserInfo entity);  
  
    Integer save(UserInfo entity);  
  
    void saveOrUpdate(UserInfo entity);  
  
    void delete(Integer id);  
  
    void flush();  
}

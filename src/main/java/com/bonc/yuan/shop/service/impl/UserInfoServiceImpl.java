/*
 * 文件名：v.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月25日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.yuan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonc.yuan.shop.dao.UserInfoDao;
import com.bonc.yuan.shop.entity.UserInfo;
import com.bonc.yuan.shop.service.UserInfoService;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年7月25日
 * @see v
 * @since
 */

@Service("userInfoService")  
public class UserInfoServiceImpl implements UserInfoService {  
  
    @Autowired  
    private UserInfoDao userInfoDao;

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.service.UserInfoService#load(java.lang.Integer)
     */
    public UserInfo load(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.service.UserInfoService#get(java.lang.Integer)
     */
    public UserInfo get(Integer id) {
        // TODO Auto-generated method stub
        return userInfoDao.get(id);
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.service.UserInfoService#findAll()
     */
    public List<UserInfo> findAll() {
        // TODO Auto-generated method stub
        return userInfoDao.findAll();  
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.service.UserInfoService#persist(com.bonc.yuan.shop.entity.UserInfo)
     */
    public void persist(UserInfo entity) {
        // TODO Auto-generated method stub
        userInfoDao.persist(entity); 
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.service.UserInfoService#save(com.bonc.yuan.shop.entity.UserInfo)
     */
    public Integer save(UserInfo entity) {
        // TODO Auto-generated method stub
        return userInfoDao.save(entity); 
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.service.UserInfoService#saveOrUpdate(com.bonc.yuan.shop.entity.UserInfo)
     */
    public void saveOrUpdate(UserInfo entity) {
        // TODO Auto-generated method stub
        userInfoDao.saveOrUpdate(entity);  
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.service.UserInfoService#delete(java.lang.Integer)
     */
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        userInfoDao.delete(id);  
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.service.UserInfoService#flush()
     */
    public void flush() {
        // TODO Auto-generated method stub
        userInfoDao.flush();  
    }  
  
}  
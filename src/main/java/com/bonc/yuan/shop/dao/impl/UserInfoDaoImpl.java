/*
 * 文件名：UserInfoDaoImpl.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月25日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.yuan.shop.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bonc.yuan.shop.dao.UserInfoDao;
import com.bonc.yuan.shop.entity.UserInfo;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年7月25日
 * @see UserInfoDaoImpl
 * @since
 */
@Repository("userInfoDao")
public class UserInfoDaoImpl implements UserInfoDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession() {  
        return this.sessionFactory.getCurrentSession();  
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.dao.GenericDao#load(java.io.Serializable)
     */
    public UserInfo load(Integer id) {
        // TODO Auto-generated method stub
        return (UserInfo) this.getCurrentSession().load(UserInfo.class, id); 
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.dao.GenericDao#get(java.io.Serializable)
     */
    public UserInfo get(Integer id) {
        // TODO Auto-generated method stub
        return (UserInfo) this.getCurrentSession().get(UserInfo.class, id);  
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.dao.GenericDao#findAll()
     */
    public List<UserInfo> findAll() {
        List<UserInfo> userInfos = this.getCurrentSession()  
                .createQuery("from UserInfo").list();  
        return userInfos;  
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.dao.GenericDao#persist(java.lang.Object)
     */
    public void persist(UserInfo entity) {
        // TODO Auto-generated method stub
        this.getCurrentSession().persist(entity);
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.dao.GenericDao#save(java.lang.Object)
     */
    public Integer save(UserInfo entity) {
        // TODO Auto-generated method stub
        return (Integer) this.getCurrentSession().save(entity); 
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.dao.GenericDao#saveOrUpdate(java.lang.Object)
     */
    public void saveOrUpdate(UserInfo entity) {
        // TODO Auto-generated method stub
        this.getCurrentSession().saveOrUpdate(entity); 
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.dao.GenericDao#delete(java.io.Serializable)
     */
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        UserInfo entity = this.load(id);  
        this.getCurrentSession().delete(entity);
    }

    /* (non-Javadoc)
     * @see com.bonc.yuan.shop.dao.GenericDao#flush()
     */
    public void flush() {
        // TODO Auto-generated method stub
        this.getCurrentSession().flush();
    }  
  
    

}

/*
 * 文件名：UserInfoServiceTest.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月25日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.yuan.shop.service;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.bonc.yuan.shop.entity.UserInfo;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年7月25日
 * @see UserInfoServiceTest
 * @since
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-hibernate.xml" })  
public class UserInfoServiceTest {
    private static final Logger LOGGER = Logger  
            .getLogger(UserInfoServiceTest.class);  
  
    @Autowired
    private UserInfoService userInfoService;  
    
    @Test
    public void testSave() {
        UserInfo userInfo = new UserInfo();  
        userInfo.setName("zty");  
        userInfo.setAge(23);  
        userInfo.setTelephone("13212221333");  
        Integer id = userInfoService.save(userInfo);  
        JSON.toJSONString(id); 
    }

}

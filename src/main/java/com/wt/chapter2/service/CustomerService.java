package com.wt.chapter2.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.wt.chapter2.model.Customer;
import com.wt.chapter2.util.PropsUtil;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * 提供客户数据服务
 */

public class CustomerService {
    private static final Logger LOGGER=LoggerFactory.getLogger(PropsUtil.class);

    private static final String Driver;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;
    static {
        Properties conf = PropsUtil.loadProps("conf.properties");
        Driver = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");
        try{
            Class.forName(Driver);
        }catch (ClassNotFoundException e){
            LOGGER.error("can not load jdbc driver"+e);
        }

    }


    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(){
        //TODO
        return null;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id){
        //todo
        return null;
    }

    /**
     *创建客户
     */
    public  boolean createCustomer(Map<String,Object> fieldMap){
        //todo
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        //todo
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id){
        //todo
        return false;
    }
}

package com.wt.chapter2.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.wt.chapter2.helper.DatabaseHelper;
import com.wt.chapter2.model.Customer;
import com.wt.chapter2.util.PropsUtil;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * 提供客户数据服务
 */

public class CustomerService {
    private static final Logger LOGGER=LoggerFactory.getLogger(PropsUtil.class);
    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(){
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id){
        String sql = "select * from Customer where id=?";
        return DatabaseHelper.queryEntity(Customer.class,sql,id);
    }

    /**
     *创建客户
     */
    public  boolean createCustomer(Map<String,Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id){
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}

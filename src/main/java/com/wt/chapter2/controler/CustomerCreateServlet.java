package com.wt.chapter2.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 创建客户
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {

    /**
     * 进入创建客户界面
     */
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
        //todo
    }
    /**
     * 处理创建客户请求
     */
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws  ServletException,IOException{
        //todo
    }
}

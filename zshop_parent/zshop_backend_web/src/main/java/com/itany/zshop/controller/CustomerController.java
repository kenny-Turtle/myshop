package com.itany.zshop.controller;

import com.itany.zshop.pojo.Customer;
import com.itany.zshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @Author zfj
 * @create 2019/8/13 10:02
 */
@Controller
@RequestMapping("/backend/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findAll")
    public String findAll(Map map){
        List<Customer> customers = customerService.findAll();
        map.put("customers",customers);
        return "customerManager";
    }
    @RequestMapping("/jump")
    public String jump(){
        return "regist";
    }
    @RequestMapping("/regist")
    public String regist(HttpServletRequest req, HttpServletResponse resp){

        //注册操作
        String realname=req.getParameter("realname");
        String registname=req.getParameter("registname");
        String password=req.getParameter("password");
        String phone=req.getParameter("phone");

        System.out.println(realname+registname+password);
        customerService.addCus(realname,registname,password,phone);

        return "mainfont";
    }





}

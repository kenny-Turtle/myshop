package com.itany.zshop.service;

import com.itany.zshop.pojo.Customer;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/13 9:58
 */
public interface CustomerService {
    public List<Customer> findAll();

    //插入
    public void addCus(String realname,String registname,String password,String phone);
}

package com.itany.zshop.dao;

import com.itany.zshop.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/13 9:54
 */
public interface CustomerDao {
    /*
    * 查询所有客户信息*/
    public List<Customer> selectAll();

    /*
    * 插入一条客户信息*/
    public void insertCus(
            @Param("realname")String realname,@Param("registname")String registname,
            @Param("password")String password,@Param("phone")String phone);





}

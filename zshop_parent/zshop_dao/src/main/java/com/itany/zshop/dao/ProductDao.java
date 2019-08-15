package com.itany.zshop.dao;

import com.itany.zshop.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/12 16:35
 */
public interface ProductDao {
    /*
    * 查询所有商品信息*/
    public List<Product> selectAll();

    /*
    * 插入一条商品信息
    * */
    public void insertOne(@Param("pid")String pid,@Param("pname")String pname,
                            @Param("price")double price);
}

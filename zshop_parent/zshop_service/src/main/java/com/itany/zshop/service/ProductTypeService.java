package com.itany.zshop.service;

import com.itany.zshop.exception.ProductTypeExistException;
import com.itany.zshop.pojo.ProductType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/12 11:22
 */
public interface ProductTypeService {
    /*
     * 查询所有商品信息
     * */
    public List<ProductType> findAll();

    /*
     * 根据id查询所有商品类型信息
     * */
    public ProductType findById(int id);

    /*
    * 根据id查询商品名称*/
    public String findNameById(int id);

    /*
     * 添加商品信息
     * 判断添加的商品类型是否已经存在
     *  如果存在，抛出异常
     * 如果不存在，则进行添加操作
     * */
    public void add(String name)throws ProductTypeExistException;

    /*
    * 根据商品名称查询商品信息*/
//    public ProductType findByName(String name);

    /*
     * 根据id修改商品类型的名称
     * */
    public void modifyName(int id,String name);
    /*
     * 根据id修改商品类型的状态
     * */
    public void modifyStatus(int id);

    /*
     * 根据id删除商品的类型
     * */
    public void removeById(int id);
}

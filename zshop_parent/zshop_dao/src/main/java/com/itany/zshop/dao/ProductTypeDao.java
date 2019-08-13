package com.itany.zshop.dao;

import com.itany.zshop.pojo.ProductType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/12 10:45
 */
public interface ProductTypeDao {
    /*
     * 查询所有商品类型信息
     * */
    public List<ProductType> selectAll();

    /*
     * 根据id查询所有商品类型信息
     * */
    public ProductType selectById(int id);

    /*
     * 根据id查询商品名称*/
    public String selectNameById(int id);

    /*
     * 根据名称查询商品信息*/
    public ProductType selectByName(String name);

    /*
     * 添加商品信息
     * */
    public void insert(@Param("name") String name, @Param("status") int status);

    /*
     * 根据id修改商品类型的名称
     * */
    public void updateName(@Param("id") int id, @Param("name") String name);

    /*
     * 根据id修改商品类型的状态
     * */
    public void updateStatus(@Param("id") int id, @Param("status") int status);

    /*
     * 根据id删除商品的类型
     * */
    public void deleteById(int id);


}

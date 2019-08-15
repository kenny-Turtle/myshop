package com.itany.zshop.service.Impl;

import com.itany.zshop.constant.ProductTypeConstant;
import com.itany.zshop.dao.ProductTypeDao;
import com.itany.zshop.exception.ProductTypeExistException;
import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/12 11:26
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeDao productTypeDao;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)

    public List<ProductType> findAll() {
        return productTypeDao.selectAll();
    }

    public ProductType findById(int id) {
        return productTypeDao.selectById(id);
    }

    public String findNameById(int id) {
        return productTypeDao.selectNameById(id);
    }


    public void add(String name) throws ProductTypeExistException {
        ProductType productType = productTypeDao.selectByName(name);
        if(productType!=null){
            throw new ProductTypeExistException("商品已存在");
        }
        productTypeDao.insert(name, ProductTypeConstant.PRODUCT_TYPE_ENABLE);
    }



    public void modifyName(int id, String name) {

    }

    public void modifyStatus(int id) {

    }

    public void removeById(int id) {

    }
}

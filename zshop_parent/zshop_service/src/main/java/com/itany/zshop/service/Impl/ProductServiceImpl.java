package com.itany.zshop.service.Impl;

import com.itany.zshop.dao.ProductDao;
import com.itany.zshop.pojo.Product;
import com.itany.zshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/12 16:54
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)

    public List<Product> findAll() {
        return productDao.selectAll();
    }
}

package com.itany.zshop.controller;

import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author zfj
 * @create 2019/8/12 15:57
 */
@Controller
@RequestMapping("/backend/productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("/findAll")
    public String findAll(Map map){
        List<ProductType> productTypes = productTypeService.findAll();
        map.put("productTypes",productTypes);
        return "productTypeManager";
    }







}

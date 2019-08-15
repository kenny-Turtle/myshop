package com.itany.zshop.controller;

import com.itany.zshop.pojo.Product;
import com.itany.zshop.service.ProductService;
import com.itany.zshop.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @Author zfj
 * @create 2019/8/12 16:47
 */
@Controller
@RequestMapping("/backend/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("/findAll")
    public String findAll(Map map){
        //读取出所有商品信息
        List<Product> products = productService.findAll();
        map.put("products",products);
        return "productManager";
    }

    @RequestMapping("/add")
    public void addOne(HttpServletRequest req){
        String pid=req.getParameter("pid");
        String pname=req.getParameter("pname");
        double price= Double.parseDouble(req.getParameter("price"));
        productService.addOne(pid,pname,price);

//        return "productManager";
    }
}

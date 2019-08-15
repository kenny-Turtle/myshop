package com.itany.zshop.controller;

import com.itany.zshop.constant.ResponseStatusConstant;
import com.itany.zshop.exception.ProductTypeExistException;
import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.ProductTypeService;
import com.itany.zshop.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    /*@RequestMapping("/add")//返回的类型就是响应对象
    public ResponseResult add(HttpServletRequest req){

        ResponseResult result=new ResponseResult();
        String name=req.getParameter("name");
        try {
            productTypeService.add(name);
            result.setStatus(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS);
            result.setMessage("添加成功");
        } catch (ProductTypeExistException e) {
//            e.printStackTrace();
            result.setStatus((ResponseStatusConstant.RESPONSE_STATUS_FAIL));
            result.setMessage(e.getMessage());
        }
        return  result;
    }*/

    @RequestMapping("/add")
    public void add(HttpServletRequest req){
        String name=req.getParameter("name");

        try {
            productTypeService.add(name);
        } catch (ProductTypeExistException e) {
            e.printStackTrace();
        }
    }








}

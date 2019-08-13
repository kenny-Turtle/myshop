package com.itany.zshop.controller;

import com.itany.zshop.pojo.Sysuser;
import com.itany.zshop.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/12 15:58
 */
@Controller
@RequestMapping("/backend/sysuser")
public class SysuserController {

    @Autowired
    private SysuserService sysuserService;

    @RequestMapping("/login")
    public String login(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println("用户名："+username+"。密码："+password);
        Sysuser s=sysuserService.findLogin(username,password);
        if(s!=null){
            return "main";
        }else{
            req.setAttribute("errors","errors");
            return "login";
        }



    }

}

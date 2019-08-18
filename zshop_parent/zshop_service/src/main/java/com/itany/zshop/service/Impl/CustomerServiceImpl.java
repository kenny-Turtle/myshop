package com.itany.zshop.service.Impl;

import com.itany.zshop.dao.CustomerDao;
import com.itany.zshop.pojo.Customer;
import com.itany.zshop.service.CustomerService;
import com.itany.zshop.vo.PasswordVo;
import org.apache.shiro.authc.credential.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/13 9:59
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private PasswordService passwordService;


    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Customer> findAll() {
        return customerDao.selectAll();
    }

    public void addCus(String realname, String registname, String password,String phone) {

        //对密码进行加密
        PasswordVo passwordVo=new PasswordVo();
        passwordVo.setPassword(password);
        passwordVo.setSalt(registname);

        String encryptPassword=passwordService.encryptPassword(passwordVo);

        customerDao.insertCus(realname,registname,encryptPassword,phone);
    }


}

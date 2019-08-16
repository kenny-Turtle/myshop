package com.itany.zshop.service.Impl;

import com.itany.zshop.dao.SysuserDao;
import com.itany.zshop.pojo.Sysuser;
import com.itany.zshop.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/13 10:47
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class SysuserServiceImpl implements SysuserService {

    @Autowired
    private SysuserDao sysuserDao;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)

    public Sysuser findLogin(String login_name,String password) {
        return sysuserDao.selectLogin(login_name,password);
    }
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Sysuser> findAll() {
        return sysuserDao.selectAll();
    }

    public void addOne(String name, String login_name, String password, String phone, String email) {
        sysuserDao.insertOne(name,login_name,password,phone,email);
    }




}

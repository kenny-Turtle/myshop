package com.itany.zshop.service;

import com.itany.zshop.pojo.Sysuser;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/13 10:46
 */
public interface SysuserService {
    public Sysuser findLogin(String login_name,String password);

    public List<Sysuser> findAll();
}

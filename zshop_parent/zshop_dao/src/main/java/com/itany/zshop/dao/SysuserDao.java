package com.itany.zshop.dao;

import com.itany.zshop.pojo.Sysuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/8/13 10:39
 */
public interface SysuserDao {
    /*
    * 先拿出所有的管理员信息*/
    public List<Sysuser> selectAll();

    /*
    * 登录操作*/
    public Sysuser selectLogin(
            @Param("login_name")String login_name,@Param("password")String password);
}

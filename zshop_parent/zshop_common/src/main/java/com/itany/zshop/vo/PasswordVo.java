package com.itany.zshop.vo;

import java.io.Serializable;

/**
 * @Author zfj
 * @create 2019/8/18 9:26
 */
public class PasswordVo implements Serializable {

    private String password;
    private String salt;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}

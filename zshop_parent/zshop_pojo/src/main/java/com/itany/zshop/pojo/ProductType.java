package com.itany.zshop.pojo;

import java.io.Serializable;

/**
 * @Author zfj
 * @create 2019/7/31 12:48
 */
public class ProductType implements Serializable {
    private Integer id;
    private String name;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

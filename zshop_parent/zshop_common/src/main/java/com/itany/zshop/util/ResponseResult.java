package com.itany.zshop.util;

/**
 * @Author zfj
 * @create 2019/8/14 10:09
 */
public class ResponseResult {

    //响应的状态码
    private int status;
    //响应消息
    private String message;
    //响应数据
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

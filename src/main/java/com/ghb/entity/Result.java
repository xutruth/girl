package com.ghb.entity;

/**
 *
 * http请求返回的最外层对象
 * Created by ASUS on 2017/5/4.
 */
public class Result <T>{
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String meg;
    /**
     * 具体的内容
     */
    private  T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

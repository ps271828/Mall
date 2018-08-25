package com.ps.common;

import java.io.Serializable;

/**
 * @Author:panshuang
 * @Data:2018/8/21 22:36
 * @Description:
 */
public class ResultData <T> implements Serializable {
    private Integer code;

    private String info;

    private T data;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

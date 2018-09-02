package com.ps.model;

import com.ps.common.BaseModel;

import java.io.Serializable;

/**
 * @Author:panshuang
 * @Data:2018/8/16 21:56
 * @Description:测试用类
 */
public class User extends BaseModel {
    private Long id;

    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

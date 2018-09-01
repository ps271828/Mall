package com.ps.model;

import com.ps.common.BaseModel;

import java.io.Serializable;

/**
 * @Author:panshuang
 * @Data:2018/8/16 21:56
 * @Description:测试用类
 */
public class User extends BaseModel {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

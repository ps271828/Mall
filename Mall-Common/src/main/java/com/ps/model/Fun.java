package com.ps.model;

import com.ps.common.BaseModel;

/**
 * @Author:panshuang
 * @Data:2018/9/1 15:40
 * @Description:功能实体类
 */
public class Fun extends BaseModel {

    /**
     * 功能id
     */
    private Integer id;

    /**
     * 功能名称
     */
    private String funName;

    /**
     * 是否菜单
     */
    private Integer isMoudle;

    /**
     * 功能url
     */
    private String funUrl;

    /**
     * 功能路径
     */
    private String funPath;

    /**
     * 是否禁用
     */
    private String isDisable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName;
    }

    public Integer getIsMoudle() {
        return isMoudle;
    }

    public void setIsMoudle(Integer isMoudle) {
        this.isMoudle = isMoudle;
    }

    public String getFunUrl() {
        return funUrl;
    }

    public void setFunUrl(String funUrl) {
        this.funUrl = funUrl;
    }

    public String getFunPath() {
        return funPath;
    }

    public void setFunPath(String funPath) {
        this.funPath = funPath;
    }

    public String getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(String isDisable) {
        this.isDisable = isDisable;
    }
}

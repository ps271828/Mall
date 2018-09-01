package com.ps.model;

import com.ps.common.BaseModel;

/**
 * @Author:panshuang
 * @Data:2018/9/1 15:36
 * @Description:角色实体类
 */
public class Role extends BaseModel {

    /**
     * 角色主键
     */
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 是否禁用
     */
    private Integer isDisable;

    public Integer getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }
}

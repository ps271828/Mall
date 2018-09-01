package com.ps.model;

import com.ps.common.BaseModel;

/**
 * @Author:panshuang
 * @Data:2018/9/1 15:48
 * @Description:角色功能实体类
 */
public class RoleFun extends BaseModel {

    /**
     * 角色功能关联表id
     */
    private Integer id;

    /**
     * 是否禁用
     */
    private Integer isDisable;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 功能id
     */
    private Integer funId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFunId() {
        return funId;
    }

    public void setFunId(Integer funId) {
        this.funId = funId;
    }
}

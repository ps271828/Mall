package com.ps.model;

import com.ps.common.BaseModel;

/**
 * @Author:panshuang
 * @Data:2018/9/1 15:44
 * @Description:用户角色实体类
 */
public class UserRole extends BaseModel {

    /**
     * 用户角色表关联id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 是否禁用
     */
    private Integer isDisable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }
}

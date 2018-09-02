package com.ps.service;

import com.ps.model.Role;

import java.util.List;

/**
 * @Author:panshuang
 * @Data:2018/9/2 16:02
 * @Description:角色服务接口
 */
public interface IRoleServeice {

    /**
     * 通过用户id获取相应的角色id列表
     * @param roleIdList
     */
    List<Role> getRoleListByRoleIdLisr(List<Integer> roleIdList);
}

package com.ps.service;

import com.ps.model.Role;

import java.util.List;

/**
 * @Author:panshuang
 * @Data:2018/9/2 17:14
 * @Description:
 */
public interface IUserRoleService {

    /**
     * 通过用户id获取相应的角色id列表
     * @param userId
     */
    List<Integer> getRoleIdListByUserId(Long userId);
}

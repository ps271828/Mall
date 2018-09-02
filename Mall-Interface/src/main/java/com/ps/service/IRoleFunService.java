package com.ps.service;

import com.ps.model.Role;

import java.util.List;

/**
 * @Author:panshuang
 * @Data:2018/9/2 17:15
 * @Description:
 */
public interface IRoleFunService {

    /**
     * 通过角色id列表获取相应的功能id列表
     * @param roleIdList
     */
    List<Integer> getFunIdListByRoleIdList(List<Integer> roleIdList);
}

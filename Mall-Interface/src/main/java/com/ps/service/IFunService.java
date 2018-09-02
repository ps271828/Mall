package com.ps.service;

import com.ps.model.Fun;

import java.util.List;

/**
 * @Author:panshuang
 * @Data:2018/9/2 16:06
 * @Description:功能相关接口
 */
public interface IFunService {

    /**
     * 通过角色id获取相应的功能列表
     * @param roleId
     * @return
     */
    List<Fun> getFunByRoleId(Integer roleId);

}

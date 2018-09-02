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
     * 通过功能id列表获取相应的功能列表
     * @param funIdList
     * @return
     */
    List<Fun> getFunByRoleId(List<Integer> funIdList);

}

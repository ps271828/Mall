package com.ps.Impl;

import com.ps.model.Fun;
import com.ps.service.IFunService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:panshuang
 * @Data:2018/9/2 16:19
 * @Description:功能相关服务
 */
@Service
public class FunServiceImpl implements IFunService, Serializable {

    @Override
    public List<Fun> getFunByRoleId(Integer roleId) {
        return null;
    }
}

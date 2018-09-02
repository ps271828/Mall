package com.ps.Impl;

import com.ps.model.Role;
import com.ps.service.IRoleServeice;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:panshuang
 * @Data:2018/9/2 16:19
 * @Description:角色相关服务
 */
@Service
public class RoleServiceImpl implements IRoleServeice, Serializable {
    @Override
    public List<Role> getRoleListByRoleIdLisr(List<Integer> roleIdList) {
        return null;
    }
}

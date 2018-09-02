package com.ps.Impl;

import com.ps.model.User;
import com.ps.service.IUserService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @Author:panshuang
 * @Data:2018/9/2 17:27
 * @Description:
 */
@Service
public class UserRoleServiceImpl implements IUserService, Serializable {
    @Override
    public User selectUserById(Integer id) {
        return null;
    }
}

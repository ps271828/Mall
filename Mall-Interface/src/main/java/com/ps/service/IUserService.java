package com.ps.service;

import com.ps.model.User;

import java.io.Serializable;

/**
 * @Author:panshuang
 * @Data:2018/8/19 18:55
 * @Description:测试服务注册
 */
public interface IUserService {

    User selectUserById(Integer id);
}

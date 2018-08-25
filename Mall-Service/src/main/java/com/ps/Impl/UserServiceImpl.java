package com.ps.Impl;

import com.ps.dao.UserDao;
import com.ps.model.User;
import com.ps.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @Author:panshuang
 * @Data:2018/8/19 18:58
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService, Serializable {

    private Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Resource
    private UserDao userDao;

    @Override
    public User selectUserById(Integer id) {
        logger.info("远程服务调用成功！");
        System.out.println(1);
        User user = new User();
        user.setId(1);
        return userDao.getUser(user);
    }
}

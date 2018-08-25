package com.ps.dao;

import com.ps.base.BaseDao;
import com.ps.model.User;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @Author:panshuang
 * @Data:2018/8/16 22:17
 * @Description:
 */
@Repository
public class UserDao extends BaseDao implements Serializable {
    public User getUser(User user){
        return  this.getSqlSession().selectOne("UserMapper.selectUserById", user);
    }
}

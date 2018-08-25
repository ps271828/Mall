package com.ps.base;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;

/**
 * @Author:panshuang
 * @Data:2018/8/16 22:34
 * @Description:
 */
public abstract class BaseDao extends SqlSessionDaoSupport {

    @Resource(name="sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}

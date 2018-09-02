package com.ps.dao;

import com.ps.base.BaseDao;
import com.ps.model.Fun;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:panshuang
 * @Data:2018/9/2 16:23
 * @Description:功能相关查询dao
 */
@Repository
public class FunDao extends BaseDao {

    /**
     * 通过funId的集合查询相关功能列表
     * @param funIdList
     * @return
     */
    public List<Fun> selectFunListByFunIdList(List<Integer> funIdList){
        return getSqlSession().selectList("FunMapper.selectFunListByFunIdList",funIdList);
    }
}

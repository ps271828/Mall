package com.ps.dao;

import com.ps.base.BaseDao;
import com.ps.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:panshuang
 * @Data:2018/9/2 16:23
 * @Description:角色相关查询DAO
 */
@Repository
public class RoleDao extends BaseDao {

    /**
     * 通过角色id列表查询角色列表
     * @param roleIdList
     * @return
     */
    public List<Role> selectRoleListByRoleIdList(List<Integer> roleIdList){
        return getSqlSession().selectList("RoleMapper.selectRoleListByRoleIdList", roleIdList);
    }
}

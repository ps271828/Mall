package com.ps.Impl;

import com.ps.service.IRoleFunService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:panshuang
 * @Data:2018/9/2 17:28
 * @Description:
 */
@Service
public class RoleFunServiceImpl implements IRoleFunService, Serializable {
    @Override
    public List<Integer> getFunIdListByRoleIdList(List<Integer> roleIdList) {
        return null;
    }
}

package com.ps.common;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:panshuang
 * @Data:2018/9/1 15:27
 * @Description:基类model，集成共有的属性
 */
public class BaseModel implements Serializable {

    /**
     * 是否删除
     */
    private Integer isDel;

    /**
     * 更新人id
     */
    private Long updateUserId;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人id
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 分页起始位置
     */
    private Integer pageStart;

    /**
     * 分页页面大小
     */

    public int getIsDel() {
        return isDel;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Integer getPageStart() {
        return pageStart;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    private Integer pageNum;

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}

package com.learn.springmybatis.entity.test;

import java.io.Serializable;
import java.util.Date;

/**
 * wanghongbo
 * 用于ACC视频指导任务
 * 20210827
 */


public class AccVideoGuideentity implements Serializable {

    //视频开始时间
    private Date createTime;

    //视频结束时间
    private Date updateTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "AccVideoGuideentity{" +
                "createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

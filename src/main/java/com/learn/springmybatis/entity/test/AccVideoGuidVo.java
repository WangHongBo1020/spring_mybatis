package com.learn.springmybatis.entity.test;

import java.io.Serializable;
import java.util.Date;

public class AccVideoGuidVo implements Serializable {

    //首次连线时间
    private Date firstconnectDate;

    private String cumulativeTime;
    //视频链接次数
    private String videoconnectDegree;

    //任务状态
    private String status;

    public Date getFirstconnectDate() {
        return firstconnectDate;
    }

    public void setFirstconnectDate(Date firstconnectDate) {
        this.firstconnectDate = firstconnectDate;
    }

    public String getCumulativeTime() {
        return cumulativeTime;
    }

    public void setCumulativeTime(String cumulativeTime) {
        this.cumulativeTime = cumulativeTime;
    }


    public String getVideoconnectDegree() {
        return videoconnectDegree;
    }

    public void setVideoconnectDegree(String videoconnectDegree) {
        this.videoconnectDegree = videoconnectDegree;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AccVideoGuidVo{" +
                "firstconnectDate=" + firstconnectDate +
                ", cumulativeTime='" + cumulativeTime + '\'' +
                ", videoconnectDegree='" + videoconnectDegree + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

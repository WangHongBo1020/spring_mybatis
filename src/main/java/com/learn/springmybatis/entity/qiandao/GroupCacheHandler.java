package com.learn.springmybatis.entity.qiandao;

/**
 * com.video.bean.signbean
 *
 * @Author wujiyao
 * @create 2021 2021/5/25 18:23
 */
public class GroupCacheHandler {

    private Long serialNo;
    private String groupId;
    private String userCode;
    private String isVideo; //是否多人视频协查呼叫预备 0: 是; 1:否

    public Long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(String isVideo) {
        this.isVideo = isVideo;
    }

    @Override
    public String toString() {
        return "GroupCacheHandler{" +
                "serialNo=" + serialNo +
                ", groupId='" + groupId + '\'' +
                ", userCode='" + userCode + '\'' +
                ", isVideo='" + isVideo + '\'' +
                '}';
    }
}

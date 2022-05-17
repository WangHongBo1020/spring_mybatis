package com.learn.springmybatis.entity.test;


import java.io.Serializable;
import java.util.Date;

/**
 * wanghongbo
 * 2021-09-24 15:37:55
 * 广爱需求
 */
public class GuangAiInfo implements Serializable {

    private static final long serialVersionUID = 1;

    /**
     * 事故号
     */
    private String caseNo;
    /**
     * 报案号
     */
    private String claimNo;
    /**
     * 报案人
     */
    private String notifyMan;
    /**
     * 报案时间
     */
    private String notifyTime;
    /**
     * 出险时间
     */
    private String damageDate;
    /**
     * 立案时间
     */
    private Date openTime;
    /**
     * 结案时间;
     */
    private String closeTime;
    /**
     * 交强险赔案状态;
      */
    private String bzStatus;
    /**
     * 商业险赔案状态;
     */
    private String bsStatus;
    /**
     * 标的车辆号牌号码;
     */
    private String licenseNo;
    /**
     * 标的车辆号牌种类代码
     */
    private String licenseType;
    /**
     * 交强险赔款总额(已决+准备金)
     */
    private String bzPayAmount;
    /**
     * 商业险赔款总额(已决+准备金)
     */
    private String bsPayAmount;

    /**
     * 赔案性质：1强制2新商业
     */
    private String claimtype;

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getNotifyMan() {
        return notifyMan;
    }

    public void setNotifyMan(String notifyMan) {
        this.notifyMan = notifyMan;
    }

    public String getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(String notifyTime) {
        this.notifyTime = notifyTime;
    }

    public String getDamageDate() {
        return damageDate;
    }

    public void setDamageDate(String damageDate) {
        this.damageDate = damageDate;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getBzStatus() {
        return bzStatus;
    }

    public void setBzStatus(String bzStatus) {
        this.bzStatus = bzStatus;
    }

    public String getBsStatus() {
        return bsStatus;
    }

    public void setBsStatus(String bsStatus) {
        this.bsStatus = bsStatus;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getBzPayAmount() {
        return bzPayAmount;
    }

    public void setBzPayAmount(String bzPayAmount) {
        this.bzPayAmount = bzPayAmount;
    }

    public String getBsPayAmount() {
        return bsPayAmount;
    }

    public void setBsPayAmount(String bsPayAmount) {
        this.bsPayAmount = bsPayAmount;
    }

    public String getClaimtype() {
        return claimtype;
    }

    public void setClaimtype(String claimtype) {
        this.claimtype = claimtype;
    }

    public String getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo;
    }
}

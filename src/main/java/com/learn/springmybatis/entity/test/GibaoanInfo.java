package com.learn.springmybatis.entity.test;

import java.io.Serializable;

public class GibaoanInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报案号
     */
    private String claimNo;
    /**
     * 保单号
     */
    private String PolicyNo;

    /**
     * 交强险保单号
     */
    private String bzPolicyNo;
    /**
     * 商业险保单号
     */
    private String bsPolicyNo;
    /**
     * 事故号
     */
    private String caseNo;
    /**
     * 交强险报案号
     */
    private String bzClaimNo;
    /**
     * 商业险报案号
     */
    private String bsClaimNo;
    /**
     * 报案时间
     */
    private String notifyDate;
    /**
     * 出险标的车号牌号码
     */
    private String plateNo;
    /**
     * 出险时间
     */
    private String damageTime;
    /**
     * 出险地点
     */
    private String damageAddress;
    /**
     * 出险经过
     */
    private String damageCase;
    /**
     * 出险车架号
     */
    private String vin;
    /**
     * 出险标的车驾驶证号码
     */
    private String driveNo;
    /**
     * 事故省份城市
     */
    private String provinceCode;
    /**
     * 案件状态
     */
    private String status;
    /**
     * 事故类型
     */
    private String lossType;
    /**
     * 人伤情况
     */
    private String manLossType;
    /**
     * 报案人手机号
     */
    private String mobile;

    /**
     * 报案人
     */
    private String notifyman;
    /**
     *赔案性质：1强制2新商业
     */
    private String claimtype;


    public String getClaimtype() {
        return claimtype;
    }

    public void setClaimtype(String claimtype) {
        this.claimtype = claimtype;
    }

    public String getNotifyman() {
        return notifyman;
    }

    public void setNotifyman(String notifyman) {
        this.notifyman = notifyman;
    }

    public String getBzPolicyNo() {
        return bzPolicyNo;
    }

    public void setBzPolicyNo(String bzPolicyNo) {
        this.bzPolicyNo = bzPolicyNo;
    }

    public String getBsPolicyNo() {
        return bsPolicyNo;
    }

    public void setBsPolicyNo(String bsPolicyNo) {
        this.bsPolicyNo = bsPolicyNo;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getBzClaimNo() {
        return bzClaimNo;
    }

    public void setBzClaimNo(String bzClaimNo) {
        this.bzClaimNo = bzClaimNo;
    }

    public String getBsClaimNo() {
        return bsClaimNo;
    }

    public void setBsClaimNo(String bsClaimNo) {
        this.bsClaimNo = bsClaimNo;
    }

    public String getNotifyDate() {
        return notifyDate;
    }

    public void setNotifyDate(String notifyDate) {
        this.notifyDate = notifyDate;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getDamageTime() {
        return damageTime;
    }

    public void setDamageTime(String damageTime) {
        this.damageTime = damageTime;
    }

    public String getDamageAddress() {
        return damageAddress;
    }

    public void setDamageAddress(String damageAddress) {
        this.damageAddress = damageAddress;
    }

    public String getDamageCase() {
        return damageCase;
    }

    public void setDamageCase(String damageCase) {
        this.damageCase = damageCase;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDriveNo() {
        return driveNo;
    }

    public void setDriveNo(String driveNo) {
        this.driveNo = driveNo;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLossType() {
        return lossType;
    }

    public void setLossType(String lossType) {
        this.lossType = lossType;
    }

    public String getManLossType() {
        return manLossType;
    }

    public void setManLossType(String manLossType) {
        this.manLossType = manLossType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo;
    }

    public String getPolicyNo() {
        return PolicyNo;
    }

    public void setPolicyNo(String policyNo) {
        PolicyNo = policyNo;
    }

    @Override
    public String toString() {
        return "GibaoanInfo{" +
                "claimNo='" + claimNo + '\'' +
                ", PolicyNo='" + PolicyNo + '\'' +
                ", bzPolicyNo='" + bzPolicyNo + '\'' +
                ", bsPolicyNo='" + bsPolicyNo + '\'' +
                ", caseNo='" + caseNo + '\'' +
                ", bzClaimNo='" + bzClaimNo + '\'' +
                ", bsClaimNo='" + bsClaimNo + '\'' +
                ", notifyDate='" + notifyDate + '\'' +
                ", plateNo='" + plateNo + '\'' +
                ", damageTime='" + damageTime + '\'' +
                ", damageAddress='" + damageAddress + '\'' +
                ", damageCase='" + damageCase + '\'' +
                ", vin='" + vin + '\'' +
                ", driveNo='" + driveNo + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", status='" + status + '\'' +
                ", lossType='" + lossType + '\'' +
                ", manLossType='" + manLossType + '\'' +
                ", mobile='" + mobile + '\'' +
                ", notifyman='" + notifyman + '\'' +
                ", claimtype='" + claimtype + '\'' +
                '}';
    }
}

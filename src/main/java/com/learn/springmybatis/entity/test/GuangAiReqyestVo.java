package com.learn.springmybatis.entity.test;

import java.io.Serializable;

/**
 * wanghongbo
 * 2021-09-24 15:37:55
 * 广爱需求
 */

public class GuangAiReqyestVo implements Serializable {

    /**
     * 保单号
     */
    private String policyNo;
    /**
     * 车架号
     */
    private String vin;
    /**
     * 车牌号
     */
    private String plateNo;
    /**
     * 发动机号
     */
    private String engineNo;
    /**
     * 事故号
     */
    private String caseNo;

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }
}

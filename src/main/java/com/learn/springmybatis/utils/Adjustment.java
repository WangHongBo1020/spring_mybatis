package com.learn.springmybatis.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * \* User: wanghongbo
 * \* Date: 2021/05/25
 * \* Time: 16:09
 * \
 */
@Data
public class Adjustment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 理算编码
     */
    private String adjustmentCode;

    /**
     * 核赔意见
     */
    private String underWriteDesc;

    /**
     * 赔偿金额(含施救费)
     */
    private String claimAmount;

    /**
     * 理算核赔通过时间；精确到分
     */
    private String underWriteEndTime;


    public String getAdjustmentCode() {
        return adjustmentCode;
    }

    public void setAdjustmentCode(String adjustmentCode) {
        this.adjustmentCode = adjustmentCode;
    }

    public String getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getUnderWriteDesc() {
        return underWriteDesc;
    }

    public void setUnderWriteDesc(String underWriteDesc) {
        this.underWriteDesc = underWriteDesc;
    }

    public String getUnderWriteEndTime() {
        return underWriteEndTime;
    }

    public void setUnderWriteEndTime(String underWriteEndTime) {
        this.underWriteEndTime = underWriteEndTime;
    }
}

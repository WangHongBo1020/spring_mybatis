package com.learn.springmybatis.entity.lossdetertorisk.requestModel;

import java.math.BigDecimal;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.requestModel
 * Ai 风控请求参数
 * @Author wujiyao
 * @create 2021 2021/4/23 19:58
 */
public class PartsInfo {

    private String reqID;  // 配件 id
    private String reqPartNo;  // 配件 oe 号
    private BigDecimal reqPartPrice;  // 配件询价价格
    private String reqPartName;  // 配件名称
    private String req4sPrice;  // 4s 店价格
    private String reqSeq;  //排序序号，正整数

    public String getReqID() {
        return reqID;
    }

    public void setReqID(String reqID) {
        this.reqID = reqID;
    }

    public String getReqPartNo() {
        return reqPartNo;
    }

    public void setReqPartNo(String reqPartNo) {
        this.reqPartNo = reqPartNo;
    }

    public BigDecimal getReqPartPrice() {
        return reqPartPrice;
    }

    public void setReqPartPrice(BigDecimal reqPartPrice) {
        this.reqPartPrice = reqPartPrice;
    }

    public String getReqPartName() {
        return reqPartName;
    }

    public void setReqPartName(String reqPartName) {
        this.reqPartName = reqPartName;
    }

    public String getReq4sPrice() {
        return req4sPrice;
    }

    public void setReq4sPrice(String req4sPrice) {
        this.req4sPrice = req4sPrice;
    }

    public String getReqSeq() {
        return reqSeq;
    }

    public void setReqSeq(String reqSeq) {
        this.reqSeq = reqSeq;
    }

    @Override
    public String toString() {
        return "PartsInfo{" +
                "reqID='" + reqID + '\'' +
                ", reqPartNo='" + reqPartNo + '\'' +
                ", reqPartPrice=" + reqPartPrice +
                ", reqPartName='" + reqPartName + '\'' +
                ", req4sPrice='" + req4sPrice + '\'' +
                ", reqSeq='" + reqSeq + '\'' +
                '}';
    }
}

package com.learn.springmybatis.entity.lossdetertorisk.responseModel;

import java.awt.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.responseModel
 * AI风控：单个配件的信息
 * @Author wujiyao
 * @create 2021 2021/4/23 20:19
 */
public class PartInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String repPartsInfoId; //配件列表信息ID
    private String standardPartNo; // 是 明觉提供 oe
    private BigDecimal standardPrice; // 是 明觉提供价格
    private String standardPartName; // 是 明觉标准名
    private String riskFlag; // 是 风险标识
    private BigDecimal standardPartPrice; // 是 明觉提供标准折前价格
    private BigDecimal discountPartPrice; // 是 明觉提供折后价格
    private List<ChildParts> childParts;// 是 局部件列表
    private String image;// 是 加密图片名

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRepPartsInfoId() {
        return repPartsInfoId;
    }

    public void setRepPartsInfoId(String repPartsInfoId) {
        this.repPartsInfoId = repPartsInfoId;
    }

    public String getStandardPartNo() {
        return standardPartNo;
    }

    public void setStandardPartNo(String standardPartNo) {
        this.standardPartNo = standardPartNo;
    }

    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    public String getStandardPartName() {
        return standardPartName;
    }

    public void setStandardPartName(String standardPartName) {
        this.standardPartName = standardPartName;
    }

    public String getRiskFlag() {
        return riskFlag;
    }

    public void setRiskFlag(String riskFlag) {
        this.riskFlag = riskFlag;
    }

    public BigDecimal getStandardPartPrice() {
        return standardPartPrice;
    }

    public void setStandardPartPrice(BigDecimal standardPartPrice) {
        this.standardPartPrice = standardPartPrice;
    }

    public BigDecimal getDiscountPartPrice() {
        return discountPartPrice;
    }

    public void setDiscountPartPrice(BigDecimal discountPartPrice) {
        this.discountPartPrice = discountPartPrice;
    }

    public List<ChildParts> getChildParts() {
        return childParts;
    }

    public void setChildParts(List<ChildParts> childParts) {
        this.childParts = childParts;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "PartInfo{" +
                "id='" + id + '\'' +
                ", repPartsInfoId='" + repPartsInfoId + '\'' +
                ", standardPartNo='" + standardPartNo + '\'' +
                ", standardPrice='" + standardPrice + '\'' +
                ", standardPartName='" + standardPartName + '\'' +
                ", riskFlag='" + riskFlag + '\'' +
                ", standardPartPrice='" + standardPartPrice + '\'' +
                ", discountPartPrice='" + discountPartPrice + '\'' +
                ", childParts=" + childParts +
                ", image=" + image +
                '}';
    }
}

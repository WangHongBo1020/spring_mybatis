package com.learn.springmybatis.entity.lossdetertorisk.responseModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.responseModel
 * AI风控： 配件列表信息
 * @Author wujiyao
 * @create 2021 2021/4/23 20:16
 */
public class RepPartsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String dataId; //主表ID
    private List<PartInfo> partsInfo;// 是 单个配件的信息
    private String reqId; // 是 配件 id
    private String reqPartNo; // 是 配件 oe
    private BigDecimal reqPartPrice;//  是 配件询价价格
    private String reqPartName; // 是 配件名称
    private BigDecimal reqPart4s; // 是 4s 店价格

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public List<PartInfo> getPartsInfo() {
        return partsInfo;
    }

    public void setPartsInfo(List<PartInfo> partsInfo) {
        this.partsInfo = partsInfo;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
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

    public BigDecimal getReqPart4s() {
        return reqPart4s;
    }

    public void setReqPart4s(BigDecimal reqPart4s) {
        this.reqPart4s = reqPart4s;
    }

    @Override
    public String toString() {
        return "RepPartsInfo{" +
                "id='" + id + '\'' +
                ", dataId='" + dataId + '\'' +
                ", partInfo=" + partsInfo +
                ", reqID='" + reqId + '\'' +
                ", reqPartNo='" + reqPartNo + '\'' +
                ", reqPartPrice=" + reqPartPrice +
                ", reqPartName='" + reqPartName + '\'' +
                ", reqPart4s=" + reqPart4s +
                '}';
    }
}

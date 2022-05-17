package com.learn.springmybatis.entity.lossdetertorisk.responseModel;

import java.io.Serializable;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.responseModel
 * AI风控： 局部件列表
 * @Author wujiyao
 * @create 2021 2021/4/23 20:20
 */
public class ChildParts implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String partInfoId; //单个配件的信息
    private String reqId; // 是 对应局部件的请求配件 ID
    private String standardPartNo; // 是 对应局部件的标准 oe

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartInfoId() {
        return partInfoId;
    }

    public void setPartInfoId(String partInfoId) {
        this.partInfoId = partInfoId;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getStandardPartNo() {
        return standardPartNo;
    }

    public void setStandardPartNo(String standardPartNo) {
        this.standardPartNo = standardPartNo;
    }

    @Override
    public String toString() {
        return "ChildParts{" +
                "id='" + id + '\'' +
                ", partInfoId='" + partInfoId + '\'' +
                ", reqID='" + reqId + '\'' +
                ", standardPartNo='" + standardPartNo + '\'' +
                '}';
    }
}

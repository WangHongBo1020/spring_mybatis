package com.learn.springmybatis.entity.lossdetertorisk.responseModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.responseModel
 * AI风控：
 * @Author wujiyao
 * @create 2021 2021/4/23 20:08
 */
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private List<RepPartsInfo> repPartsInfo; // 是 配件列表信息
    private String url; // 是 页面地址
    private String brandClass; // 是 前缀
    private List<Vehicle> vehicle; // 是 车辆相关信息
    private boolean roughFlag; // 是 解析标识（Ture/False）
    private Long estimateno;
    private String caseno;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<RepPartsInfo> getRepPartsInfo() {
        return repPartsInfo;
    }

    public void setRepPartsInfo(List<RepPartsInfo> repPartsInfo) {
        this.repPartsInfo = repPartsInfo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBrandClass() {
        return brandClass;
    }

    public void setBrandClass(String brandClass) {
        this.brandClass = brandClass;
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isRoughFlag() {
        return roughFlag;
    }

    public void setRoughFlag(boolean roughFlag) {
        this.roughFlag = roughFlag;
    }

    public Long getEstimateno() {
        return estimateno;
    }

    public void setEstimateno(Long estimateno) {
        this.estimateno = estimateno;
    }

    public String getCaseno() {
        return caseno;
    }

    public void setCaseno(String caseno) {
        this.caseno = caseno;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", repPartsInfo=" + repPartsInfo +
                ", url='" + url + '\'' +
                ", brandClass='" + brandClass + '\'' +
                ", vehicle=" + vehicle +
                ", roughFlag=" + roughFlag +
                '}';
    }
}

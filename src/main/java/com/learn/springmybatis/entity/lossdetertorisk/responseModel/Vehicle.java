package com.learn.springmybatis.entity.lossdetertorisk.responseModel;

import java.io.Serializable;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.responseModel
 *  AI 风控返回报文：车辆相关信息
 * @Author wujiyao
 * @create 2021 2021/4/23 20:07
 */
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String dataId; //主表ID
    private String vinCode ; // Vin 码
    private String transmission ; // 变速箱
    private String vehicleChn ; // 车系
    private String displacement ; // 排量车系
    private String aiYear; // 年款
    private String year; // 年款
    private String subBrand ; // 汽车品

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

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getVehicleChn() {
        return vehicleChn;
    }

    public void setVehicleChn(String vehicleChn) {
        this.vehicleChn = vehicleChn;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getAiYear() {
        return aiYear;
    }

    public void setAiYear(String aiYear) {
        this.aiYear = aiYear;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSubBrand() {
        return subBrand;
    }

    public void setSubBrand(String subBrand) {
        this.subBrand = subBrand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", dataId='" + dataId + '\'' +
                ", vinCode='" + vinCode + '\'' +
                ", transmission='" + transmission + '\'' +
                ", vehicleChn='" + vehicleChn + '\'' +
                ", displacement='" + displacement + '\'' +
                ", aiYear='" + aiYear + '\'' +
                ", year='" + year + '\'' +
                ", subBrand='" + subBrand + '\'' +
                '}';
    }
}

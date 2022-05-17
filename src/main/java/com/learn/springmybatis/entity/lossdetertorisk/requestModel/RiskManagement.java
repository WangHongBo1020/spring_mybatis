package com.learn.springmybatis.entity.lossdetertorisk.requestModel;

import java.util.List;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.requestModel
 * Ai 风控请求参数
 * @Author wujiyao
 * @create 2021 2021/4/23 20:01
 */
public class RiskManagement {

    private String caseNo; // 报案号
    private String bussinessId ; // 用户 id
    private String vinCode; // vin 码
    private String queryTime; // 请求的时间
    private String standardQueryId; // 本次请求的 id
    private String repairType; // 修理厂类型 （综合修理 厂，4s 店）© 明觉科技（北京）有限公司
    private String repairName; // 修理厂名称
    private List<PartsInfo> partsInfo; // 配件列表信息
    private String priceType; // 价格方案 （001，002，003，005）
    private String vehicleId; // 车辆 id
    private String vehicleType; // 车辆类型 （标的/三者）
    private Boolean pageFlag; // 页面标识 (true/false)
    private String plateNo; // 车牌号
    private String vehicleShopName; // 车商名称
    private Boolean cooperativeRepairFlag; // ; //; //合作修理厂 (true/false)
    private String repairBrands; // 维修品牌范围
    private String vehicleShopDiscount; // 车商折扣系数
    private String role; // 用户角色
    private String roleSecondOrganization; // 所属二级机构
    private String roleThirdOrganization; // 所属三级机构
    private String status; // 状态（查勘、核损、核 价、核损通过）
    private String userId; // 用户 UM 账号
    private String userName; // 用户姓名

    public String getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(String bussinessId) {
        this.bussinessId = bussinessId;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public String getStandardQueryId() {
        return standardQueryId;
    }

    public void setStandardQueryId(String standardQueryId) {
        this.standardQueryId = standardQueryId;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getRepairName() {
        return repairName;
    }

    public void setRepairName(String repairName) {
        this.repairName = repairName;
    }

    public List<PartsInfo> getPartsInfo() {
        return partsInfo;
    }

    public void setPartsInfo(List<PartsInfo> partsInfo) {
        this.partsInfo = partsInfo;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Boolean getPageFlag() {
        return pageFlag;
    }

    public void setPageFlag(Boolean pageFlag) {
        this.pageFlag = pageFlag;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getVehicleShopName() {
        return vehicleShopName;
    }

    public void setVehicleShopName(String vehicleShopName) {
        this.vehicleShopName = vehicleShopName;
    }

    public Boolean getCooperativeRepairFlag() {
        return cooperativeRepairFlag;
    }

    public void setCooperativeRepairFlag(Boolean cooperativeRepairFlag) {
        this.cooperativeRepairFlag = cooperativeRepairFlag;
    }

    public String getRepairBrands() {
        return repairBrands;
    }

    public void setRepairBrands(String repairBrands) {
        this.repairBrands = repairBrands;
    }

    public String getVehicleShopDiscount() {
        return vehicleShopDiscount;
    }

    public void setVehicleShopDiscount(String vehicleShopDiscount) {
        this.vehicleShopDiscount = vehicleShopDiscount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleSecondOrganization() {
        return roleSecondOrganization;
    }

    public void setRoleSecondOrganization(String roleSecondOrganization) {
        this.roleSecondOrganization = roleSecondOrganization;
    }

    public String getRoleThirdOrganization() {
        return roleThirdOrganization;
    }

    public void setRoleThirdOrganization(String roleThirdOrganization) {
        this.roleThirdOrganization = roleThirdOrganization;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "RiskManagement{" +
                "caseno='" + caseNo + '\'' +
                ", bussinessId='" + bussinessId + '\'' +
                ", vinCode='" + vinCode + '\'' +
                ", queryTime='" + queryTime + '\'' +
                ", standardQueryId='" + standardQueryId + '\'' +
                ", repairType='" + repairType + '\'' +
                ", repairName='" + repairName + '\'' +
                ", partsInfo=" + partsInfo +
                ", priceType='" + priceType + '\'' +
                ", caseNo='" + caseNo + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", pageFlag=" + pageFlag +
                ", plateNo='" + plateNo + '\'' +
                ", vehicleShopName='" + vehicleShopName + '\'' +
                ", cooperativeRepairFlag=" + cooperativeRepairFlag +
                ", repairBrands='" + repairBrands + '\'' +
                ", vehicleShopDiscount='" + vehicleShopDiscount + '\'' +
                ", role='" + role + '\'' +
                ", roleSecondOrganization='" + roleSecondOrganization + '\'' +
                ", roleThirdOrganization='" + roleThirdOrganization + '\'' +
                ", status='" + status + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}

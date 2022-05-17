package com.learn.springmybatis.entity.test;

import java.util.List;

public class ClaimInfoVo {
	
	private String notifyDate;//报案时间
	
	private String brand;//车牌号
	
	


	private String notifyMan;//报案人
	
	private String driver;//驾驶员
	
	private String damagePlace;//出险地点
	
	private String damageDate;//出险时间
	
	private String damageCase;//出险经过
	
	private String mobile;//报案人手机
	
	private String driverMobile;//驾驶员手机
	
	private String firstsiteClaim;//是否现场报案 1 是 0 否
	
	private String memo;//报案说明
	
	private String insureName;//被保险人名字
	
	private String empPhone;//被保险人电话
	
	private String insurantcode;//被保险人代码
	
	private String policyNo;// 保单号
	
	private String comClaimNo;//交强报案号
	private String bizClaimNo;//商业报案号
	private String comPolicyNo;//交强保单号
	
	private String unitCode;//分公司代码
	
	private String policies;
	private String usingTools;// 推荐使用工具 add by mashilei
	
	private String reportChannel;//报案渠道 add by wangyiteng 2019-04-17

	// add by xukang 20190724 start 查勘页面改造，新增两个字段
	private String numberOfReporter;	//报案人手机出现次数
	private String numberOfDriver;		//驾驶员手机出现次数
	private List<String> caseNoListOfReporter;	//报案人手机 事故号集合
	private List<String> caseNoListOfDriver;	//驾驶员手机 事故号集合


	/**
	 * add by liubo 2019/11/26 查勘页面未决跟踪开关
	 */
	private Boolean flag;

	public String getNumberOfReporter() {
		return numberOfReporter;
	}

	public void setNumberOfReporter(String numberOfReporter) {
		this.numberOfReporter = numberOfReporter;
	}

	public String getNumberOfDriver() {
		return numberOfDriver;
	}

	public void setNumberOfDriver(String numberOfDriver) {

		this.numberOfDriver = numberOfDriver;
	}

	public List<String> getCaseNoListOfReporter() {
		return caseNoListOfReporter;
	}

	public void setCaseNoListOfReporter(List<String> caseNoListOfReporter) {
		this.caseNoListOfReporter = caseNoListOfReporter;
	}

	public List<String> getCaseNoListOfDriver() {
		return caseNoListOfDriver;
	}

	public void setCaseNoListOfDriver(List<String> caseNoListOfDriver) {
		this.caseNoListOfDriver = caseNoListOfDriver;
	}
	// add by xukang 20190724 end
 
	
	public String getReportChannel() {
		return reportChannel;
	}

	public void setReportChannel(String reportChannel) {
		this.reportChannel = reportChannel;
	}

	public String getUsingTools() {
		return usingTools;
	}

	public void setUsingTools(String usingTools) {
		this.usingTools = usingTools;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getPolicies() {
		return policies;
	}

	public void setPolicies(String policies) {
		this.policies = policies;
	}

	public String getComClaimNo() {
		return comClaimNo;
	}

	public void setComClaimNo(String comClaimNo) {
		this.comClaimNo = comClaimNo;
	}

	public String getBizClaimNo() {
		return bizClaimNo;
	}

	public void setBizClaimNo(String bizClaimNo) {
		this.bizClaimNo = bizClaimNo;
	}

	public String getComPolicyNo() {
		return comPolicyNo;
	}

	public void setComPolicyNo(String comPolicyNo) {
		this.comPolicyNo = comPolicyNo;
	}

	public String getBizPolicyNo() {
		return bizPolicyNo;
	}

	public void setBizPolicyNo(String bizPolicyNo) {
		this.bizPolicyNo = bizPolicyNo;
	}



	private String bizPolicyNo;//商业保单号
	private String bizEndStatus;//商业案件状态
	private String comEndStatus;//交强案件状态
	public String getBizEndStatus() {
		return bizEndStatus;
	}

	public void setBizEndStatus(String bizEndStatus) {
		this.bizEndStatus = bizEndStatus;
	}

	public String getComEndStatus() {
		return comEndStatus;
	}

	public void setComEndStatus(String comEndStatus) {
		this.comEndStatus = comEndStatus;
	}

	
	
	private String claimType;// 类型 1 交强险  2商业险
	
	
	public String getInsurantcode() {
		return insurantcode;
	}

	public void setInsurantcode(String insurantcode) {
		this.insurantcode = insurantcode;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getClaimType() {
		return claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public String getNotifyDate() {
		return notifyDate;
	}

	public void setNotifyDate(String notifyDate) {
		this.notifyDate = notifyDate;
	}

	public String getNotifyMan() {
		return notifyMan;
	}

	public void setNotifyMan(String notifyMan) {
		this.notifyMan = notifyMan;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDamagePlace() {
		return damagePlace;
	}

	public void setDamagePlace(String damagePlace) {
		this.damagePlace = damagePlace;
	}

	public String getDamageDate() {
		return damageDate;
	}

	public void setDamageDate(String damageDate) {
		this.damageDate = damageDate;
	}

	public String getDamageCase() {
		return damageCase;
	}

	public void setDamageCase(String damageCase) {
		this.damageCase = damageCase;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDriverMobile() {
		return driverMobile;
	}

	public void setDriverMobile(String driverMobile) {
		this.driverMobile = driverMobile;
	}

	public String getFirstsiteClaim() {
		return firstsiteClaim;
	}

	public void setFirstsiteClaim(String firstsiteClaim) {
		this.firstsiteClaim = firstsiteClaim;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getInsureName() {
		return insureName;
	}

	public void setInsureName(String insureName) {
		this.insureName = insureName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "ClaimInfoVo [notifyDate=" + notifyDate + ", brand=" + brand + ", notifyMan=" + notifyMan + ", driver="
				+ driver + ", damagePlace=" + damagePlace + ", damageDate=" + damageDate + ", damageCase=" + damageCase
				+ ", mobile=" + mobile + ", driverMobile=" + driverMobile + ", firstsiteClaim=" + firstsiteClaim
				+ ", memo=" + memo + ", insureName=" + insureName + ", empPhone=" + empPhone + ", insurantcode="
				+ insurantcode + ", policyNo=" + policyNo + ", comClaimNo=" + comClaimNo + ", bizClaimNo=" + bizClaimNo
				+ ", comPolicyNo=" + comPolicyNo + ", unitCode=" + unitCode + ", policies=" + policies
				+ ", bizPolicyNo=" + bizPolicyNo + ", bizEndStatus=" + bizEndStatus + ", comEndStatus=" + comEndStatus
				+ ", claimType=" + claimType + ", getUnitCode()=" + getUnitCode() + ", getPolicies()=" + getPolicies()
				+ ", getComClaimNo()=" + getComClaimNo() + ", getBizClaimNo()=" + getBizClaimNo()
				+ ", getComPolicyNo()=" + getComPolicyNo() + ", getBizPolicyNo()=" + getBizPolicyNo()
				+ ", getBizEndStatus()=" + getBizEndStatus() + ", getComEndStatus()=" + getComEndStatus()
				+ ", getInsurantcode()=" + getInsurantcode() + ", getPolicyNo()=" + getPolicyNo() + ", getClaimType()="
				+ getClaimType() + ", getNotifyDate()=" + getNotifyDate() + ", getNotifyMan()=" + getNotifyMan()
				+ ", getDriver()=" + getDriver() + ", getDamagePlace()=" + getDamagePlace() + ", getDamageDate()="
				+ getDamageDate() + ", getDamageCase()=" + getDamageCase() + ", getMobile()=" + getMobile()
				+ ", getDriverMobile()=" + getDriverMobile() + ", getFirstsiteClaim()=" + getFirstsiteClaim()
				+ ", getMemo()=" + getMemo() + ", getInsureName()=" + getInsureName() + ", getEmpPhone()="
				+ getEmpPhone() + ", getBrand()=" + getBrand() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
}

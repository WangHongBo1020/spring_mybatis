package com.learn.springmybatis.utils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/***
 * 反洗钱自然人实体信息
 * @author shangxuewei
 * @since 2017-12-14
 * */
@Entity
@Table(name="c_amlcustomer_nature")
public class AmlCustomerNature implements Serializable {

	private static final long serialVersionUID = -7965039268128461687L;
	/**
	 * 主键ID
	 * */
	@Id
	@Column(name="id")
	private long id;
	/**
	 * 客户类型：1.被保险人 2.受益人
	 * */
	@Column(name="CUSTOMER_TYPE")
	private String customerType;
	/**
	 * 事故号
	 * */
	@Column(name="CASENO")
	private String caseNo;
	/**
	 *客户名称
	 * */
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	/**
	 * 身份类型：1.自然人客户 2.法人客户
	 * */
	@Column(name="IDENTITY_TYPE")
	private String identityType;
	/**
	 * 自然人性别  1 男 2女
	 * */
	@Column(name="SEX")
	private String sex;
	/**
	 * 自然人国籍
	 * */
	@Column(name="NATIONALITY")
	private String nationality;
	/**
	 * 自然人联系电话
	 * */
	@Column(name="PHONE")
	private String phone;
	/**
	 * 自然人职业
	 * */
	@Column(name="OCCUPATION")
	private String occupation;
	/**
	 * 自然人身份证号
	 * */
	@Column(name="IDCARD_NO")
	private String idcardNo;
	/**
	 *自然人身份证有效期
	 * */
	@Column(name="IDCARD_VALIDITY_DATE")
	private String idcardValidityDate;
	/**
	 * 自然人其他身份证件种类
	 * */
	@Column(name="OTHER_ID_TYPE")
	private String otherIdType;
	/**
	 * 自然人其他身份证件号码
	 * */
	@Column(name="OTHER_ID_NO")
	private String otherIdNo;
	/**
	 *自然人其他身份证件有效期
	 * */
	@Column(name="OTHER_ID_VALIDITY_DATE")
	private String otherIdValidityDate;
	/**
	 *自然人住所/经常居住地
	 * */
	@Column(name="ADDRESS")
	private String address;
	/**
	 *自然人工作地址
	 * */
	@Column(name="WORK_ADDRESS")
	private String workAddress;
	/**
	 *投保人与被保险人关系
	 * */
	@Column(name="RELATION1")
	private String relation1;
	/**
	 *	投保人与受益人关系
	 * */
	@Column(name="RELATION2")
	private String relation2;
	/**
	 *  add by zuoxiaosong 2019.08.09
	 *	被保险人与受益人关系
	 * */
	@Column(name="RELATION3")
	private String relation3;
	/**
	 *其他信息
	 * */
	@Column(name="OTHER_INFO")
	private String otherInfo;
	/**
	 *操作人员工号
	 * */
	@Column(name="OPDATECODE")
	private String opdateCode;
	/**
	 *操作时间
	 * */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="OPDATETIME")
	private Date opdateTime;
	/**
	 *操作标志 0 新增  1 更新
	 * */
	@Transient
	private int opertion;
	
	/* add by zhaocan 2020-5-13 22:37:28 反洗钱 start*/
	/**
	 * 理赔申请人姓名
	 */
	@Column(name="CLAIMAPPLICANT_NAME")
	private String claimApplicantName;
	
	
	/**
	 * 理赔申请人证件类型
	 */
	@Column(name="CLAIMAPPLICANT_ID_TYPE")
	private String claimApplicantIdType;
	
	
	/**
	 * 理赔申请人证件号码
	 */
	@Column(name="CLAIMAPPLICANT_ID_NO")
	private String claimApplicantIdNo;
	
	/**
	 * 理赔申请人类型
	 */
	@Column(name="CLAIMAPPLICANT_TYPE")
	private String claimApplicantType;
	/* add by zhaocan 2020-5-13 22:37:28 反洗钱 end*/
	public int getOpertion() {
		return opertion;
	}
	public void setOpertion(int opertion) {
		this.opertion = opertion;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getIdentityType() {
		return identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIdcardNo() {
		return idcardNo;
	}
	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}
	public String getIdcardValidityDate() {
		return idcardValidityDate;
	}
	public void setIdcardValidityDate(String idcardValidityDate) {
		this.idcardValidityDate = idcardValidityDate;
	}
	public String getOtherIdType() {
		return otherIdType;
	}
	public void setOtherIdType(String otherIdType) {
		this.otherIdType = otherIdType;
	}
	public String getOtherIdNo() {
		return otherIdNo;
	}
	public void setOtherIdNo(String otherIdNo) {
		this.otherIdNo = otherIdNo;
	}
	public String getOtherIdValidityDate() {
		return otherIdValidityDate;
	}
	public void setOtherIdValidityDate(String otherIdValidityDate) {
		this.otherIdValidityDate = otherIdValidityDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}
	public String getRelation1() {
		return relation1;
	}
	public void setRelation1(String relation1) {
		this.relation1 = relation1;
	}
	public String getRelation2() {
		return relation2;
	}
	public void setRelation2(String relation2) {
		this.relation2 = relation2;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String getOpdateCode() {
		return opdateCode;
	}
	public void setOpdateCode(String opdateCode) {
		this.opdateCode = opdateCode;
	}
	public Date getOpdateTime() {
		return opdateTime;
	}
	public void setOpdateTime(Date opdateTime) {
		this.opdateTime = opdateTime;
	}
	// add by zuoxiaosong begin 2019.08.09 
	public String getRelation3() {
		return relation3;
	}
	public void setRelation3(String relation3) {
		this.relation3 = relation3;
	}
	// add by zuoxiaosong end 2019.08.09
	
	
	
	/* add by zhaocan 2020-5-13 22:37:28 反洗钱 start*/
	public String getClaimApplicantName() {
		return claimApplicantName;
	}
	public void setClaimApplicantName(String claimApplicantName) {
		this.claimApplicantName = claimApplicantName;
	}
	public String getClaimApplicantIdType() {
		return claimApplicantIdType;
	}
	public void setClaimApplicantIdType(String claimApplicantIdType) {
		this.claimApplicantIdType = claimApplicantIdType;
	}
	public String getClaimApplicantIdNo() {
		return claimApplicantIdNo;
	}
	public void setClaimApplicantIdNo(String claimApplicantIdNo) {
		this.claimApplicantIdNo = claimApplicantIdNo;
	}
	public String getClaimApplicantType() {
		return claimApplicantType;
	}
	public void setClaimApplicantType(String claimApplicantType) {
		this.claimApplicantType = claimApplicantType;
	}
	/* add by zhaocan 2020-5-13 22:37:28 反洗钱 end*/
}

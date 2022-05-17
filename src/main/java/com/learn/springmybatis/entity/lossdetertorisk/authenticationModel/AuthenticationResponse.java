package com.learn.springmybatis.entity.lossdetertorisk.authenticationModel;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.authenticationModel
 * AI 风控：鉴权相应参数
 * @Author wujiyao
 * @create 2021 2021/4/23 22:29
 */
public class AuthenticationResponse {

    private String  code; // 接口返回 code
    private String  codeDescription; // 接口返回文本
    private String  toastMessage; // 接口返回提示信息
    private String  cityName; // 城市名称
    private String  company; // 公司名称
    private String  userType; // 用户类型
    private String  businessId; // 用户 id
    private String  groupId; // 分组 id
    private String  companyType; // 公司类型
    private String  companyIdentityCode; // 公司认证码
    private Content  content;//  票据信息
    private String  responseCode; // 参考接口报文
    private String  responseDescription; // 参考接口报文
    private String  loginName; // 登陆名
    private String  name; // 用户名© 明觉科技（北京）有限公司??????????????????????????
    private String  mjUserId; // 明觉用户 id
    private String  region; // 区域
    private String  brands; // 品牌
    private String  secondGroup; // 二级组
    private String  userTypeId; // 用户类型 id
    private AppAccount  appAccount; //App 账号

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeDescription() {
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
    }

    public String getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyIdentityCode() {
        return companyIdentityCode;
    }

    public void setCompanyIdentityCode(String companyIdentityCode) {
        this.companyIdentityCode = companyIdentityCode;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMjUserId() {
        return mjUserId;
    }

    public void setMjUserId(String mjUserId) {
        this.mjUserId = mjUserId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getSecondGroup() {
        return secondGroup;
    }

    public void setSecondGroup(String secondGroup) {
        this.secondGroup = secondGroup;
    }

    public String getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    public AppAccount getAppAccount() {
        return appAccount;
    }

    public void setAppAccount(AppAccount appAccount) {
        this.appAccount = appAccount;
    }

    @Override
    public String toString() {
        return "AutthenticationResponse{" +
                "code='" + code + '\'' +
                ", codeDescription='" + codeDescription + '\'' +
                ", toastMessage='" + toastMessage + '\'' +
                ", cityName='" + cityName + '\'' +
                ", company='" + company + '\'' +
                ", userType='" + userType + '\'' +
                ", businessId='" + businessId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", companyType='" + companyType + '\'' +
                ", companyIdentityCode='" + companyIdentityCode + '\'' +
                ", content=" + content +
                ", responseCode='" + responseCode + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                ", loginName='" + loginName + '\'' +
                ", name='" + name + '\'' +
                ", mjUserId='" + mjUserId + '\'' +
                ", region='" + region + '\'' +
                ", brands='" + brands + '\'' +
                ", secondGroup='" + secondGroup + '\'' +
                ", userTypeId='" + userTypeId + '\'' +
                ", appAccount=" + appAccount +
                '}';
    }
}

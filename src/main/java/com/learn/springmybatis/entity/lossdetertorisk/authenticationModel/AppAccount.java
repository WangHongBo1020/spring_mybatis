package com.learn.springmybatis.entity.lossdetertorisk.authenticationModel;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.authenticationModel
 * AI 风控：鉴权相应参数
 * @Author wujiyao
 * @create 2021 2021/4/23 22:33
 */
public class AppAccount {

    private String businessId;
    private String userName;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "AppAccount{" +
                "businessId='" + businessId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}

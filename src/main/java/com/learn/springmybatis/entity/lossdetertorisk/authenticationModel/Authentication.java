package com.learn.springmybatis.entity.lossdetertorisk.authenticationModel;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.authenticationModel
 * AI 风控鉴权参数
 * @Author wujiyao
 * @create 2021 2021/4/23 22:27
 */
public class Authentication {

       private String businessID;
       private String clientID;
       private String userName;
       private String passWord;

    public Authentication(String businessID, String clientID, String userName, String passWord) {
        this.businessID = businessID;
        this.clientID = clientID;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getBusinessID() {
        return businessID;
    }

    public void setBusinessID(String businessID) {
        this.businessID = businessID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "businessID='" + businessID + '\'' +
                ", clientID='" + clientID + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}

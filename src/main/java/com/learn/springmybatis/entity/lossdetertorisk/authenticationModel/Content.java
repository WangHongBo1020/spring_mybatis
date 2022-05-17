package com.learn.springmybatis.entity.lossdetertorisk.authenticationModel;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.authenticationModel
 * AI 风控：鉴权相应参数
 * @Author wujiyao
 * @create 2021 2021/4/23 22:34
 */
public class Content {

    private String AccessToken; // 票据
    private String tokenType; // 票据类型
    private Long expiresIn; // 票据过期时间
    private String uuid; // UUID

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String accessToken) {
        AccessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Content{" +
                "AccessToken='" + AccessToken + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", expiresIn=" + expiresIn +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}

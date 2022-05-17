package com.learn.springmybatis.entity.lossdetertorisk.vin;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.vin
 *
 * @Author wujiyao
 * @create 2021 2021/4/23 22:47
 */
public class VinResponse {
    private String queryTime; //返回时间，格式：YYYY-MM-DD HH:MM:SS
    private String code; //返回码
    private String data; //默认 null
    private String toastMessage; //回复信息
    private String codeDescription; //返回码信

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
    }

    public String getCodeDescription() {
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
    }

    @Override
    public String toString() {
        return "VinResponse{" +
                "queryTime='" + queryTime + '\'' +
                ", code='" + code + '\'' +
                ", data='" + data + '\'' +
                ", toastMessage='" + toastMessage + '\'' +
                ", codeDescription='" + codeDescription + '\'' +
                '}';
    }
}

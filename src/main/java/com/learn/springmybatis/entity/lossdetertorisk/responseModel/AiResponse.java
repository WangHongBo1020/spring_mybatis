package com.learn.springmybatis.entity.lossdetertorisk.responseModel;

import java.io.Serializable;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.responseModel
 * AI风控返回数据
 * @Author wujiyao
 * @create 2021 2021/4/23 20:23
 */
public class AiResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code; // 响应码
    private String codeDescription; // 响应描述
    private String toastMessage; // 接口返回提示信息
    private String standardQueryId; // 本次请求的 id
    private String queryTime; // 请求的时间
    private Data data;// 是 接口返回数据

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

    public String getStandardQueryId() {
        return standardQueryId;
    }

    public void setStandardQueryId(String standardQueryId) {
        this.standardQueryId = standardQueryId;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AiResponse{" +
                "code='" + code + '\'' +
                ", codeDescription='" + codeDescription + '\'' +
                ", toastMessage='" + toastMessage + '\'' +
                ", standardQueryId='" + standardQueryId + '\'' +
                ", queryTime='" + queryTime + '\'' +
                ", data=" + data +
                '}';
    }
}

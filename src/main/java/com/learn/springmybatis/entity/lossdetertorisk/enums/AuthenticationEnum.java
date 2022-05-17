package com.learn.springmybatis.entity.lossdetertorisk.enums;

/**
 *com.sunshine.autoclaim.domain.lossdetertorisk.enums
 *
 *@Author_wujiyao
 *@create_2021_2021/4/23_22:40
*/
public enum AuthenticationEnum{

    ACCESS_TICKET_OBTAINED_SUCCESSFULLY("0000","系统验证：成功获得访问票据！"),
    PLEASE_CONTACT_TECHNICAL_SUPPORT("9999999","其他错误，请联系技术支持！"),
    THE_REQUEST_PARAMETERS_ARE_INCOMPLETE("9000001","系统验证：请求参数不完整或者有错误！"),
    ACCESS_TICKET_IS_ILLEGAL_OR_EXPIRED("9002","系统验证：访问票据非法或已过期！"),
    AUTHENTICATION_FAILED("9000006","系统验证：认证失败！"),
    SERVICE_RESPONSE_TIMED_OUT("9000010","服务响应超时,_请稍后重试"),
    SERVER_UPGRADING("8999999","服务器升级中!"),
    INSUFFICIENT_PERMISSION_TO_ACCESS("9000005","系统验证：权限不足，无权访问该资");

    private String code;
    private String describe;

    AuthenticationEnum(String code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }


}

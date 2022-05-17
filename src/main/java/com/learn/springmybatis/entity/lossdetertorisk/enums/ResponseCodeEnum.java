package com.learn.springmybatis.entity.lossdetertorisk.enums;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.enums
 * AI风控返回报文编码
 * @Author wujiyao
 * @create 2021 2021/4/23 20:56
 */
public enum ResponseCodeEnum {

    SUCESS("0000", "成功"),
    WRONGFUL("1001", "VIN 不合法"),
    NOT_SUPPORT("1002", "VIN 不支持"),
    NON_PASSENGER_CAR("CAR1003", "非乘用车"),
    ERROR("1004", " VIN 错误"),
    UNABLE_TO_PARSE("1005", "VIN 无法解析"),
    NO_VIEW_BRAND_DATA("1006", "无权查看该品牌数据"),
    ACCESSORY_DATA_DOES_NOT_EXIST("1011", "请求 VIN 的配件数据不存在！"),
    NOT_HAVE_THIS_ACCESSORY("1012", "该车无此配件"),
    IMAGE_DOES_NOT_EXISTS("1013", "请求图片不存在"),
    RECOMMENDED_PARTS_DATA_DOES_NOT_EXIST("1014", "推荐配件数据不存在"),
    NO_PARTS_FOUND_FOR_THIS_MODEL("1015", "该车型查不到配件"),
    PROCESS_PROCESSING_FAILED("8117", "流程处理失败"),
    BACKSTAGE_RETURN_ERROR("9007", "后台 Api 返回异");

    private String code;
    private String describe;

    ResponseCodeEnum(String code, String describe) {
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

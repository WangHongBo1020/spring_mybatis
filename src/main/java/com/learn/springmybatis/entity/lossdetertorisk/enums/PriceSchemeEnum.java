package com.learn.springmybatis.entity.lossdetertorisk.enums;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.enums
 * 价格方案
 * @Author wujiyao
 * @create 2021 2021/4/23 20:48
 */
public enum PriceSchemeEnum {

    SHOP_PRICE("001", "4s 店价格"),
    MARKET_PRICE("002", "市场价"),
    APPLICABLE_PRICE("003", "适用价"),
    JINGYOU_PRICE("005", "精友价");

    PriceSchemeEnum(String code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    private String code;
    private String describe;

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

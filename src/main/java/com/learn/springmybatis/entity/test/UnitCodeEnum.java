package com.learn.springmybatis.entity.test;

/**
 * \* User: wanghongbo
 * \* Date: 2021/05/13
 * \* Time: 15:41
 */
public enum UnitCodeEnum {
    BJ("01","北京市"),
    SD("02","山东省"),
    JS("03","江苏省"),
    HLJ("04","黑龙江省"),
    CQS("05","重庆市"),
    HNS("06","河南省"),
    SHS("07","上海市"),
    GDS("08","广东省"),
    SZS("09","深圳市"),
    TJS("10","天津市"),
    QDS("11","青岛市"),
    LNS("12","辽宁省"),
    HBS("15","河北省"),
    HNNS("16","海南省"),
    GXS("17","广西分"),
    HNSS("18","湖南省"),
    ZJS("19","浙江省"),
    GZS("20","贵州省"),
    SCS("21","四川省"),
    QHS("23","青海省"),
    YNS("24","云南省"),
    SXS("25","陕西省"),
    HBBS("26","湖北省"),
    JLS("27","吉林省"),
    XJWUE("28","新疆维吾尔自治区"),
    NBS("29","宁波市"),
    SXXS("30","山西省"),
    DAS("31","大连市"),
    GSS("32","甘肃省"),
    AHS("33","安徽省"),
    JXS("34","江西省"),
    FJS("35","福建省"),
    NHG("36","内蒙古自治区"),
    XMS("37","厦门市"),
    NX("38","宁夏自治区"),
    XZ("39","西藏自治区");

    private String cnName;
    private String code;

    UnitCodeEnum(String cnName, String code) {
        this.code = code;
        this.cnName = cnName;
    }

    public static String getCnValue(final String code) {
        String cnName = "";
        for (final UnitCodeEnum ele : values()) {
            if (ele.code.equals(code)) {
                cnName = ele.cnName;
            }
        }
        return cnName;
    }

    public static String getCode(final String cnName) {
        String code = "";
        for (final UnitCodeEnum ele : values()) {
            if (ele.cnName.equals(cnName)) {
                code = ele.code;
            }
        }
        return code;
    }
}


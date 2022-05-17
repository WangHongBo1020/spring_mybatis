package com.learn.springmybatis.entity.test;


import org.apache.commons.lang3.StringUtils;

public enum GuangaiEnum {

    QT("B00", "其他"),
    SU("B01", "诉讼"),
    HX("B02", "后续治疗"),
    ZJ("B03", "客户追加索赔"),
    TH("B04", "客户要求退赔"),
    ZC("B05", "追偿"),
    QZ("B06", "反欺诈"),
    FY("B07", "追加直接理赔费用");
    private String code;

    private String name;

    GuangaiEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getTaskTypeEnumMsg(String code){
        if(!StringUtils.isEmpty(code)){
            for(GuangaiEnum e: GuangaiEnum.values()){
                code=code.trim();
                if(e.getCode().equals(code)){
                    return e.name;
                }
            }
        }
        return  null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

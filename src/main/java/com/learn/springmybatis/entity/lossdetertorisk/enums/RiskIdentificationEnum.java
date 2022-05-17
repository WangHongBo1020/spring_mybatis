package com.learn.springmybatis.entity.lossdetertorisk.enums;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.enums
 * 风险标识
 * @Author wujiyao
 * @create 2021 2021/4/23 21:07
 */
public enum RiskIdentificationEnum {

     NO_RISK("00","无风险"),
     PRICE_RISK("01","价格风险"),
     THIS_PART_IS_NOT_AVAILABLE("02","本车无此配件"),
     ASSEMBLY_PARTS("21","总成件"),
     OFFICE_COMPONENTS("22","局部件"),
     RISK_TO_BE_DETERMINED("03","风险待定"),
     OE_NUMBER_ERROR_BELONG_SIGN("41","OE 号错误（通过 OE 纠偏查出来的，OE 不属于该车但是属于该品牌）"),
     OE_NUMBER_ERROR_SELECT("42","OE 号错误（VIN+Oe 错误，通过 vin+配件名查询出来的）  "),
     OE_NUMBER_ERROR_SECOND_SELECT("43","OE 号错误（开启二次查询出来的）"),
     REPLACEMENT_PARTS_REPEAT_REPEAT("55","更换配件重复，只许`取其一（根据配件名重复判断）"),
     REPLACEMENT_PARTS_REPEAT_REMARK_JUDGE("56","更换配件重复，只许取其一（根据配件名+图+图中位置+备注判断）"),
     REPLACEMENT_PARTS_REPEAT_REPLACE("57","更换配件重复，只许取其一（根据配件名+图+图中位置+brand 判断）"),
     DIFFERENT_PARTS_WITH_THE_SAME_NAME("58","经验证属配件同名不同件");

    private String code;
    private String describe;

    RiskIdentificationEnum(String code, String describe) {
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

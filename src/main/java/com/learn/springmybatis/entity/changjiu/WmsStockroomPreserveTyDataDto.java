package com.learn.springmybatis.entity.changjiu;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * \* KDA
 * \* User: wanghongbo
 * \* Date: 2021/12/8
 * \* Time: 14:00
 * \* Description:库内业务维护管理：维护后详情
 * \
 */

@Data
public class WmsStockroomPreserveTyDataDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 维护后电压
     */
    private String houvoltage;
    /**
     * 维护后高压
     */
    private String hougaoVoltage;
    /**
     * 维护后高压电
     */
    private String houhighVoltage;
    /**
     * 维护后电流
     */
    private String houelectricity;
    /**
     * 维护后电压图片
     */
    private List<String> houvoltageUrl;

    /**
     * 维护后左前轮气压
     */
    private String houleftagolunbar;
    /**
     * 维护后左后轮气压
     */
    private String houleftlaterlunbar;
    /**
     * 维护后右前轮气压
     */
    private String hourightagolunbar;
    /**
     * 维护后右后轮气压
     */
    private String hourightlaterlunbar;

    /**
     * 维护后胎压URL
     */
    private List<String> houbarUrl;


}

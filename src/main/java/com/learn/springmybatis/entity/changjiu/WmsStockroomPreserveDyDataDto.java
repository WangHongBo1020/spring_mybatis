package com.learn.springmybatis.entity.changjiu;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * \* KDA
 * \* User: wanghongbo
 * \* Date: 2021/12/8
 * \* Time: 13:41
 * \* Description: 库内业务维护管理：维护前详情
 * \
 */

@Data
public class WmsStockroomPreserveDyDataDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 维护前电压
     */
    private String qianvoltage;
    /**
     * 维护前高压
     */
    private String qiangaoVoltage;
    /**
     * 维护前高压电
     */
    private String qianhighVoltage;
    /**
     * 维护前电流
     */
    private String qianelectricity;
    /**
     * 维护前电压图片
     */
    private List<String> qianvoltageUrl;

    /**
     * 维护前左前轮气压
     */
    private String qianleftagolunbar;
    /**
     * 维护前左后轮气压
     */
    private String qianleftlaterlunbar;
    /**
     * 维护前右前轮气压
     */
    private String qianrightagolunbar;
    /**
     * 维护前右后轮气压
     */
    private String qianrightlaterlunbar;

    /**
     * 维护前胎压URL
     */
    private List<String> qianbarUrl;

}

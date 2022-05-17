package com.learn.springmybatis.utils;

import java.io.Serializable;

/**
 * \* User: wanghongbo
 * \* Date: 2021/05/28
 * \* Time: 14:05
 * \
 */
public class LossPartVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车辆损失部位代码
     */
    private String lossPart;

    public String getLossPart() {
        return lossPart;
    }

    public void setLossPart(String lossPart) {
        this.lossPart = lossPart;
    }

    @Override
    public String toString() {
        return "LossPartVO{" +
                "lossPart='" + lossPart + '\'' +
                '}';
    }
}

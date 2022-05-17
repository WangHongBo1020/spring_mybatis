package com.learn.springmybatis.entity.changjiu.weihu;

import lombok.Data;

import java.io.Serializable;

/**
 * \* KDA
 * \* User: wanghongbo
 * \* Date: 2021/12/20
 * \* Time: 10:45
 * \* Description:
 * \
 */
@Data
public class Dianya implements Serializable {

    private static final long serialVersionUID=1L;

    private String name;
    private String agovoltage;
    private String latervoltage;
}

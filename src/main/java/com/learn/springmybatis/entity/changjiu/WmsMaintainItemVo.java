package com.learn.springmybatis.entity.changjiu;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * \* KDA
 * \* User: wanghongbo
 * \* Date: 2021/12/8
 * \* Time: 14:15
 * \* Description:
 * \
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class WmsMaintainItemVo extends WmsStockroomPreserveDetail implements Serializable {
    private static final long serialVersionUID = 4784359768207298287L;

    /**
     * 维护计划明细
     */
    private WmsStockroomPreserveDetail preserveDetail;

    /**
     * 维护电压
     */
    private WmsStockroomPreserveDyDataDto preserveDyDataDto;

    /**
     * 维护胎压
     */
    private WmsStockroomPreserveTyDataDto preserveTyDataDto;
}

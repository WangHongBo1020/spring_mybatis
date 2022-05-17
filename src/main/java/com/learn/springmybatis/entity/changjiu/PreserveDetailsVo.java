package com.learn.springmybatis.entity.changjiu;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * \* KDA
 * \* User: wanghongbo
 * \* Date: 2021/12/7
 * \* Time: 13:46
 * \* Description:
 * \
 */

@Data
public class PreserveDetailsVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String stockroomPreserveId;

    /**
     * 维护单号
     */
    private String preserveCode;

    /**
     * vin
     */
    private String vin;

    /**
     * 计划维护日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date planTime;

    /**
     * 电压检测（是/否）
     */
    private String voltageStatus;

    private Integer voltageStatus1;

    /**
     * 胎压检测（是/否）
     */
    private String kpaStatus;

    private Integer kpaStatus1;

    /**
     * 单据状态:0:已完成,1:已下单
     */
    private Integer preserveDetailStatus;

    /**
     * 错误信息
     */
    private List<String> error;

}

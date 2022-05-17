package com.learn.springmybatis.utils;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * \* KDA .
 * \* User: wanghongbo
 * \* Date: 2021/07/28
 * \* Time: 16:16
 * \
 */
@Data
public class Investigation implements Serializable {
    private static final long serialVersionUID = 2453980162832321988L;

    /**
     * 调查ID(主键)
     */
    private String reportNo;
    /**
     * 事故号
     */
    private String accidentNo;
    /**
     * 发起任务的节点
     */
    private String taskType;
    /**
     * 事故责任
     */
    private String accidentLiability;
    /**
     * 调查内容
     */
    private String surveyContent;
    /**
     * 调查人
     */
    private String invesTigator;
    /**
     * 限定完成时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date limitcompleteTime;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date updateTime;
    /**
     * 插入时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date inputTime;
    /**
     *调查发起人代码
     */
    private String reporTer;
    /**
     * 调查发起人姓名
     */
    private String reportName;
    /**
     *处理人代码
     */
    private String receIver;
    /**
     * 处理人姓名
     */
    private String receiverName;

}

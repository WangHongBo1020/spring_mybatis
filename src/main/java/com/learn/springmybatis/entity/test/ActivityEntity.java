package com.learn.springmybatis.entity.test;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 活动表
 * </p>
 *
 * @author lvz
 * @since 2021-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class ActivityEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer activityId;


    private Integer organizationId;


    private String activityName;


    private Date startTime;


    private Date endTime;


    private String activityCode;


    private String qrImage;


    private Boolean isActive;


    private String updateUser;


    private Date updateTime;


    private Boolean delFlg;


}

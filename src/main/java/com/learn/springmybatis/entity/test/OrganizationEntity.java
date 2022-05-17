package com.learn.springmybatis.entity.test;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 组织机构表
 * </p>
 *
 * @author lvz
 * @since 2021-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)

public class OrganizationEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer organizationId;


    private String organizationName;


    private Integer updateUser;


    private Date updateTime;


    private Boolean delFlg;



}

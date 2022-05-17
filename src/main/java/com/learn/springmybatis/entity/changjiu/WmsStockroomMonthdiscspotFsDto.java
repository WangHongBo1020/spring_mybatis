package com.learn.springmybatis.entity.changjiu;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * \* KDA
 * \* User: wanghongbo
 * \* Date: 2021/12/28
 * \* Time: 9:34
 * \* Description:
 * \
 */

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("wms_stockroom_monthdiscspot_fs")
public class WmsStockroomMonthdiscspotFsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "monthdiscspot_fs_id", type = IdType.INPUT)

    private String monthdiscspotFsId;

    /**
     * 盘点单号
     */

    @TableField(value = "discspot_code")
    private String discspotCode;

    /**
     * 仓库编码
     */

    @TableField(value = "stockroom_code")
    private String stockroomCode;

    /**
     * 仓库名称
     */

    @TableField(value = "stockroom_name")
    private String stockroomName;

    /**
     * 单据状态:1:已下单:创建时的默认状态,2:进行中开始执行时的状态,3:已完成,全部完成时的状态,4:已失效,创建时间不在当月，则失效
     */
    @TableField(value = "discspot_status")
    private String discspotStatus;

    /**
     * 盘点类型: 1:月盘,2:抽盘
     */

    @TableField(value = "discspot_type")
    private String discspotType;

    /**
     * 创建时间
     */

    @TableField(exist = false)
    private String createTime;

    /**
     * 开始时间
     */

    @TableField(exist = false)
    private String startTime;

    /**
     * 完成时间
     */

    @TableField(exist = false)
    private String completeTime;


    /**
     * 创建人ID
     */

    @TableField(value = "create_user")
    private String createUser;

    /**
     * 创建人
     */

    @TableField(value = "create_username")
    private String createUsername;

    /**
     * 客户
     */

    @TableField(value = "tenant_id")
    private String tenantId;


    /**
     * 客户
     */

    @TableField(value = "customer_name")
    private String customerName;


    /**
     * 品牌名称
     */

    @TableField(value = "brand_name")
    private String brandName;


    /**
     * 计划量
     */

    @TableField(value = "plan_amount")
    private Integer planAmount;


    /**
     * 实盘量
     */
    @TableField(value = "realdisc_amount")
    private Integer realdiscAmount;


    /**
     * 差异:1/-1:有差异,0:无差异
     */

    @TableField(value = "diff_erence")
    private Integer diffErence;

}

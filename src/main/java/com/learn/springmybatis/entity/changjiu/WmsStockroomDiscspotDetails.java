package com.learn.springmybatis.entity.changjiu;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * WMS盘点单明细表
 *
 * @author wanghongbo
 * @date 2021-11-19 09:01:19
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)

@TableName("wms_stockroom_discspot_details")
public class WmsStockroomDiscspotDetails extends Model<WmsStockroomDiscspotDetails> {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "stockroom_discspot_details_id", type = IdType.INPUT)

    private String stockroomDiscspotDetailsId;

    /**
     * 盘点单号码对应wms_disc_spot表盘点单号码
     */

    @TableField(value = "discspot_code")
    private String discspotCode;

    /**
     * 库区ID
     */

    @TableField(value = "partition_id")
    private String partitionId;

    /**
     * 库位
     */

    @TableField(value = "position_code")
    private String positionCode;

    /**
     * 车辆vin码
     */

    @TableField(value = "vin")
    private String vin;

    /**
     * vin照片
     */

    @TableField(value = "vin_photo")
    private String vinPhoto;

    /**
     * vin照片数量
     */

    @TableField(value = "vin_photo_count")
    private Integer vinPhotoCount;

    @TableField(exist = false)
    private List<String> vinPhotoList;

    /**
     * 扫描车辆vin码
     */

    @TableField(value = "vin_scan")
    private String vinScan;

    /**
     * vin获取方式 0:查询，1：扫描
     */

    @TableField(value = "vin_mode")
    private String vinMode;

    /**
     * 说明
     */

    @TableField(value = "discspot_describe")
    private String discspotDescribe;

    /**
     * 盘点时间
     */

    @TableField(value = "discspot_time")
    private Date discspotTimes;

    @TableField(exist = false)
    private String discspotTime;


    /**
     * 盘点完成时间
     */

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @TableField(value = "end_time")
    private Date endTimes;

    @TableField(exist = false)
    private String endTime;

    /**
     * 盘点人ID
     */

    @TableField(value = "create_user")
    private String createUser;

    /**
     * 盘点人
     */

    @TableField(value = "create_username")
    private String createUsername;

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
     * 车辆状态：0:在库,1:锁定
     */

    @TableField(value = "car_status")
    private Integer carStatus;

    @TableField(exist = false)
    private String carStatus1;

    /**
     * 盘点状态：0:已盘,1:未盘
     */

    @TableField(value = "discspot_status")
    private Integer discspotStatus;

    @TableField(exist = false)
    private String discspotStatus1;

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
     * 差异
     */

    @TableField(value = "diff_erence")
    private Integer diffErence;

    /**
     * 盘点结果:0:盘平,1:盘亏,2:盘盈
     */

    @TableField(value = "discspot_result")
    private Integer discspotResult;

    @TableField(exist = false)
    private String discspotResult1;

    /**
     * 删除 0:未删除 1删除
     */
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /**
     * 仓库id
     */
    @TableField(exist = false)
    private String stockroomCode;

}

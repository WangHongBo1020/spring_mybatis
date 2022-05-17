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
 * WMS库内车辆验车单明细表
 *
 * @author wanghongbo
 * @date 2021-11-19 08:46:25
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)

@TableName("wms_stockroom_inside_details")
public class WmsStockroomInsideDetailsDto extends Model<WmsStockroomInsideDetailsDto> {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "stockroom_inside_details_id", type = IdType.INPUT)

    private String stockroomInsideDetailsId;

    /**
     * 验车单号码对应wms_stockroom_inside表验车单号码
     */

    @TableField(value = "checkcar_code")
    private String checkcarCode;

    /**
     * 入库单号
     */

    @TableField(value = "stockroom_in_code")
    private String stockroomInCode;


    /**
     * 出库单号
     */

    @TableField(value = "stockroom_out_no")
    private String stockroomOutNo;

    /**
     * 仓库编码
     */

    @TableField(value = "stockroom_code")
    private String stockroomCode;

    /**
     * 仓库名
     */

    @TableField(value = "stockroom_name")
    private String stockroomName;

    /**
     * 车辆vin码
     */

    @TableField(value = "vin")
    private String vin;

    /**
     * 客户名称
     */

    @TableField(value = "customer_name")
    private String customerName;

    /**
     * 品牌名称
     */

    @TableField(value = "brand_name")
    private String brandName;

    /**
     * 库位编号
     */

    @TableField(value = "position_code")
    private String positionCode;

    /**
     * 库区id
     */

    @TableField(value = "partition_id")
    private String partitionId;

    /**
     * 单据状态：0:已下单,1:已完成
     */

    @TableField(value = "bankinside_status")
    private Integer bankinsideStatus;

    private String bankinsideStatus1;

    /**
     * 验车人ID
     */

    @TableField(value = "check_car_user")
    private String checkCarUser;

    /**
     * 验车人
     */

    @TableField(value = "check_car_username")
    private String checkCarUsername;

    /**
     * 质量状态: 0:无质损,1:有质损
     */

    @TableField(value = "quality_status")
    private Integer qualityStatus;

    private String qualityStatus1;

    /**
     * 质损部位
     */

    @TableField(value = "massloss_position")
    private String masslossPosition;

    private List<String> masslossPositionList;



    @TableField(value = "massloss_position_count")
    private Integer masslossPositionCount;

    /**
     * 质损照片(存入url地址)
     */

    @TableField(value = "massloss_photo")
    private String masslossPhoto;

    private List<String> masslossPhotoList;



    @TableField(value = "massloss_photo_count")
    private Integer masslossPhotoCount;

    /**
     * 描述
     */

    @TableField(value = "bankinside_describe")
    private String bankinsideDescribe;

    /**
     * 删除：0 未删除；1 已删除
     */

    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /**
     * 移动端使用，判断是否被查询/扫描过，0:未被扫描，1:扫描
     */

    @TableField(value = "vin_status")
    private Integer vinStatus;

    /**
     * 完成时间
     */

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @TableField(value = "complete_time")
    private String completeTime;

    private Date completeTimes;

}

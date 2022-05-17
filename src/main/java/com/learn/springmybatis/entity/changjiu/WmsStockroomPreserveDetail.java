package com.learn.springmybatis.entity.changjiu;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * WMS维护明细表
 *
 * @author wanghongbo
 * @date 2021-12-06 16:30:52
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)

@TableName("wms_stockroom_preserve_detail")
public class WmsStockroomPreserveDetail extends Model<WmsStockroomPreserveDetail> {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "stockroom_preserve_detail_id", type = IdType.INPUT)

    private String stockroom_preserveDetailId;

    /**
     * 维护单号对应wms_stockroom_preserve表维护单号
     */
    @TableField(value = "preserve_code")
    private String preserveCode;

    /**
     * 车辆vin码
     */

    @TableField(value = "vin")
    private String vin;

    /**
     * 单据状态:0:已完成,1:已下单
     */

    @TableField(value = "preserve_detail_status")
    private Integer preserveDetailStatus;

    private String preserveDetailStatus1;

    /**
     * 电压是否检测:0:是,1:否
     */

    @TableField(value = "voltage_status")
    private Integer voltageStatus;

    private String voltageStatus1;

    /**
     * 气压是否检测:0:是,1:否
     */

    @TableField(value = "kpa_status")
    private Integer kpaStatus;

    private String kpaStatus1;

    /**
     * 操作人ID
     */

    @TableField(value = "create_user")
    private String createUser;

    /**
     * 操作人
     */

    @TableField(value = "create_username")
    private String createUsername;

    /**
     * 计划维护时间
     */

    @TableField(value = "plan_time")
    private Date planTime;

    private String planTimes;

    /**
     * 实际维护时间
     */

    @TableField(value = "practical_time")
    private Date practicalTime;

    private String practicalTimes;

    /**
     * 维护前数据
     */
    @TableField(value = "preserveago_data")
    private String preserveagoData;

    /**
     * 维护后数据
     */
    @TableField(value = "preserveadv_data")
    private String preserveadvData;

    /**
     * 删除：0 未删除；1 已删除
     */

    @TableField(value = "is_deleted")
    private Integer isDeleted;

    private List<WmsStockroomPreserveDyDataDto> wmsStockroomPreserveDyDataDto;

    private List<PreserveDyDataDto> dataList;

    private List<Map<String, Object>> dyDataList;
    private List<Map<String, Object>> tyDataList;

    private List<String> dyimageBeforeList;
    private List<String> dyimageAfterList;

    private List<String> tyimageBeforeList;
    private List<String> tyimageAfterList;

}

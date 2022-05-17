package com.learn.springmybatis.entity.changjiu;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * WMS移位表
 *
 * @author wanghongbo
 * @date 2021-12-03 09:20:57
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)

@TableName("wms_gression")
public class WmsGression extends Model<WmsGression> {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "xxx_id", type = IdType.INPUT)

    private String gressionId;

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
     * 客户名称
     */

    @TableField(value = "clientele_name")
    private String clienteleName;

    /**
     * 客户id
     */

    @TableField(value = "clientele_id")
    private String clienteleId;

    /**
     * 车辆vin码
     */

    @TableField(value = "vin")
    private String vin;

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
     * 新库位
     */

    @TableField(value = "new_position_code")
    private String newPositionCode;

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
     * 租户ID
     */

    @TableField(value = "tenant_id")
    private String tenantId;

    /**
     * 创建时间
     */

    @TableField(value = "operation_time")
    private Date operationTime;

    /**
     * 删除：0 未删除；1 已删除
     */

    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /**
     * 接受Excel
     */
    private MultipartFile file;

    /**
     * 关联仓库库区id
     */
    private String stockroomPartitionId;
    /**
     * 品牌ID
     */
    private String brandId;

}

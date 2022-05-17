package com.learn.springmybatis.entity.lossdetertorisk.enums;

/**
 * com.sunshine.autoclaim.domain.lossdetertorisk.enums
 * 角色说明
 * @Author wujiyao
 * @create 2021 2021/4/23 20:53
 */
public enum RoleTypeEnum {

    ROLE_ESTIMATE("ROLE_ESTIMATE", "查勘"),
    ROLE_CHECKLOSS("ROLE_CHECKLOSS", "核损"),
    ROLE_CHECKPRICE("ROLE_CHECKPRICE", "核价"),
    ROLE_ADMIN("ROLE_ADMIN", "管理员");

    private String type;
    private String describe;

    RoleTypeEnum(String type, String describe) {
        this.type = type;
        this.describe = describe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}

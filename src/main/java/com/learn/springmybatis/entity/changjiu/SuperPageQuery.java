package com.learn.springmybatis.entity.changjiu;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author zpw
 * @date 2021/10/24
 */
@Getter
@Setter
public class SuperPageQuery implements Serializable {

    private static final long serialVersionUID = -2150051130568525272L;

    /**
     * 当前页数
     */

    private  Integer currentPage = 1;

    /**
     *当前页展示数量
     */

    private  Integer pageSize = 10;

    /**
     * 获取每页查询数量
     */
    @JsonIgnore
    public Integer getRowCount(){
        return this.pageSize;
    }

    /**
     * 查询起始行
     */
    @JsonIgnore
    public Integer getStartRow() {
        return (this.currentPage - 1) * this.pageSize;
    }
}

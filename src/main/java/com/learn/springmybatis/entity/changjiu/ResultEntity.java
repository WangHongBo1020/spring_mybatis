package com.learn.springmybatis.entity.changjiu;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Description <p>给前端数据类</p>
 * <p>
 * 不能单独使用，需set到Result
 * </p>
 * @author zpw
 * @date 2021/10/24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ResultEntity<T,E> implements Serializable {

    /**
     * 对象数据
     */

    private T data;
    /**
     * 集合数据（包含分页数据）
     */

    private List<E> list;
    /**
     * 分页信息
     */
    private Page page;

    public static ResultEntity of() {
        return new ResultEntity();
    }

    public static ResultEntity of(List list) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setList(list);
        return resultEntity;
    }

    public static ResultEntity of(Object data) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(data);
        return resultEntity;
    }

    public static ResultEntity of(List list, Page page) {
       ResultEntity resultEntity = new ResultEntity();
        resultEntity.setList(list);
        resultEntity.setPage(page);
        return resultEntity;
    }

    public static ResultEntity of(Object data, List list, Page page) {
       ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(data);
        resultEntity.setList(list);
        resultEntity.setPage(page);
        return resultEntity;
    }
}

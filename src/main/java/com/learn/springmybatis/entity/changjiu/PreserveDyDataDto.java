package com.learn.springmybatis.entity.changjiu;

import com.learn.springmybatis.entity.changjiu.weihu.Dianya;
import com.learn.springmybatis.entity.changjiu.weihu.Gdianya;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * \* KDA
 * \* User: wanghongbo
 * \* Date: 2021/12/20
 * \* Time: 10:44
 * \* Description:
 * \
 */

@Data
public class PreserveDyDataDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Dianya dianya;

    private Gdianya gdianya;

    private List<String> qianbarUrl;
    private List<String> laterbarUrl;


}

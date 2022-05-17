package com.learn.springmybatis.entity.test;

import com.learn.springmybatis.entity.changjiu.Testceshic;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Testceshivo implements Serializable {
    private static final long serialVersionUID=1L;
    private List<Testceshi> cesList1;

    private List<Testceshic> cesList2;

    /*private Testceshi cesList3;
    private Testceshi cesList4;*/
}

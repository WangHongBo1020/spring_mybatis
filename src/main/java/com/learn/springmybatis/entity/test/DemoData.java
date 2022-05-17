package com.learn.springmybatis.entity.test;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DemoData implements Serializable {
    private static final long serialVersionUID = 1L;
    private String string;
    private Date date;
    private Double doubleData;
}

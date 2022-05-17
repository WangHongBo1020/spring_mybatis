package com.learn.springmybatis.entity.changjiu;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Data
public class Testccc  extends SuperPageQuery implements Serializable {

    private String code;
}

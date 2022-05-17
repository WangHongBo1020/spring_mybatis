package com.learn.springmybatis.entity.test;

import lombok.Data;

import java.util.Date;

/**
 * \* KDA
 * \* User: wanghongbo
 * \* Date: 2022/1/26
 * \* Time: 9:31
 * \* Description:
 * \
 */
@Data
public class TestUser {

    private String name;
    private int age;

    private Date data;



    @Override
    public String toString() {
        return "TestUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

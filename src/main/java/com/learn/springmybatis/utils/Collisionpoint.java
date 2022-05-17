package com.learn.springmybatis.utils;

import java.io.Serializable;

/**
 * \* KDA IntelliJ IDEA.
 * \* User: wanghongbo
 * \* Date: 2021/06/08
 * \* Time: 20:03
 * \
 */
public class Collisionpoint implements Serializable {

    private static final long serialVersionUID = 1L;

    private String collisioNpoint;

    public String getCollisioNpoint() {
        return collisioNpoint;
    }

    public void setCollisioNpoint(String collisioNpoint) {
        this.collisioNpoint = collisioNpoint;
    }

    @Override
    public String toString() {
        return "Collisionpoint{" +
                "collisioNpoint='" + collisioNpoint + '\'' +
                '}';
    }
}

package com.learn.springmybatis.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* KDA
 * \* User: wanghongbo
 * \* Date: 2021/12/27
 * \* Time: 15:17
 * \* Description:
 * \
 */
@Service
public class TestService {

    public List<String> quchong(List<String> list1) {
        List<String> newList = list1.stream().distinct().collect(Collectors.toList());
        return newList;
    }
}

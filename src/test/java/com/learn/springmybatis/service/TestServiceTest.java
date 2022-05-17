package com.learn.springmybatis.service;

import com.learn.springmybatis.entity.changjiu.WmsStockroomPreserveDetail;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestServiceTest {

    public List<WmsStockroomPreserveDetail> quchongs(List<WmsStockroomPreserveDetail> list1) {
        List<WmsStockroomPreserveDetail> newList = list1.stream().distinct().collect(Collectors.toList());
        return newList;
    }
}
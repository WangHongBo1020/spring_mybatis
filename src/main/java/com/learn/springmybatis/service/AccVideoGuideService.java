package com.learn.springmybatis.service;

import com.learn.springmybatis.entity.changjiu.*;
import com.learn.springmybatis.entity.test.OrganizationEntity;
import com.learn.springmybatis.entity.test.TestUser;
import com.learn.springmybatis.entity.test.Testceshivo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.text.ParseException;
import java.util.List;

public interface AccVideoGuideService {

    String getgetAcquisitionTime(String VIDEO_PATH);

    String getgibaoanInfos(String csaeNo);

    String getzhuanma(String claimNo);

    void saveBatch(List<OrganizationEntity> lists);

    Page<Testceshivo> zhuanmas(Testccc ccc);

    int insertwmsgression() throws ParseException;

    int weigh();

    WmsStockroomPreserveDetail weihujihuachaxun();

    int charu(String buwei, int count);

    WmsStockroomMonthdiscspotFsDto chongfushuju();

    List<TestUser> stream();
}

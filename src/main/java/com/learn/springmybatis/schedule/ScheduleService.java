package com.learn.springmybatis.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * com.learn.springmybatis.schedule
 *
 * @Author wujiyao
 * @create 2021 2021/5/19 15:10
 */
@Service
public class ScheduleService {

    @Scheduled(cron = "0/5 * * * * ?")
    public void getMessage() {
        System.out.println("ddddd");
    }
}

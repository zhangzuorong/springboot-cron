package com.zzr.springboot.controller;

import com.zzr.springboot.util.MyDateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 开发公司：山东海豚数据技术有限公司
 * 版权：山东海豚数据技术有限公司
 * <p>
 * ScheduledTasks
 *
 * @author zzr
 * @created Create Time: 2019/5/11
 */
@Component
public class ScheduledTasks {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
     * @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
     * @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
     * @Scheduled(cron=”  /5   “) ：通过cron表达式定义规则，什么是cro表达式，自行搜索引擎。
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        logger.info("The time is now {}", MyDateUtils.formatDateTime(new Date()));
    }
}

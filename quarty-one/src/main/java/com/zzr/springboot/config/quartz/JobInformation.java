package com.zzr.springboot.config.quartz;/**
 * Created by lzq on 2019/1/31.
 */

import lombok.Data;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.TriggerKey;

/**
 * 开发公司：青岛海豚数据技术有限公司
 * 版权：青岛海豚数据技术有限公司
 * <p>
 * JobInformation
 * 任务的触发器，等信息
 * @author 刘志强
 * @created Create Time: 2019/1/31
 */
@Data
public class JobInformation {
    private JobKey jobKey;
    private JobDetail jobDetail;
    private TriggerKey triggerKey;
    private CronTrigger trigger;
    private Integer code;
    private String message;
}
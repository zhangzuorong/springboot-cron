package com.zzr.springboot.config.quartz;/**
 * Created by lzq on 2019/1/31.
 */

import lombok.Data;

/**
 * 开发公司：青岛海豚数据技术有限公司
 * 版权：青岛海豚数据技术有限公司
 * <p>
 * SchedulingPlan
 * 调度计划实体类
 *
 * @author 刘志强
 * @created Create Time: 2019/1/31
 */
@Data
public class SchedulingPlan {
    /**
     * 计划id
     */
    private Long id;

    /**
     * 计划名称
     */
    private String name;

    /**
     * 计划组
     */
    private String group;

    /**
     * Cron表达式
     */
    private String CronExpressions;

    /**
     * 开启关闭状态 0开启 1暂停 2删除
     */
    private Integer status;

}
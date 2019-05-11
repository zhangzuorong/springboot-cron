package com.zzr.springboot.controller;

import com.zzr.springboot.config.quartz.SchedulerService;
import com.zzr.springboot.config.quartz.SchedulingPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 开发公司：山东海豚数据技术有限公司
 * 版权：山东海豚数据技术有限公司
 * <p>
 * QuartyController
 *
 * @author zzr
 * @created Create Time: 2019/5/11
 */
@RestController
@RequestMapping("/quarty/one")
public class QuartyController {
    @Autowired
    public SchedulerService schedulerService;

    /**
     * 添加定时任务
     */
    @RequestMapping("/addSchedulingPlan")
    public String addSchedulingPlan(){
        SchedulingPlan schedulingPlan = new SchedulingPlan();
        schedulingPlan.setId(new Long(1));
        schedulingPlan.setName("测试任务");
        schedulingPlan.setStatus(0);
        schedulingPlan.setGroup("测试组");
        schedulingPlan.setCronExpressions("0/1 0/10 * * * ?");
        schedulerService.addSchedulingPlan(schedulingPlan);
        return "添加成功";
    }

}

package com.zzr.springboot.service.impl;

import com.zzr.springboot.service.QuartyService;
import com.zzr.springboot.util.MyDateUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 开发公司：山东海豚数据技术有限公司
 * 版权：山东海豚数据技术有限公司
 * <p>
 * QuartyImpl
 *
 * @author zzr
 * @created Create Time: 2019/5/11
 */
@Service
public class QuartyImpl implements QuartyService{
    @Override
    public String triggerDemand() {
        return "执行时间"+ MyDateUtils.formatDateTime(new Date());
    }
}

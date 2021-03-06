package com.pingxun.biz.order.domain.service;

import com.pingxun.biz.order.app.dto.PayResultQueryDto;
import com.pingxun.biz.order.domain.entity.PayResultQuery;
import com.pingxun.biz.order.domain.repository.PayResultQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @Title: PayResultQueryDomainService.java
* @Description:  支付结果查询记录服务
* @author Away
* @date 2017/12/24 19:12
* @copyright 重庆平讯数据
* @version V1.0
*/
@Service
public class PayResultQueryDomainService {

    @Autowired
    private PayResultQueryRepository payResultQueryRepository;

    /**
     * @Author: Away
     * @Description: 保存数据
     * @Param: payResultQueryDto
     * @Return com.pingxun.biz.order.domain.entity.PayResultQuery
     * @Date 2017/12/24 19:20
     * @Copyright 重庆平讯数据
     */
    public PayResultQuery saveData(PayResultQueryDto payResultQueryDto){
        PayResultQuery payResultQuery=new PayResultQuery();
        payResultQuery.from(payResultQueryDto);
        return payResultQueryRepository.save(payResultQuery);
    }
}

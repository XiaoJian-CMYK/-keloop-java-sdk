package com.github.xjc.service;

import com.github.xjc.core.KeloopRes;
import com.github.xjc.core.OrderBase;
import com.github.xjc.query.CreateOrderQuery;

/**
 * 快跑者订单相关接口
 */
public interface KeloopOrderService {

    /**
     * 创建订单
     *
     * @param createOrderQuery 创建订单参数
     * @return 快跑者统一相应类
     */
    KeloopRes createOrder(CreateOrderQuery createOrderQuery);


    /**
     * 获取订单详情
     *
     * @param orderBase 订单基础
     * @return 快跑者统一相应类
     */
    KeloopRes getOrderInfo(OrderBase orderBase);


}

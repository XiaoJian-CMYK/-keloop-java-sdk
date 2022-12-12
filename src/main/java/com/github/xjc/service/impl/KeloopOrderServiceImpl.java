package com.github.xjc.service.impl;

import cn.hutool.json.JSONUtil;
import com.github.xjc.core.KeloopRes;
import com.github.xjc.core.OrderBase;
import com.github.xjc.enums.OrderUrlEnum;
import com.github.xjc.query.CreateOrderQuery;
import com.github.xjc.service.BaseService;
import com.github.xjc.service.KeloopOrderService;

public class KeloopOrderServiceImpl implements KeloopOrderService {

    private BaseService baseService;

    public KeloopOrderServiceImpl(BaseService baseService) {
        this.baseService = baseService;
    }

    /**
     * 创建订单
     *
     * @param createOrderQuery 创建订单参数
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes createOrder(CreateOrderQuery createOrderQuery) {
        return baseService.http(OrderUrlEnum.CREATE_ORDER.getUrl(), OrderUrlEnum.CREATE_ORDER.getReqTypeEnum(), JSONUtil.parseObj(createOrderQuery));
    }

    /**
     * 获取订单详情
     *
     * @param orderBase 订单基础
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes getOrderInfo(OrderBase orderBase) {
        return baseService.http(OrderUrlEnum.GET_ORDER_INFO.getUrl(), OrderUrlEnum.GET_ORDER_INFO.getReqTypeEnum(), JSONUtil.parseObj(orderBase));
    }

}

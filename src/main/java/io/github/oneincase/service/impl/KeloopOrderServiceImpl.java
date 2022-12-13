package io.github.oneincase.service.impl;

import cn.hutool.json.JSONUtil;
import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.core.OrderBase;
import io.github.oneincase.enums.OrderUrlEnum;
import io.github.oneincase.query.order.*;
import io.github.oneincase.service.BaseService;
import io.github.oneincase.service.KeloopOrderService;

public class KeloopOrderServiceImpl implements KeloopOrderService {

    private final BaseService baseService;

    public KeloopOrderServiceImpl(BaseService baseService) {
        this.baseService = baseService;
    }

    /**
     * 创建订单
     *
     * @param keloopCreateOrderQuery 创建订单参数
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes createOrder(KeloopCreateOrderQuery keloopCreateOrderQuery) {
        return baseService.http(OrderUrlEnum.CREATE_ORDER.getUrl(), OrderUrlEnum.CREATE_ORDER.getReqTypeEnum(), JSONUtil.parseObj(keloopCreateOrderQuery));
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

    /**
     * 获取订单进程
     *
     * @param orderBase 订单基础
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes getOrderLog(OrderBase orderBase) {
        return baseService.http(OrderUrlEnum.GET_ORDER_LOG.getUrl(), OrderUrlEnum.GET_ORDER_LOG.getReqTypeEnum(), JSONUtil.parseObj(orderBase));
    }

    /**
     * 获取订单配送员坐标
     *
     * @param orderBase 订单基础
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes getCourierTag(OrderBase orderBase) {
        return baseService.http(OrderUrlEnum.GET_COURIER_TAG.getUrl(), OrderUrlEnum.GET_COURIER_TAG.getReqTypeEnum(), JSONUtil.parseObj(orderBase));
    }

    /**
     * 评论配送员
     *
     * @param keloopCommentOrderQuery 评论配送员参数对象
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes commentOrder(KeloopCommentOrderQuery keloopCommentOrderQuery) {
        return baseService.http(OrderUrlEnum.COMMENT_ORDER.getUrl(), OrderUrlEnum.COMMENT_ORDER.getReqTypeEnum(), JSONUtil.parseObj(keloopCommentOrderQuery));
    }

    /**
     * 计算配送费
     *
     * @param keloopGetFeeQuery 计算配送费请求参数
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes getFee(KeloopGetFeeQuery keloopGetFeeQuery) {
        return baseService.http(OrderUrlEnum.GET_FEE.getUrl(), OrderUrlEnum.GET_FEE.getReqTypeEnum(), JSONUtil.parseObj(keloopGetFeeQuery));
    }

    /**
     * 撤销订单
     *
     * @param keloopCancelOrderQuery 撤销订单请求参数
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes cancelOrder(KeloopCancelOrderQuery keloopCancelOrderQuery) {
        return baseService.http(OrderUrlEnum.CANCEL_ORDER.getUrl(), OrderUrlEnum.CANCEL_ORDER.getReqTypeEnum(), JSONUtil.parseObj(keloopCancelOrderQuery));
    }

    /**
     * 订单增加小费功能
     *
     * @param keloopIncrOrderTipQuery 订单增加小费功能请求参数
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes incrOrderTip(KeloopIncrOrderTipQuery keloopIncrOrderTipQuery) {
        return baseService.http(OrderUrlEnum.INCR_ORDER_TIP.getUrl(), OrderUrlEnum.INCR_ORDER_TIP.getReqTypeEnum(), JSONUtil.parseObj(keloopIncrOrderTipQuery));
    }

}

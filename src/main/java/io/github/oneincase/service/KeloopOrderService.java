package io.github.oneincase.service;

import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.core.OrderBase;
import io.github.oneincase.query.order.*;

/**
 * 快跑者订单相关接口
 */
public interface KeloopOrderService {

    /**
     * 创建订单
     *
     * @param keloopCreateOrderQuery 创建订单参数
     * @return 快跑者统一相应类
     */
    KeloopRes createOrder(KeloopCreateOrderQuery keloopCreateOrderQuery);


    /**
     * 获取订单详情
     *
     * @param orderBase 订单基础
     * @return 快跑者统一相应类
     */
    KeloopRes getOrderInfo(OrderBase orderBase);

    /**
     * 获取订单进程
     *
     * @param orderBase 订单基础
     * @return 快跑者统一相应类
     */
    KeloopRes getOrderLog(OrderBase orderBase);

    /**
     * 获取订单配送员坐标
     *
     * @param orderBase 订单基础
     * @return 快跑者统一相应类
     */
    KeloopRes getCourierTag(OrderBase orderBase);

    /**
     * 评论配送员
     *
     * @param keloopCommentOrderQuery 评论配送员参数对象
     * @return 快跑者统一相应类
     */
    KeloopRes commentOrder(KeloopCommentOrderQuery keloopCommentOrderQuery);

    /**
     * 计算配送费
     *
     * @param keloopGetFeeQuery 计算配送费请求参数
     * @return 快跑者统一相应类
     */
    KeloopRes getFee(KeloopGetFeeQuery keloopGetFeeQuery);

    /**
     * 撤销订单
     *
     * @param keloopCancelOrderQuery 撤销订单请求参数
     * @return 快跑者统一相应类
     */
    KeloopRes cancelOrder(KeloopCancelOrderQuery keloopCancelOrderQuery);

    /**
     * 订单增加小费功能
     *
     * @param keloopIncrOrderTipQuery 订单增加小费功能请求参数
     * @return 快跑者统一相应类
     */
    KeloopRes incrOrderTip(KeloopIncrOrderTipQuery keloopIncrOrderTipQuery);


}

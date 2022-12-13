package io.github.oneincase.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 订单地址枚举
 */
@Getter
@AllArgsConstructor
public enum OrderUrlEnum {

    /**
     * 创建订单
     */
    CREATE_ORDER("https://open.keloop.cn/open/order/createOrder", ReqTypeEnum.POST),

    /**
     * 获取订单详情
     */
    GET_ORDER_INFO("https://open.keloop.cn/open/order/getOrderInfo", ReqTypeEnum.GET),

    /**
     * 获取订单进程
     */
    GET_ORDER_LOG("https://open.keloop.cn/open/order/getOrderLog", ReqTypeEnum.GET),

    /**
     * 获取订单配送员坐标
     */
    GET_COURIER_TAG("https://open.keloop.cn/open/order/getCourierTag", ReqTypeEnum.GET),

    /**
     * 评论配送员
     */
    COMMENT_ORDER("https://open.keloop.cn/open/order/commentOrder", ReqTypeEnum.POST),

    /**
     * 计算配送费
     */
    GET_FEE("https://open.keloop.cn/open/order/getFee", ReqTypeEnum.GET),

    /**
     * 撤销订单
     */
    CANCEL_ORDER("https://open.keloop.cn/open/order/cancelOrder", ReqTypeEnum.POST),

    /**
     * 订单增加小费功能
     */
    INCR_ORDER_TIP("https://open.keloop.cn/open/order/incrOrderTip", ReqTypeEnum.POST);

    /**
     * 请求地址
     */
    private final String url;

    /**
     * 请求类型
     */
    private final ReqTypeEnum reqTypeEnum;

}

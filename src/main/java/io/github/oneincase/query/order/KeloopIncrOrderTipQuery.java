package io.github.oneincase.query.order;

import lombok.Data;

/**
 * 订单增加小费功能请求参数
 */
@Data
public class KeloopIncrOrderTipQuery {

    /**
     * trade_no	必填：是	string
     * 快跑者订单交易号创建订单成功会返回
     */
    private String trade_no;
    /**
     * tips	必填：是	string
     * 小费 (元)
     */
    private String tips;
    /**
     * type	必填：是	string
     * 是否需要扣除储备金 (0 需要, 1 不需要) 默认0 需要
     */
    private String type;

}

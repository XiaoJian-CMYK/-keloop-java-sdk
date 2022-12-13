package io.github.oneincase.query.order;

import lombok.Data;

/**
 * 撤销订单请求参数
 */
@Data
public class KeloopCancelOrderQuery {

    /**
     * trade_no	必填：是	string
     * 配送订单的订单单号，如：16120709314700002
     */
    private String trade_no;

    /**
     * reason	必填：否	string
     * 撤销订单原因
     */
    private String reason;

}

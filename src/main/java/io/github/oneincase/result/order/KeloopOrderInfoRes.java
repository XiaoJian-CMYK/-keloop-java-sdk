package io.github.oneincase.result.order;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 订单详情返回项
 */
@NoArgsConstructor
@Data
public class KeloopOrderInfoRes {
    /**
     * 订单内容
     */
    private String order_content;
    /**
     * 订单备注
     */
    private String order_note;
    /**
     * 订单标识
     */
    private String order_mark;
    /**
     * 订单来源
     */
    private String order_from;
    /**
     * 第三方订单下单时间
     */
    private String order_time;
    /**
     * 订单图片路径
     */
    private String order_photo;
    /**
     * 订单客户（对应配送订单的收单人）名字
     */
    private String customer_name;
    /**
     * 订单客户电话
     */
    private String customer_tel;
    /**
     * 订单客户地址
     */
    private String customer_address;
    /**
     * 订单客户坐标
     */
    private String customer_tag;
    /**
     * 取单名字
     */
    private String get_name;
    /**
     * 取单地址
     */
    private String get_address;
    /**
     * 取单电话
     */
    private String get_tel;
    /**
     * 取单坐标
     */
    private String get_tag;
    /**
     * 回调时带上的参数
     */
    private String note;
    /**
     * 商户配送费的计费明细
     */
    private List<String> fee_detail;
    /**
     * 第三方订单单号
     */
    private String order_no;
    /**
     * 订单实收价
     */
    private String order_price;
    /**
     * 订单原价
     */
    private String order_origin_price;
    /**
     * 第三方订单的支付状态，0 表示已经支付，1 表示货到付款
     */
    private String pay_status;
    /**
     * 订单原配送费
     */
    private String origin_pay_fee;
    /**
     * 商户配送费（若使用优惠券，则为优惠后配送费）
     */
    private String merchant_pay_fee;
    /**
     * 商户优惠前配送费
     */
    private String primary_merchant_pay_fee;
    /**
     * 优惠券抵扣金额
     */
    private String coupon_amount;
    /**
     * 距离
     */
    private String distance;
    /**
     * 配送员配送费
     */
    private String pay_fee;
    /**
     * 订单小费
     */
    private String tip;
    /**
     * 配送订单的发单时间
     */
    private String send_time;
    /**
     * 预计送达时间的时间戳
     */
    private String send_times;
    /**
     * 送达凭证，配送员送到订单后的图片凭证（json字符串）
     */
    private String picture_proof;
    /**
     * 配送订单状态：1：待发单，2：待抢单，3：待接单，4：取单中，5：送单中，6：已送达，7：已撤销
     */
    private String status;
    /**
     * 配送订单单号
     */
    private String trade_no;
    /**
     * 接单配送员的名字
     */
    private String courier_name;
    /**
     * 接单配送员的电话
     */
    private String courier_tel;
    /**
     * 配送团队名字
     */
    private String team_name;
    /**
     * 配送团队电话
     */
    private String team_tel;

}

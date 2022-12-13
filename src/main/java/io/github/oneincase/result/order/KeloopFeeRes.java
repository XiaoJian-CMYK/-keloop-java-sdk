package io.github.oneincase.result.order;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 计算配送费返回项
 */
@NoArgsConstructor
@Data
public class KeloopFeeRes {
    /**
     * 商户发单配送费，优惠后的配送费
     */
    private String pay_fee;
    /**
     * 距离 单位 km
     */
    private String distance;
    /**
     * 计算方式详情
     */
    private List<String> pay_fee_detail;
    /**
     * 优惠券倒叙
     */
    private CouponDesc coupon_desc;

    /**
     * 优惠券倒叙
     */
    @NoArgsConstructor
    @Data
    public static class CouponDesc {
        /**
         * 商户发单配送费，优惠后的配送费
         */
        private String primary_merchant_pay_fee;
        /**
         * 计算方式详情
         */
        private String merchant_pay_fee;
        /**
         * 优惠券信息详情
         */
        private String discount_fee;
        /**
         * 是否使用优惠券 1 使用 0 未使用
         */
        private String use_coupon;
    }

}

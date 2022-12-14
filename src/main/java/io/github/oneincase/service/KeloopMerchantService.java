package io.github.oneincase.service;

import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.query.merchant.KeloopMerchantQuery;

/**
 * 快跑者商户相关接口
 */
public interface KeloopMerchantService {

    /**
     * 获取所有商户
     */
    KeloopRes getMerchants();

    /**
     * 解绑授权商户
     *
     * @param shop_id 第三方店铺id
     */
    KeloopRes cancelMerchantRelate(String shop_id);

    /**
     * 设置商家名称
     *
     * @param shop_id       第三方店铺id
     * @param merchant_name 所需要修改的名称
     */
    KeloopRes setMerchantName(String shop_id, String merchant_name);

    /**
     * 创建快跑者商户
     *
     * @param keloopMerchantQuery 创建快跑者商户请求参数
     */
    KeloopRes createMerchant(KeloopMerchantQuery keloopMerchantQuery);

    /**
     * 获取商家充值储备金链接
     */
    KeloopRes getFundUrl();

}

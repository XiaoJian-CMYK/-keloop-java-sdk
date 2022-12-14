package io.github.oneincase.service.impl;

import cn.hutool.core.map.MapUtil;
import cn.hutool.json.JSONUtil;
import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.enums.MerchantUrlEnum;
import io.github.oneincase.query.merchant.KeloopMerchantQuery;
import io.github.oneincase.service.KeloopBaseService;
import io.github.oneincase.service.KeloopMerchantService;

import java.util.HashMap;
import java.util.Map;

public class KeloopMerchantServiceImpl implements KeloopMerchantService {

    private final KeloopBaseService keloopBaseService;

    public KeloopMerchantServiceImpl(KeloopBaseService keloopBaseService) {
        this.keloopBaseService = keloopBaseService;
    }

    /**
     * 获取所有商户
     */
    @Override
    public KeloopRes getMerchants() {
        return keloopBaseService.http(MerchantUrlEnum.GET_MERCHANTS.getUrl(), MerchantUrlEnum.GET_MERCHANTS.getReqTypeEnum(), null);
    }

    /**
     * 解绑授权商户
     *
     * @param shop_id 第三方店铺id
     */
    @Override
    public KeloopRes cancelMerchantRelate(String shop_id) {
        HashMap<String, Object> map = MapUtil.of("shop_id", shop_id);
        return keloopBaseService.http(MerchantUrlEnum.CANCEL_MERCHANT_RELATE.getUrl(), MerchantUrlEnum.CANCEL_MERCHANT_RELATE.getReqTypeEnum(), map);
    }

    /**
     * 设置商家名称
     *
     * @param shop_id       第三方店铺id
     * @param merchant_name 所需要修改的名称
     */
    @Override
    public KeloopRes setMerchantName(String shop_id, String merchant_name) {
        Map<String, Object> map = new HashMap<>();
        map.put("shop_id", shop_id);
        map.put("merchant_name", merchant_name);
        return keloopBaseService.http(MerchantUrlEnum.SET_MERCHANT_NAME.getUrl(), MerchantUrlEnum.SET_MERCHANT_NAME.getReqTypeEnum(), map);
    }

    /**
     * 创建快跑者商户
     *
     * @param keloopMerchantQuery 创建快跑者商户请求参数
     */
    @Override
    public KeloopRes createMerchant(KeloopMerchantQuery keloopMerchantQuery) {
        return keloopBaseService.http(MerchantUrlEnum.CREATE_MERCHANT.getUrl(), MerchantUrlEnum.CREATE_MERCHANT.getReqTypeEnum(), JSONUtil.parseObj(keloopMerchantQuery));
    }

    /**
     * 获取商家充值储备金链接
     */
    @Override
    public KeloopRes getFundUrl() {
        return keloopBaseService.http(MerchantUrlEnum.GET_FUND_URL.getUrl(), MerchantUrlEnum.GET_FUND_URL.getReqTypeEnum(), null);
    }
}

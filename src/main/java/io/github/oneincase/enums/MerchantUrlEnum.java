package io.github.oneincase.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 商铺相关地址枚举
 */
@Getter
@AllArgsConstructor
public enum MerchantUrlEnum {

    /**
     * 获取所有商户
     */
    GET_MERCHANTS("https://open.keloop.cn/open/merchant/getMerchants", ReqTypeEnum.GET),
    /**
     * 解绑授权商户
     */
    CANCEL_MERCHANT_RELATE("https://open.keloop.cn/open/merchant/cancelMerchantRelate", ReqTypeEnum.POST),
    /**
     * 设置商家名称
     */
    SET_MERCHANT_NAME("https://open.keloop.cn/open/merchant/setMerchantName", ReqTypeEnum.POST),
    /**
     * 创建快跑者商户
     */
    CREATE_MERCHANT("https://open.keloop.cn/open/merchant/createMerchant", ReqTypeEnum.POST),
    /**
     * 获取商家充值储备金链接
     */
    GET_FUND_URL("https://open.keloop.cn/open/merchant/getFundUrl", ReqTypeEnum.GET);

    /**
     * 请求地址
     */
    private final String url;

    /**
     * 请求类型
     */
    private final ReqTypeEnum reqTypeEnum;
}

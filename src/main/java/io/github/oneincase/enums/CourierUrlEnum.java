package io.github.oneincase.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 配送员相关地址枚举
 */
@Getter
@AllArgsConstructor
public enum CourierUrlEnum {

    /**
     * 获取所有配送员
     */
    GET_COURIERS("https://open.keloop.cn/open/courier/getCouriers", ReqTypeEnum.GET),

    /**
     * 获取指定范围配送员
     */
    GET_NEAR_COURIERS("https://open.keloop.cn/open/courier/getNearCouriers", ReqTypeEnum.GET);

    /**
     * 请求地址
     */
    private final String url;

    /**
     * 请求类型
     */
    private final ReqTypeEnum reqTypeEnum;
}

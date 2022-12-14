package io.github.oneincase.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 门店相关地址枚举
 */
@Getter
@AllArgsConstructor
public enum StoreUrlEnum {

    /**
     * 获取门店列表
     */
    GET_STORES("https://open.keloop.cn/open/store/getStores", ReqTypeEnum.POST),

    /**
     * 修改门店
     */
    UPDATE_STORE("https://open.keloop.cn/open/store/updateStore", ReqTypeEnum.POST),

    /**
     * 删除门店
     */
    DEL_STORE("https://open.keloop.cn/open/store/delStore", ReqTypeEnum.POST),

    /**
     * 关联门店
     */
    RELATE_STORE("https://open.keloop.cn/open/store/relateStore", ReqTypeEnum.POST);

    /**
     * 请求地址
     */
    private final String url;

    /**
     * 请求类型
     */
    private final ReqTypeEnum reqTypeEnum;
}

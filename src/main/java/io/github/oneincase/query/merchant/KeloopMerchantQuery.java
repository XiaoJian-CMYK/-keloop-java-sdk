package io.github.oneincase.query.merchant;

import lombok.Data;

/**
 * 创建快跑者商户请求参数
 */
@Data
public class KeloopMerchantQuery {

    /**
     * shop_id	必填: 是	string
     * 第三方店铺id
     */
    private String shop_id;
    /**
     * shop_tel	必填: 是	string
     * 第三方店铺电话
     */
    private String shop_tel;
    /**
     * shop_name	必填: 是	string
     * 第三方店铺名称
     */
    private String shop_name;
    /**
     * shop_address	必填: 是	string
     * 第三方店铺地址
     */
    private String shop_address;
    /**
     * shop_tag	必填: 是	string
     * 第三方店铺坐标
     */
    private String shop_tag;

}

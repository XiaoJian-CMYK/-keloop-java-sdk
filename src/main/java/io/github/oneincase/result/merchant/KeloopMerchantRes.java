package io.github.oneincase.result.merchant;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 所有商户返回项
 */
@NoArgsConstructor
@Data
public class KeloopMerchantRes {
    /**
     * 商户 ID
     */
    private String merchant_id;
    /**
     * 商户名称
     */
    private String merchant_name;
    /**
     * 商户电话
     */
    private String merchant_tel;
    /**
     * 商户坐标
     */
    private String tag;
    /**
     * 商户营业状态：0表示营业中，-1表示停业中
     */
    private String operating_status;
}

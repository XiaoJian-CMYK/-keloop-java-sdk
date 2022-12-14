package io.github.oneincase.query.store;

import lombok.Data;

/**
 * 关联门店请求参数
 */
@Data
public class KeloopRelateStoreQuery {

    /**
     * shop_id	是	string
     * 第三方商户（平台）id
     */
    private String shop_id;
    /**
     * store_id	是	string
     * 第三方店铺id
     */
    private String store_id;
    /**
     * store_tel	是	string
     * 第三方店铺电话
     */
    private String store_tel;
    /**
     * store_name	是	string
     * 第三方店铺名称
     */
    private String store_name;
    /**
     * store_address	是	string
     * 第三方店铺地址
     */
    private String store_address;
    /**
     * store_tag	是	string
     * 第三方店铺坐标
     */
    private String store_tag;
    /**
     * store_type	否	int
     * 店铺类型 不填默认1，不在范围也默认1（1：小吃美食,2： 正餐快餐,3：龙虾烧烤,4：烘焙蛋糕,5：甜品奶茶,6：西餐料理）
     */
    private Integer store_type;

}

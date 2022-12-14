package io.github.oneincase.query.store;

import lombok.Data;

/**
 * 修改门店请求参数
 */
@Data
public class KeloopUpdateStoreQuery {

    /**
     * store_id	是	int
     * 第三方店铺id
     */
    private Integer store_id;
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
     * 店铺类型 不填就不修改（填了非指定也不修改）【1：小吃美食,2： 正餐快餐,3：龙虾烧烤,4：烘焙蛋糕,5：甜品奶茶,6：西餐料理】
     */
    private Integer store_type;

}

package io.github.oneincase.query.order;

import lombok.Data;

/**
 * 计算配送费请求参数
 */
@Data
public class KeloopGetFeeQuery {

    /**
     * shop_id	必填：是	int
     * 第三方系统商户ID
     */
    private Integer shop_id;
    /**
     * get_tag	必填：是	string
     * 取单坐标火星坐标,如：116.459226,40.007126,经度在前，纬度在后
     */
    private String get_tag;
    /**
     * customer_tag	必填：是	string
     * 送达坐标火星坐标,如：116.459226,40.007126,经度在前，纬度在后
     */
    private String customer_tag;
    /**
     * pay_fee	必填：否	string
     * 第三方订单原配送费
     */
    private String pay_fee;
    /**
     * order_price	必填：是	string
     * 第三方订单总价
     */
    private String order_price;
    /**
     * shop_tel	必填：否	string
     * 第三方系统商户电话 21.07.05新增参数 用于在未发单情况下获取相关商户配送费，系统进行自动关联(快跑者存在该商户时)
     */
    private String shop_tel;
    /**
     * distance	必填：否	float
     * 第三方系统中的距离 单位km 最小值0.01km,若传了该值，计算配送费将以该值为准
     */
    private Float distance;
    /**
     * weight	必填：否	float
     * 重量 单位kg
     */
    private Float weight;
}

package io.github.oneincase.query.order;

import lombok.Data;

/**
 * 创建订单参数对象
 */
@Data
public class KeloopCreateOrderQuery {

    /**
     * shop_id
     * 是否必填：是	类型：int
     * 第三方系统中的商户 ID
     */
    private Integer shop_id;
    /**
     * shop_name
     * 是否必填：是	类型：string
     * 第三方系统中的商户名称
     */
    private String shop_name;
    /**
     * shop_tel
     * 是否必填：是	类型：string
     * 第三方系统中的商户电话
     */
    private String shop_tel;
    /**
     * shop_address
     * 是否必填：是	类型：string
     * 第三方系统中的商户地址
     */
    private String shop_address;
    /**
     * shop_tag
     * 是否必填：是	类型：string
     * 第三方系统中的商户坐标火星坐标,如：116.459226,40.007126,经度在前，纬度在后
     */
    private String shop_tag;
    /**
     * store_id
     * 是否必填：否	类型：int
     * 第三方系统中商户下的门店 ID
     */
    private Integer store_id;
    /**
     * order_content
     * 是否必填：否	类型：string
     * 订单订单内容
     */
    private String order_content;
    /**
     * order_note
     * 是否必填：否	类型：string
     * 订单备注
     */
    private String order_note;
    /**
     * order_mark
     * 是否必填：否	类型：string
     * 订单标识
     */
    private String order_mark;
    /**
     * order_from
     * 是否必填：否	类型：string
     * 订单来源
     */
    private String order_from;
    /**
     * order_time
     * 是否必填：否	类型：string
     * 订单下单时间 格式 YY-mm-dd HH:ii:ss
     */
    private String order_time;
    /**
     * order_photo
     * 是否必填：否	类型：string
     * 订单图片路径
     */
    private String order_photo;
    /**
     * note
     * 是否必填：否	类型：string
     * 自定义参数，快跑者系统调用回调地址时会带上该参数
     */
    private String note;
    /**
     * customer_name
     * 是否必填：否	类型：string
     * 订单客户对应配送订单的收单人
     */
    private String customer_name;
    /**
     * customer_tel
     * 是否必填：是	类型：string
     * 订单客户电话
     */
    private String customer_tel;
    /**
     * customer_address
     * 是否必填：是	类型：string
     * 订单客户地址
     */
    private String customer_address;
    /**
     * customer_tag
     * 是否必填：是	类型：string
     * 订单客户坐标火星坐标,如：116.459226,40.007126,经度在前，纬度在后
     */
    private String customer_tag;
    /**
     * order_no
     * 是否必填：是	类型：string
     * 订单单号，请使用string类型，否则长数字将会自动转换成科学计数法
     */
    private String order_no;
    /**
     * order_price
     * 是否必填：否	类型：float
     * 订单的总价
     */
    private Float order_price;
    /**
     * order_origin_price
     * 是否必填：否	类型：float
     * 订单的原始价格
     */
    private Float order_origin_price;
    /**
     * pay_status
     * 是否必填：是	类型：int
     * 订单支付方式：0 表示已支付、1 表示货到付款
     */
    private Integer pay_status;
    /**
     * pay_fee
     * 是否必填：否	类型：float
     * 订单的原配送费
     */
    private Float pay_fee;
    /**
     * tip
     * 是否必填：否	类型：float
     * 订单的小费
     */
    private Float tip;
    /**
     * pre_times
     * 是否必填：否	类型：int
     * 预计送达时间的时间戳（10 位）
     */
    private Integer pre_times;
    /**
     * is_calc_fee
     * 是否必填：否	类型：int
     * 是否收取商户配送费：0 需要快跑者计算商户配送费、1 快跑者将不计算商户配送费
     */
    private Integer is_calc_fee;
    /**
     * contact_tel
     * 是否必填：否	类型：string
     * 第三方系统中的实际取单电话
     */
    private String contact_tel;
    /**
     * distance
     * 是否必填：否	类型：string
     * 第三方系统中的距离 单位km 最小值0.01km,若传了该值，计算配送费将以该值为准
     */
    private String distance;
    /**
     * weight
     * 是否必填：否	类型：float
     * 重量 单位kg
     */
    private Float weight;
    /**
     * pre_deliver_times
     * 是否必填：否	类型：int
     * 第三方预计送达时间 时间戳（10 位) 用于展示第三方系统预计的送达时间
     */
    private Integer pre_deliver_times;


}

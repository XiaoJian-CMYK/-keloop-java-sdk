package io.github.oneincase.result.order;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单配送员坐标返回项
 */
@NoArgsConstructor
@Data
public class KeloopCourierTagRes {

    /**
     * 配送员在该坐标时的时间
     */
    private String gate_time;
    /**
     * 坐标经度
     */
    private String latitude;
    /**
     * 坐标纬度
     */
    private String longitude;
    /**
     * 配送员姓名
     */
    private String courier_name;
    /**
     * 配送员电话
     */
    private String courier_tel;

}

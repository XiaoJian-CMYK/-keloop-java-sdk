package io.github.oneincase.result.order;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单进程项返回项
 */
@NoArgsConstructor
@Data
public class KeloopOrderLogRes {

    /**
     * 操作时间
     */
    private String time;
    /**
     * 操作者角色，1：配送员，2：商户，3：团队
     */
    private Integer role;
    /**
     * 操作者名字
     */
    private String title;
    /**
     * 操作者的电话号码
     */
    private String name;
    /**
     * 操作描述
     */
    private String tel;

}

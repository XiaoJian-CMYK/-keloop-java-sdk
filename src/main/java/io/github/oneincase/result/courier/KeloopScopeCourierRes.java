package io.github.oneincase.result.courier;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 指定范围配送员返回项
 */
@NoArgsConstructor
@Data
public class KeloopScopeCourierRes {

    /**
     * 指定公里内在线配送员总数
     */
    private String total;
    /**
     * 指定公里内在线配送员列表
     */
    private List<Couriers> couriers;

    @NoArgsConstructor
    @Data
    public static class Couriers {
        /**
         * 配送员id
         */
        private String courier_id;
        /**
         * 配送员名称
         */
        private String courier_name;
        /**
         * 配送员坐标 火星坐标
         */
        private String courier_tag;
    }

}

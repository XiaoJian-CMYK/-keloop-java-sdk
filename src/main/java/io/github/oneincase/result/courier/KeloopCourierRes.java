package io.github.oneincase.result.courier;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 获取所有配送员列表项
 */
@NoArgsConstructor
@Data
public class KeloopCourierRes {
    /**
     * 快跑者配送员ID
     */
    private String courier_id;
    /**
     * 快跑者配送员联系电话
     */
    private String courier_tel;
    /**
     * 快跑者配送员名称
     */
    private String courier_name;
}

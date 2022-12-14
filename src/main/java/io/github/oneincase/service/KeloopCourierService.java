package io.github.oneincase.service;

import io.github.oneincase.core.KeloopRes;

/**
 * 快跑者配送员相关接口
 */
public interface KeloopCourierService {

    /**
     * 获取所有配送员
     * 获取团队合作的配送员列表
     */
    KeloopRes getCouriers();

    /**
     * 获取指定范围配送员
     * 获取指定位置附加的在线配送员信息
     *
     * @param radius 搜索范围大小，最大5km
     * @param center 搜索位置中心坐标火星坐标
     */
    KeloopRes getNearCouriers(Float radius, String center);

}

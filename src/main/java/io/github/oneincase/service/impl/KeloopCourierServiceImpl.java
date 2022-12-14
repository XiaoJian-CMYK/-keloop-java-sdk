package io.github.oneincase.service.impl;

import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.enums.CourierUrlEnum;
import io.github.oneincase.service.KeloopBaseService;
import io.github.oneincase.service.KeloopCourierService;

import java.util.HashMap;
import java.util.Map;

public class KeloopCourierServiceImpl implements KeloopCourierService {

    private final KeloopBaseService keloopBaseService;

    public KeloopCourierServiceImpl(KeloopBaseService keloopBaseService) {
        this.keloopBaseService = keloopBaseService;
    }

    /**
     * 获取所有配送员
     * 获取团队合作的配送员列表
     */
    @Override
    public KeloopRes getCouriers() {
        return keloopBaseService.http(CourierUrlEnum.GET_COURIERS.getUrl(), CourierUrlEnum.GET_COURIERS.getReqTypeEnum(), null);
    }

    /**
     * 获取指定范围配送员
     * 获取指定位置附加的在线配送员信息
     *
     * @param radius 搜索范围大小，最大5km
     * @param center 搜索位置中心坐标火星坐标
     */
    @Override
    public KeloopRes getNearCouriers(Float radius, String center) {
        Map<String, Object> map = new HashMap<>();
        map.put("radius", radius);
        map.put("center", center);
        return keloopBaseService.http(CourierUrlEnum.GET_NEAR_COURIERS.getUrl(), CourierUrlEnum.GET_NEAR_COURIERS.getReqTypeEnum(), map);
    }

}

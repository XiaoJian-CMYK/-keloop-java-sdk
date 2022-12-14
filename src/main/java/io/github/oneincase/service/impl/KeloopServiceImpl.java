package io.github.oneincase.service.impl;

import io.github.oneincase.service.*;

public class KeloopServiceImpl implements KeloopService {

    private final KeloopBaseService keloopBaseService;

    public KeloopServiceImpl(KeloopBaseService keloopBaseService) {
        this.keloopBaseService = keloopBaseService;
    }

    /**
     * 获取快跑者订单相关接口
     */
    @Override
    public KeloopOrderService getKeloopOrderService() {
        return new KeloopOrderServiceImpl(keloopBaseService);
    }

    /**
     * 获取快跑者团队相关接口
     */
    @Override
    public KeloopTeamService getKeloopTeamService() {
        return new KeloopTeamServiceIml(keloopBaseService);
    }

    /**
     * 获取快跑者商户相关接口
     */
    @Override
    public KeloopMerchantService getKeloopMerchantService() {
        return new KeloopMerchantServiceImpl(keloopBaseService);
    }

    /**
     * 快跑者门店相关接口
     */
    @Override
    public KeloopStoreService getKeloopStoreService() {
        return new KeloopStoreServiceImpl(keloopBaseService);
    }

    /**
     * 获取快跑者配送员相关接口
     */
    @Override
    public KeloopCourierService getKeloopCourierService() {
        return new KeloopCourierServiceImpl(keloopBaseService);
    }

}

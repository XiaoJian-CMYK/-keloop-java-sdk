package io.github.oneincase.service;

/**
 * 快跑者聚合服务接口
 */
public interface KeloopService {

    /**
     * 获取快跑者订单相关接口
     */
    KeloopOrderService getKeloopOrderService();

    /**
     * 获取快跑者团队相关接口
     */
    KeloopTeamService getKeloopTeamService();

    /**
     * 获取快跑者商户相关接口
     */
    KeloopMerchantService getKeloopMerchantService();

    /**
     * 快跑者门店相关接口
     */
    KeloopStoreService getKeloopStoreService();

    /**
     * 获取快跑者配送员相关接口
     */
    KeloopCourierService getKeloopCourierService();

}

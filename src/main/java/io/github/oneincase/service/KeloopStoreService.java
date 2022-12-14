package io.github.oneincase.service;

import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.query.store.KeloopRelateStoreQuery;
import io.github.oneincase.query.store.KeloopUpdateStoreQuery;

/**
 * 快跑者门店相关接口
 */
public interface KeloopStoreService {

    /**
     * 获取门店列表
     *
     * @param shop_id 第三方商户（平台）id
     * @return 快跑者统一相应类
     */
    KeloopRes getStores(Integer shop_id);

    /**
     * 修改门店
     *
     * @param keloopUpdateStoreQuery 修改门店请求参数
     * @return 快跑者统一相应类
     */
    KeloopRes updateStore(KeloopUpdateStoreQuery keloopUpdateStoreQuery);

    /**
     * 删除门店
     *
     * @param shop_id 第三方商户（平台）id
     * @return 快跑者统一相应类
     */
    KeloopRes delStore(String shop_id);

    /**
     * 关联门店
     *
     * @param keloopRelateStoreQuery 关联门店请求参数
     * @return 快跑者统一相应类
     */
    KeloopRes relateStore(KeloopRelateStoreQuery keloopRelateStoreQuery);

}

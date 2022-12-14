package io.github.oneincase.service.impl;

import cn.hutool.core.map.MapUtil;
import cn.hutool.json.JSONUtil;
import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.enums.StoreUrlEnum;
import io.github.oneincase.query.store.KeloopRelateStoreQuery;
import io.github.oneincase.query.store.KeloopUpdateStoreQuery;
import io.github.oneincase.service.KeloopBaseService;
import io.github.oneincase.service.KeloopStoreService;

import java.util.Map;

public class KeloopStoreServiceImpl implements KeloopStoreService {

    private final KeloopBaseService keloopBaseService;

    public KeloopStoreServiceImpl(KeloopBaseService keloopBaseService) {
        this.keloopBaseService = keloopBaseService;
    }

    /**
     * 获取门店列表
     *
     * @param shop_id 第三方商户（平台）id
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes getStores(Integer shop_id) {
        Map<String, Object> map = MapUtil.of("shop_id", shop_id);
        return keloopBaseService.http(StoreUrlEnum.GET_STORES.getUrl(), StoreUrlEnum.GET_STORES.getReqTypeEnum(), map);
    }

    /**
     * 修改门店
     *
     * @param keloopUpdateStoreQuery 修改门店请求参数
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes updateStore(KeloopUpdateStoreQuery keloopUpdateStoreQuery) {
        return keloopBaseService.http(StoreUrlEnum.UPDATE_STORE.getUrl(), StoreUrlEnum.UPDATE_STORE.getReqTypeEnum(), JSONUtil.parseObj(keloopUpdateStoreQuery));
    }

    /**
     * 删除门店
     *
     * @param shop_id 第三方商户（平台）id
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes delStore(String shop_id) {
        Map<String, Object> map = MapUtil.of("shop_id", shop_id);
        return keloopBaseService.http(StoreUrlEnum.DEL_STORE.getUrl(), StoreUrlEnum.DEL_STORE.getReqTypeEnum(), map);
    }

    /**
     * 关联门店
     *
     * @param keloopRelateStoreQuery 关联门店请求参数
     * @return 快跑者统一相应类
     */
    @Override
    public KeloopRes relateStore(KeloopRelateStoreQuery keloopRelateStoreQuery) {
        return keloopBaseService.http(StoreUrlEnum.RELATE_STORE.getUrl(), StoreUrlEnum.RELATE_STORE.getReqTypeEnum(), JSONUtil.parseObj(keloopRelateStoreQuery));
    }

}

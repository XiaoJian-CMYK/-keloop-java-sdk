package io.github.oneincase.service.impl;

import io.github.oneincase.config.BaseConfig;
import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.core.ReqBaseParams;
import io.github.oneincase.enums.ReqTypeEnum;
import io.github.oneincase.handler.HttpHandler;
import io.github.oneincase.service.KeloopBaseService;

import java.util.Map;

public class KeloopBaseServiceImpl implements KeloopBaseService {

    /**
     * 快跑者基础配置类
     */
    private final BaseConfig baseConfig;

    public KeloopBaseServiceImpl(BaseConfig baseConfig) {
        this.baseConfig = baseConfig;
    }

    @Override
    public KeloopRes http(String url, ReqTypeEnum reqTypeEnum, Map<String, Object> body) {
        return HttpHandler.http(url, reqTypeEnum, init(body), baseConfig);
    }

    public ReqBaseParams init(Map<String, Object> body) {
        ReqBaseParams params = new ReqBaseParams();
        params.setDev_key(baseConfig.getDevKey());
        params.setTeam_token(baseConfig.getTeamToken());
        params.setBody(body);
        return params;
    }

}

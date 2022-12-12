package com.github.xjc.service.impl;

import com.github.xjc.config.BaseConfig;
import com.github.xjc.core.KeloopRes;
import com.github.xjc.core.ReqBaseParams;
import com.github.xjc.enums.ReqTypeEnum;
import com.github.xjc.handler.HttpHandler;
import com.github.xjc.service.BaseService;

import java.util.Map;

public class BaseServiceImpl implements BaseService {

    /**
     * 快跑者基础配置类
     */
    private BaseConfig baseConfig;

    public BaseServiceImpl(BaseConfig baseConfig) {
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

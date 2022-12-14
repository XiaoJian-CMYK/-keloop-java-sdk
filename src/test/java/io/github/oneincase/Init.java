package io.github.oneincase;

import io.github.oneincase.config.BaseConfig;
import io.github.oneincase.service.KeloopBaseService;
import io.github.oneincase.service.impl.KeloopBaseServiceImpl;

public class Init {

    public static BaseConfig getBaseConfig() {
        return new BaseConfig().setDevKey("xxxxx")
                .setDevSecret("xxx")
                .setTeamToken("xxxxx");
    }

    public static KeloopBaseService getBaseService() {
        return new KeloopBaseServiceImpl(getBaseConfig());
    }

}

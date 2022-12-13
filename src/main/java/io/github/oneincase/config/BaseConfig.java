package io.github.oneincase.config;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 快跑者基础配置类
 */
@Data
@Accessors(chain = true)
public class BaseConfig {

    /**
     * 开发密钥
     */
    private String devKey;

    /**
     * 签名密钥
     */
    private String devSecret;

    /**
     * 团队密钥
     */
    private String teamToken;

}

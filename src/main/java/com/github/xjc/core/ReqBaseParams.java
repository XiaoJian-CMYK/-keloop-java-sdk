package com.github.xjc.core;

import lombok.Data;

import java.util.Map;
import java.util.UUID;

/**
 * 请求基础参数对象
 */
@Data
public class ReqBaseParams {

    /**
     * 版本号 默认1
     */
    private String version = "1";
    /**
     * 当前时间戳 默认当前10位时间戳
     */
    private String timestamp = String.valueOf(System.currentTimeMillis() / 1000);

    /**
     * 唯一标识符 uuid
     */
    private String ticket = UUID.randomUUID().toString().replaceAll("-", "");

    /**
     * 团队Token
     */
    private String team_token;

    /**
     * 开发者中心的开发密钥
     */
    private String dev_key;

    /**
     * 参数签名
     */
    private String sign;

    /**
     * 接口请求参数
     */
    private Map<String, Object> body;

}

package io.github.oneincase.handler;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import io.github.oneincase.config.BaseConfig;
import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.core.ReqBaseParams;
import io.github.oneincase.enums.ReqTypeEnum;
import io.github.oneincase.exception.RespException;
import io.github.oneincase.utils.SignUtils;

public class HttpHandler {

    /**
     * 请求头CONTENT_TYPE类型
     */
    private static final String CONTENT_TYPE = "application/x-www-form-urlencoded;charset=UTF-8";

    /**
     * 请求超时时间
     */
    private static final int TIMEOUT = 3000;

    /**
     * 统一请求根据枚举自动选择请求类型
     *
     * @param url           请求url
     * @param reqTypeEnum   请求类型枚举
     * @param reqBaseParams 请求基础参数对象
     * @param baseConfig    基础配置
     * @return 快跑者统一相应类
     */
    public static KeloopRes http(String url, ReqTypeEnum reqTypeEnum, ReqBaseParams reqBaseParams, BaseConfig baseConfig) {
        System.out.println(StrUtil.format("【==快跑者== 请求类型: {} ,请求地址: {}】", reqTypeEnum.name(), url));
        ReqBaseParams params = SignUtils.setSign(reqBaseParams, baseConfig);
        String body = MapUtil.join(JSONUtil.parseObj(params), "&", "=", "");
        System.out.println(StrUtil.format("【==快跑者== 请求参数: {}】", body));
        KeloopRes keloopRes = null;
        if ("GET".equals(reqTypeEnum.name())) {
            keloopRes = get(url, body);
        } else if ("POST".equals(reqTypeEnum.name())) {
            keloopRes = post(url, body);
        }
        if (keloopRes == null) throw new RespException("接口响应异常，请检查！");
        if (keloopRes.getCode() == 204) {
            throw new RespException(StrUtil.format("【==快跑者== 请求失败: {}】", keloopRes.getMessage()));
        } else {
            System.out.println(StrUtil.format("【==快跑者== 请求成功: {}】", keloopRes.getData()));
        }
        // 设置签名值
        keloopRes.setSign(params.getSign());
        return keloopRes;
    }


    /**
     * get请求
     *
     * @param url  请求url
     * @param body 请求基础参数对象
     * @return 快跑者统一相应类
     */
    private static KeloopRes get(String url, String body) {
        String res = HttpRequest.get(url)
                .header(Header.CONTENT_TYPE, CONTENT_TYPE)
                .body(body)
                .timeout(TIMEOUT)
                .execute().body();
        return JSONUtil.toBean(res, KeloopRes.class);
    }

    /**
     * get请求
     *
     * @param url 请求url
     * @return 快跑者统一相应类
     */
    private static KeloopRes post(String url, String body) {
        String res = HttpRequest.post(url)
                .header(Header.CONTENT_TYPE, CONTENT_TYPE)
                .body(body)
                .timeout(TIMEOUT)
                .execute().body();
        return JSONUtil.toBean(res, KeloopRes.class);
    }


}

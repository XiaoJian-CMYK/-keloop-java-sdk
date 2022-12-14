package io.github.oneincase.service;

import io.github.oneincase.core.KeloopRes;
import io.github.oneincase.enums.ReqTypeEnum;

import java.util.Map;

/**
 * 请求接口
 */
public interface KeloopBaseService {

    KeloopRes http(String url, ReqTypeEnum reqTypeEnum, Map<String, Object> body);

}

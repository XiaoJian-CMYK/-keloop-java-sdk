package com.github.xjc.service;

import com.github.xjc.core.KeloopRes;
import com.github.xjc.enums.ReqTypeEnum;

import java.util.Map;

/**
 * 请求接口
 */
public interface BaseService {

    KeloopRes http(String url, ReqTypeEnum reqTypeEnum, Map<String, Object> body);

}
